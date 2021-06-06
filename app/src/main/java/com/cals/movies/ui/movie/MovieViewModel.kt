package com.cals.movies.ui.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.cals.movies.data.source.local.entity.MovieEntity
import com.cals.movies.data.source.CatalogueRepository

class MovieViewModel (private val catalogueRepository: CatalogueRepository) : ViewModel() {
    fun getMovies(): LiveData<List<MovieEntity>> = catalogueRepository.getAllMovies()
}
