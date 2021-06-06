package com.cals.movies.ui.movie

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.cals.movies.R
import com.cals.movies.data.source.local.entity.MovieEntity
import com.cals.movies.databinding.CardItemBinding
import com.cals.movies.ui.detail.DetailActivity

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {
    private var listMovie = ArrayList<MovieEntity>()

    fun setMovies(movies: List<MovieEntity>?) {
        if (movies == null) return
        this.listMovie.clear()
        this.listMovie.addAll(movies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val cardItemBinding = CardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(cardItemBinding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val course = listMovie[position]
        holder.bind(course)
    }

    override fun getItemCount(): Int = listMovie.size


    class MovieViewHolder(private val binding: CardItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: MovieEntity) {
            with(binding) {
                tvTitle.text = movie.title
                tvRelease.text = movie.release_date
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_MOVIE, movie.movie_id)
                    itemView.context.startActivity(intent)
                }

                Glide.with(itemView.context)
                    .load(movie.img_poster)
                    .transform(RoundedCorners(20))
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loader)
                            .error(R.drawable.ic_error)
                    )
                    .into(imgUser)
            }
        }


    }
}