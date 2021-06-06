package com.cals.movies.di

import android.content.Context
import com.cals.movies.data.source.CatalogueRepository
import com.cals.movies.data.source.remote.RemoteDataSource
import com.cals.movies.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): CatalogueRepository {

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))

        return CatalogueRepository.getInstance(remoteDataSource)
    }

}