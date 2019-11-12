package com.rmakiyama.motionplayground.model

import androidx.recyclerview.widget.DiffUtil

sealed class Playground(
    val title: String,
    val summary: String
) {

    object Visibility: Playground("Visibility", "Visibilityを継承したクラスの基本的な動作を確認。Slide/Fade/Explodeそれぞれの動きを見てみる。")
}

object PlaygroundDiff : DiffUtil.ItemCallback<Playground>() {
    override fun areItemsTheSame(
        oldItem: Playground,
        newItem: Playground
    ): Boolean {
        return oldItem.title == newItem.title && oldItem.summary == newItem.summary
    }

    override fun areContentsTheSame(
        oldItem: Playground,
        newItem: Playground
    ): Boolean {
        return oldItem == newItem
    }
}
