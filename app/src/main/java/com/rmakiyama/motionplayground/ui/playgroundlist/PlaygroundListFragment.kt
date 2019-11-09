package com.rmakiyama.motionplayground.ui.playgroundlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.rmakiyama.motionplayground.R

class PlaygroundListFragment : Fragment() {

    private val viewModel: PlaygroundListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_playground_list, container, false)
    }
}
