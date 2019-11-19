package com.rmakiyama.motionplayground.ui.basicshared

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.rmakiyama.motionplayground.R
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.image.setOnClickListener { image ->
            val extras = FragmentNavigatorExtras(
                image to "image",
                binding.title to "title"
            )
            findNavController().navigate(R.id.to_basic_shared_next, null, null, extras)
        }
    }
}
