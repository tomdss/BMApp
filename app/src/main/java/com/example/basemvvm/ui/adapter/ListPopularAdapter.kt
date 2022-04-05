package com.example.basemvvm.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.basemvvm.data.model.movie.Result
import com.example.basemvvm.databinding.ItemMovieBinding

class ListPopularAdapter :
    ListAdapter<Result, ListPopularAdapter.PopularViewHolder>(PopularDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        return PopularViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    class PopularViewHolder private constructor(val binding: ItemMovieBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Result) {
            binding.movie = item
        }

        companion object {
            fun from(parent: ViewGroup): PopularViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemMovieBinding.inflate(layoutInflater, parent, false)
                return PopularViewHolder(binding)
            }
        }

    }
}

class PopularDiffCallback : DiffUtil.ItemCallback<Result>() {
    override fun areItemsTheSame(oldItem: Result, newItem: Result): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Result, newItem: Result): Boolean {
        return oldItem == newItem
    }

}
