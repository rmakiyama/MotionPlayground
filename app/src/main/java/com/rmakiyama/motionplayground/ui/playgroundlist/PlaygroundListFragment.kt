package com.rmakiyama.motionplayground.ui.playgroundlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import com.rmakiyama.motionplayground.databinding.FragmentPlaygroundListBinding

class PlaygroundListFragment : Fragment() {

    private lateinit var binding: FragmentPlaygroundListBinding
    private val viewModel: PlaygroundListViewModel by viewModels()
    private val adapter = PlaygroundListAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPlaygroundListBinding.inflate(inflater, container, false).apply {
            playgroundList.adapter = adapter
        }
        return binding.root
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        viewModel.playgrounds.observe(viewLifecycleOwner, adapter::submitList)
    }
}
