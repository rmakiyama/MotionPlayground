package com.rmakiyama.motionplayground.model

import androidx.recyclerview.widget.DiffUtil

data class Playground(
    val title: String,
    val summary: String
)

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
