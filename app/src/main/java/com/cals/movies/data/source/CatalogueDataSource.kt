package com.cals.movies.data.source

import androidx.lifecycle.LiveData
import com.cals.movies.data.source.local.entity.MovieEntity
import com.cals.movies.data.source.local.entity.TvShowEntity

interface CatalogueDataSource {

    fun getAllMovies(): LiveData<List<MovieEntity>>

    fun getAllTvShow():LiveData<List<TvShowEntity>>

    fun getMoviesDetail(movie_id: String): LiveData<MovieEntity>

    fun getTvShowDetail(tvshow_id: String): LiveData<TvShowEntity>

}