package com.rmakiyama.motionplayground.ui.normalsharedelement

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.rmakiyama.motionplayground.databinding.FragmentNormalSharedElementBinding

internal class NormalSharedElementFragment : Fragment() {

    private lateinit var binding: FragmentNormalSharedElementBinding
    private val viewModel: NormalSharedElementViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNormalSharedElementBinding.inflate(inflater, container, false)
            .apply {
                lifecycleOwner = viewLifecycleOwner
            }
        return binding.root
    }
}
