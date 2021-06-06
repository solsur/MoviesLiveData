package com.cals.movies.ui.detail

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.cals.movies.R
import com.cals.movies.data.source.local.entity.MovieEntity
import com.cals.movies.data.source.local.entity.TvShowEntity
import com.cals.movies.databinding.ActivityDetailBinding
import com.cals.movies.databinding.ContentDetailBinding
import com.cals.movies.viewmodel.ViewModelFactory
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_MOVIE = "extra_movie"
        const val EXTRA_TVSHOW = "extra_tvshow"
    }

    private lateinit var contentDetailBinding: ContentDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityDetailBinding = ActivityDetailBinding.inflate(layoutInflater)
        contentDetailBinding = activityDetailBinding.detailContent

        setContentView(activityDetailBinding.root)

        setSupportActionBar(activityDetailBinding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val factory = ViewModelFactory.getInstance(this)
        val viewModel = ViewModelProvider(this, factory)[DetailViewModel::class.java]
        val extras = intent.extras
        if (extras != null) {
            val movie_id = extras.getString(EXTRA_MOVIE)
            val tvshow_id = extras.getString(EXTRA_TVSHOW)

            if (movie_id != null) {
                progress_bar.visibility = View.VISIBLE
                detail_content.visibility = View.INVISIBLE

                viewModel.setSelectedMovie(movie_id)
                viewModel.getDetail().observe(this, {
                    progress_bar.visibility = View.GONE
                    detail_content.visibility = View.VISIBLE
                    detailMovie(it) })
            }
            else if (tvshow_id != null) {

                progress_bar.visibility = View.VISIBLE
                detail_content.visibility = View.INVISIBLE

                viewModel.setSelectedTvShow(tvshow_id)
                viewModel.getDetailTvShow().observe(this, {
                    progress_bar.visibility = View.GONE
                    detail_content.visibility = View.VISIBLE
                    detailTvShow(it) })
            }
        }
    }

    private fun detailMovie(movieEntity: MovieEntity) {
        contentDetailBinding.tvItemTitle.text = movieEntity.title
        contentDetailBinding.tvItemRelease.text = movieEntity.release_date
        contentDetailBinding.tvItemOverview.text = movieEntity.description


        Glide.with(this)
            .load(movieEntity.img_poster)
            .transform(RoundedCorners(20))
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_loader)
                .error(R.drawable.ic_error))
            .into(contentDetailBinding.imgDetail)
    }

    private fun detailTvShow(tvShowEntity: TvShowEntity) {
        contentDetailBinding.tvItemTitle.text = tvShowEntity.title
        contentDetailBinding.tvItemRelease.text = tvShowEntity.release_date
        contentDetailBinding.tvItemOverview.text = tvShowEntity.description


        Glide.with(this)
            .load(tvShowEntity.img_poster)
            .transform(RoundedCorners(20))
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_loader)
                    .error(R.drawable.ic_error))
            .into(contentDetailBinding.imgDetail)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}