package com.rmakiyama.motionplayground.ui.transitionset

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.rmakiyama.motionplayground.R

class TransitionSetFragment : Fragment() {

    private val viewModel: TransitionSetViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_transition_set, container, false)
    }
}
