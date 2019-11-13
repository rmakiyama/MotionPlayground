package com.rmakiyama.motionplayground.ui.basicshared

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.interpolator.view.animation.FastOutSlowInInterpolator
import androidx.transition.ChangeBounds
import androidx.transition.ChangeClipBounds
import androidx.transition.ChangeImageTransform
import androidx.transition.TransitionSet
import com.rmakiyama.motionplayground.databinding.FragmentBasicSharedNextBinding

class BasicSharedNextFragment : Fragment() {

    private lateinit var binding: FragmentBasicSharedNextBinding
    private val viewModel: BasicSharedNextViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBasicSharedNextBinding.inflate(inflater, container, false)
            .apply {
                lifecycleOwner = viewLifecycleOwner
            }
        prepareTransitions()
        return binding.root
    }

    private fun prepareTransitions() {
        sharedElementEnterTransition = TransitionSet().apply {
            addTransition(ChangeImageTransform())
            addTransition(ChangeBounds())
            addTransition(ChangeClipBounds())
        }.apply {
            interpolator = FastOutSlowInInterpolator()
        }
    }
}
