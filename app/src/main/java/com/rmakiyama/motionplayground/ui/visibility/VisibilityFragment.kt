package com.rmakiyama.motionplayground.ui.visibility

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.IdRes
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.transition.TransitionManager
import com.rmakiyama.motionplayground.R
import com.rmakiyama.motionplayground.databinding.FragmentVisibilityBinding

class VisibilityFragment : Fragment() {

    private lateinit var binding: FragmentVisibilityBinding
    private val viewModel: VisibilityViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentVisibilityBinding.inflate(inflater, container, false).apply {
            lifecycleOwner = viewLifecycleOwner
            this.viewModel = this@VisibilityFragment.viewModel
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.visibleToggle.addOnButtonCheckedListener { group, _, _ ->
            if (group.checkedButtonIds.isEmpty()) {
                group.check(R.id.type_default)
                return@addOnButtonCheckedListener
            }
            when (val checkedId = group.checkedButtonId) {
                View.NO_ID -> group.check(R.id.type_default)
                else -> viewModel.setType(getVisibleType(checkedId))
            }
        }
        binding.toggle.setOnClickListener {
            if (viewModel.getVisibilityTransition() != null) {
                TransitionManager.beginDelayedTransition(
                    binding.container,
                    viewModel.getVisibilityTransition()
                )
            }
            binding.image.isInvisible = binding.image.isVisible
        }
    }

    private fun getVisibleType(@IdRes id: Int): VisibilityType {
        return when (id) {
            R.id.type_default -> VisibilityType.Default
            R.id.type_slide -> VisibilityType.Slide
            R.id.type_fade -> VisibilityType.Fade
            R.id.type_explode -> VisibilityType.Explode
            else -> VisibilityType.Default
        }
    }
}
