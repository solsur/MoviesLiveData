package com.cals.movies.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.cals.movies.data.source.CatalogueDataSource
import com.cals.movies.data.source.local.entity.MovieEntity
import com.cals.movies.data.source.local.entity.TvShowEntity
import com.cals.movies.data.source.remote.RemoteDataSource
import com.cals.movies.data.source.remote.response.MovieResponse
import com.cals.movies.data.source.remote.response.TvShowResponse
import kotlin.collections.ArrayList

class FakeCatalogueRepository (private val remoteDataSource: RemoteDataSource) : CatalogueDataSource {

    override fun getAllMovies(): LiveData<List<MovieEntity>> {
        val movieResults = MutableLiveData<List<MovieEntity>>()
        remoteDataSource.getAllMovies(object: RemoteDataSource.LoadMovieCallback{
            override fun onAllMovieReceived(movieResponses: List<MovieResponse>) {
                val movieList = ArrayList<MovieEntity>()
                for (response in movieResponses) {
                    val movie = MovieEntity(
                        response.id,
                        response.title,
                        response.description,
                        response.release_date,
                        response.img_poster)
                    movieList.add(movie)
                }
                movieResults.postValue(movieList)
            }

        })
        return movieResults

    }

    override fun getAllTvShow(): LiveData<List<TvShowEntity>> {
        val tvShowResults = MutableLiveData<List<TvShowEntity>>()
        remoteDataSource.getAllTvShow(object: RemoteDataSource.LoadTvShowCallback{
            override fun onAllTvShowReceived(tvShowResponses: List<TvShowResponse>) {
                val tvShowList = ArrayList<TvShowEntity>()
                for (response in tvShowResponses) {
                    val tvShow = TvShowEntity(
                        response.id,
                        response.title,
                        response.description,
                        response.release_date,
                        response.img_poster)
                    tvShowList.add(tvShow)
                }
                tvShowResults.postValue(tvShowList)
            }

        })
        return tvShowResults
    }

    override fun getMoviesDetail(movie_id: String): LiveData<MovieEntity> {
        val movieResults = MutableLiveData<MovieEntity>()
        remoteDataSource.getAllMovies(object: RemoteDataSource.LoadMovieCallback{
            override fun onAllMovieReceived(movieResponses: List<MovieResponse>) {
                lateinit var detailMovie: MovieEntity
                for (response in movieResponses) {
                    if (response.id == movie_id) {
                        detailMovie = MovieEntity(response.id,
                            response.title,
                            response.description,
                            response.release_date,
                            response.img_poster)
                    }
                }
                movieResults.postValue(detailMovie)
            }

        })

        return movieResults
    }


    override fun getTvShowDetail(tvshow_id: String): LiveData<TvShowEntity> {
        val tvShowResults = MutableLiveData<TvShowEntity>()
        remoteDataSource.getAllTvShow(object : RemoteDataSource.LoadTvShowCallback{
            override fun onAllTvShowReceived(tvShowResponses: List<TvShowResponse>) {
                lateinit var detailTvShow: TvShowEntity
                for (response in tvShowResponses) {
                    if (response.id == tvshow_id) {
                        detailTvShow = TvShowEntity(response.id,
                            response.title,
                            response.description,
                            response.release_date,
                            response.img_poster)
                    }
                }
                tvShowResults.postValue(detailTvShow)
            }
        })
        return tvShowResults
    }
}