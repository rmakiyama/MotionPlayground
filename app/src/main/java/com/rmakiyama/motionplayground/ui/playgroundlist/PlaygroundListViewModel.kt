package com.rmakiyama.motionplayground.ui.playgroundlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rmakiyama.motionplayground.model.Playground

class PlaygroundListViewModel : ViewModel() {

    private val _playgrounds = MutableLiveData<List<Playground>>()
    val playgrounds: LiveData<List<Playground>> = _playgrounds

    init {
        _playgrounds.value = listOf(Playground.Visibility)
    }
}
