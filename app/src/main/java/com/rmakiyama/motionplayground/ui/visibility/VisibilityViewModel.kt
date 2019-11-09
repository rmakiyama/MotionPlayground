package com.rmakiyama.motionplayground.ui.visibility

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.transition.Transition

class VisibilityViewModel : ViewModel() {

    private val _type = MutableLiveData<VisibilityType>(VisibilityType.Default)
    val type: LiveData<VisibilityType> get() = _type

    fun setType(type: VisibilityType) {
        _type.value = type
    }

    fun getVisibilityTransition(): Transition? {
        return type.value?.transition
    }
}
