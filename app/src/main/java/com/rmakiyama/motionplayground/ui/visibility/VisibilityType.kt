package com.rmakiyama.motionplayground.ui.visibility

import androidx.transition.Explode
import androidx.transition.Fade
import androidx.transition.Slide
import androidx.transition.Transition

sealed class VisibilityType(
    val transition: Transition?,
    val name: String
) {

    object Default : VisibilityType(null, "Default")
    object Slide : VisibilityType(Slide(), "Slide")
    object Fade : VisibilityType(Fade(), "Fade")
    object Explode : VisibilityType(Explode(), "Explode")

}