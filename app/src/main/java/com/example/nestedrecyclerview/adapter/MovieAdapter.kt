package com.example.nestedrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.nestedrecyclerview.R
import com.example.nestedrecyclerview.databinding.MovieItemBinding
import com.example.nestedrecyclerview.model.MovieModel

class MovieAdapter (private val movieModel: List<MovieModel>):
    RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

   inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

       val binding = MovieItemBinding.bind(itemView)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item,parent,false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.binding.apply {
            imageMoviePoster.load(movieModel[position].imageUrl)
        }
    }

    override fun getItemCount(): Int {
        return movieModel.size
    }
}