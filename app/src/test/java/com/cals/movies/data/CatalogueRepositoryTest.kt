@file:Suppress("DEPRECATION")

package com.cals.movies.data

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.cals.movies.DataStatic
import com.cals.movies.data.source.remote.RemoteDataSource
import com.cals.movies.utils.LiveDataTestUtil
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.doAnswer
import junit.framework.Assert.assertEquals
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito

class CatalogueRepositoryTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private val remote = Mockito.mock(RemoteDataSource::class.java)
    private val catalogueRepository = FakeCatalogueRepository(remote)

    private val movieResponses = DataStatic.generateRemoteDataMovie()
    private val movie_id = movieResponses[0].id
    private val tvShowResponses = DataStatic.generateRemoteDataTvShow()
    private val tvShow_id = tvShowResponses[0].id



    @Test
    fun getAllMovies() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadMovieCallback)
                .onAllMovieReceived(movieResponses)
            null
        }.`when`(remote).getAllMovies(any())
        val moviesEntities = LiveDataTestUtil.getValue(catalogueRepository.getAllMovies())
        Mockito.verify(remote).getAllMovies(any())
        Assert.assertNotNull(moviesEntities)
        assertEquals(movieResponses.size.toLong(), moviesEntities.size.toLong())
    }

    @Test
    fun getAllTvShow() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadTvShowCallback)
                .onAllTvShowReceived(tvShowResponses)
            null
        }.`when`(remote).getAllTvShow(any())
        val tvShowEntities = LiveDataTestUtil.getValue(catalogueRepository.getAllTvShow())
        Mockito.verify(remote).getAllTvShow(any())
        Assert.assertNotNull(tvShowEntities)
        assertEquals(tvShowResponses.size.toLong(), tvShowEntities.size.toLong())

    }

    @Test
    fun getMoviesDetail() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadMovieCallback)
                .onAllMovieReceived(movieResponses)
            null
        }.`when`(remote).getAllMovies(any())

        val movieEntities = LiveDataTestUtil.getValue(catalogueRepository.getMoviesDetail(movie_id))

        Mockito.verify(remote).getAllMovies(any())

        Assert.assertNotNull(movieEntities)
        Assert.assertNotNull(movieEntities.movie_id)
        Assert.assertNotNull(movieResponses[0].id, movieEntities.movie_id)
    }

    @Test
    fun getTvShowDetail() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadTvShowCallback)
                .onAllTvShowReceived(tvShowResponses)
            null
        }.`when`(remote).getAllTvShow(any())

        val tvShowEntities = LiveDataTestUtil.getValue(catalogueRepository.getTvShowDetail(tvShow_id))

        Mockito.verify(remote).getAllTvShow(any())

        Assert.assertNotNull(tvShowEntities)
        Assert.assertNotNull(tvShowEntities.tvshow_id)
        Assert.assertNotNull(tvShowResponses[0].id, tvShowEntities.tvshow_id)
    }
}