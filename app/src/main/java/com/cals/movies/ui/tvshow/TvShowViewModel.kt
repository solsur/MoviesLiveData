package com.cals.movies.ui.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.cals.movies.data.source.CatalogueRepository
import com.cals.movies.data.source.local.entity.TvShowEntity

class TvShowViewModel (private val catalogueRepository: CatalogueRepository) : ViewModel() {
    fun getTvShows(): LiveData<List<TvShowEntity>> = catalogueRepository.getAllTvShow()
}
