@file:Suppress("UNCHECKED_CAST")

package com.cals.movies.ui.movie

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.cals.movies.DataStatic
import com.cals.movies.data.source.CatalogueRepository
import com.cals.movies.data.source.local.entity.MovieEntity
import com.nhaarman.mockitokotlin2.verify
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MovieViewModelTest {
    private lateinit var viewModel: MovieViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var catalogueRepository: CatalogueRepository

    @Mock
    private lateinit var observer: Observer<List<MovieEntity>>

    @Before
    fun setUp() {
        viewModel = MovieViewModel(catalogueRepository)
    }

    @Test
    fun getMovies() {
        val dataStatic = DataStatic.generateStaticMovie()
        val movies = MutableLiveData<List<MovieEntity>>()
        movies.value = dataStatic

        Mockito.`when`(catalogueRepository.getAllMovies()).thenReturn(movies)
        val moviesEntities = viewModel.getMovies().value
        Mockito.verify(catalogueRepository).getAllMovies()
        Assert.assertNotNull(moviesEntities)
        Assert.assertEquals(10, moviesEntities?.size)

        viewModel.getMovies().observeForever(observer)
        verify(observer).onChanged(dataStatic)
    }
}