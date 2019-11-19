package com.rmakiyama.motionplayground.ui.transitionset

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.transition.Fade
import androidx.transition.Slide
import androidx.transition.TransitionInflater
import androidx.transition.TransitionSet
import com.rmakiyama.motionplayground.R
import com.rmakiyama.motionplayground.databinding.FragmentTransitionSetBinding

class TransitionSetFragment : Fragment() {

    private lateinit var binding: FragmentTransitionSetBinding
    private val viewModel: TransitionSetViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTransitionSetBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setAnimation()
    }

    private fun setAnimation() {
        enterTransition = TransitionInflater
            .from(context).inflateTransition(R.transition.transition_set_enter)
        returnTransition = TransitionSet()
            .addTransition(Fade().apply { duration = 150L })
            .addTransition(Slide(Gravity.END))
    }
}
