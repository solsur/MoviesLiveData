@file:Suppress("DEPRECATION")

package com.cals.movies.ui.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.cals.movies.R
import com.cals.movies.viewmodel.ViewModelFactory
import kotlinx.android.synthetic.main.fragment_movie.*


class MovieFragment : Fragment(){


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        if (activity != null) {

            val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this, factory)[MovieViewModel::class.java]

            val movieAdapter = MovieAdapter()
            val progressBar: ProgressBar = requireView().findViewById(R.id.progress_bar)
            progressBar.visibility = View.VISIBLE
            viewModel.getMovies().observe(viewLifecycleOwner, {
                progressBar.visibility = View.GONE
                movieAdapter.setMovies(it)
                movieAdapter.notifyDataSetChanged()

            })

            rv_movie.layoutManager = LinearLayoutManager(context)
            rv_movie.setHasFixedSize(true)
            rv_movie.adapter = movieAdapter
        }

    }

}