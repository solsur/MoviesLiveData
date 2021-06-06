@file:Suppress("DEPRECATION")

package com.cals.movies

import android.content.Context
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.cals.movies.ui.movie.MovieFragment
import com.cals.movies.ui.tvshow.TvShowFragment

class PagerAdapter(private val context: Context, fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val tabLayoutTitle = intArrayOf(
        R.string.movie,
        R.string.tv_show
    )

    override fun getCount(): Int = 2

    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? = null
        when(position){
            0 -> fragment = MovieFragment()
            1 -> fragment = TvShowFragment()
        }
        return  fragment as Fragment
    }

    @Nullable
    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(tabLayoutTitle[position])
    }
}