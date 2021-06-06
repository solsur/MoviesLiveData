package com.cals.movies.ui.tvshow

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.cals.movies.R
import com.cals.movies.data.source.local.entity.TvShowEntity
import com.cals.movies.databinding.CardItemBinding
import com.cals.movies.ui.detail.DetailActivity

class TvShowAdapter : RecyclerView.Adapter<TvShowAdapter.TvShowViewHolder>() {
    private var listTvShow = ArrayList<TvShowEntity>()

    fun setTvShows(tvshows: List<TvShowEntity>?) {
        if (tvshows == null) return
        this.listTvShow.clear()
        this.listTvShow.addAll(tvshows)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowViewHolder {
        val cardItemBinding = CardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvShowViewHolder(cardItemBinding)
    }

    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) {
        val tvshow = listTvShow[position]
        holder.bind(tvshow)
    }

    override fun getItemCount(): Int = listTvShow.size


    class TvShowViewHolder(private val binding: CardItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tvshow: TvShowEntity) {
            with(binding) {
                tvTitle.text = tvshow.title
                tvRelease.text = tvshow.release_date
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_TVSHOW, tvshow.tvshow_id)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                    .load(tvshow.img_poster)
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