package com.rmakiyama.motionplayground.ui.basicshared

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.rmakiyama.motionplayground.databinding.FragmentBasiclSharedElementBinding

internal class BasicSharedElementFragment : Fragment() {

    private lateinit var binding: FragmentBasiclSharedElementBinding
    private val viewModel: BasicSharedElementViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBasiclSharedElementBinding.inflate(inflater, container, false)
            .apply {
                lifecycleOwner = viewLifecycleOwner
            }
        return binding.root
    }
}
