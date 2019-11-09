package com.rmakiyama.motionplayground.ui.playgroundlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.rmakiyama.motionplayground.databinding.ItemPlaygroundBinding
import com.rmakiyama.motionplayground.model.Playground
import com.rmakiyama.motionplayground.model.PlaygroundDiff

internal class PlaygroundListAdapter :
    ListAdapter<Playground, PlaygroundViewHolder>(PlaygroundDiff) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PlaygroundViewHolder {
        return PlaygroundViewHolder(
            ItemPlaygroundBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(
        holder: PlaygroundViewHolder,
        position: Int
    ) {
        holder.bind(getItem(position))
    }
}

internal class PlaygroundViewHolder(
    private val binding: ItemPlaygroundBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(playground: Playground) {
        binding.playground = playground
    }
}
