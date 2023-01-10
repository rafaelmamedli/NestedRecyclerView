package com.example.nestedrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview.R
import com.example.nestedrecyclerview.databinding.ParentItemBinding
import com.example.nestedrecyclerview.model.MainModel

class MainAdapter(private val collection: List<MainModel>): RecyclerView.Adapter<MainAdapter.CollectionViewHolder>() {

  inner  class CollectionViewHolder( itemView: View) : RecyclerView.ViewHolder(itemView) {
      val binding = ParentItemBinding.bind(itemView)
  }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectionViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.parent_item,parent,false)
        return CollectionViewHolder(view)
    }

    override fun onBindViewHolder(holder: CollectionViewHolder, position: Int) {
        holder.binding.apply {
            val collection = collection[position]
            tvGenreMovie.text = collection.title
            val movieAdapter = MovieAdapter(collection.movieModels)
            rvMovieChild.adapter = movieAdapter
        }
    }

    override fun getItemCount(): Int {
        return collection.size
    }
}