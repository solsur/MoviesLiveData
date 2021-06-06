package com.cals.movies.data.source.remote

import android.os.Handler
import android.os.Looper
import com.cals.movies.data.source.remote.response.MovieResponse
import com.cals.movies.data.source.remote.response.TvShowResponse
import com.cals.movies.utils.EspressoIdlingResource
import com.cals.movies.utils.JsonHelper

class RemoteDataSource private constructor(private val jsonHelper: JsonHelper) {

    private val handler = Handler(Looper.getMainLooper())

    companion object {

        private const val SERVICE_LATENCY_IN_MILLIS: Long = 2000

        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(helper: JsonHelper): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource(helper).apply { instance = this }
            }
    }

    fun getAllMovies(callback: LoadMovieCallback){
        EspressoIdlingResource.increment()
        handler.postDelayed({
            callback.onAllMovieReceived(jsonHelper.loadMovies())
            EspressoIdlingResource.decrement()
        }, SERVICE_LATENCY_IN_MILLIS)
    }


    fun getAllTvShow(callback: LoadTvShowCallback){
        EspressoIdlingResource.increment()
        handler.postDelayed({
            callback.onAllTvShowReceived(jsonHelper.loadTvShows())
            EspressoIdlingResource.decrement()
        }, SERVICE_LATENCY_IN_MILLIS)
    }


    interface LoadMovieCallback {
        fun onAllMovieReceived(movieResponses: List<MovieResponse>)
    }
    interface LoadTvShowCallback {
        fun onAllTvShowReceived(tvShowResponses: List<TvShowResponse>)
    }


}