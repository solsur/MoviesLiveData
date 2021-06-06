@file:Suppress("DEPRECATION")

package com.cals.movies.ui.tvshow

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
import kotlinx.android.synthetic.main.fragment_tv_show.*

class TvShowFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tv_show, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        if (activity != null) {

            val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this, factory)[TvShowViewModel::class.java]

            val tvShowAdapter = TvShowAdapter()
            val progressBar: ProgressBar = requireView().findViewById(R.id.progress_bar)
            progressBar.visibility = View.VISIBLE
            viewModel.getTvShows().observe(viewLifecycleOwner, {
                progressBar.visibility = View.GONE
                tvShowAdapter.setTvShows(it)
                tvShowAdapter.notifyDataSetChanged()
            })
            rv_tv_show.layoutManager = LinearLayoutManager(context)
            rv_tv_show.setHasFixedSize(true)
            rv_tv_show.adapter = tvShowAdapter
        }
    }
}

