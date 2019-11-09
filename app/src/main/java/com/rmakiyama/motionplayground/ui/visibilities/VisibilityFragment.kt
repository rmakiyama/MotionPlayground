package com.rmakiyama.motionplayground.ui.visibilities

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.rmakiyama.motionplayground.databinding.FragmentVisibilityBinding

class VisibilityFragment : Fragment() {

    private lateinit var binding: FragmentVisibilityBinding
    private val viewModel: VisibilityViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentVisibilityBinding.inflate(inflater, container, false)
        return binding.root
    }
}
