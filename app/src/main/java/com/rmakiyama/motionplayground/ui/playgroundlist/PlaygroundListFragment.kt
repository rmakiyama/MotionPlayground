package com.rmakiyama.motionplayground.ui.playgroundlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import com.rmakiyama.motionplayground.R
import com.rmakiyama.motionplayground.databinding.FragmentPlaygroundListBinding
import com.rmakiyama.motionplayground.model.Playground

class PlaygroundListFragment : Fragment() {

    private lateinit var binding: FragmentPlaygroundListBinding
    private val viewModel: PlaygroundListViewModel by viewModels()
    private val adapter = PlaygroundListAdapter(::showPlayground)

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

    private fun showPlayground(playground: Playground) {
        when (playground) {
            is Playground.Visibility -> findNavController().navigate(R.id.to_visibility)
            is Playground.NormalSharedElement -> findNavController().navigate(R.id.to_normal_shared_element)
            is Playground.TransitionSet -> findNavController().navigate(R.id.to_transition_set)
        }
    }
}
