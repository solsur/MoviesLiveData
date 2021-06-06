package com.cals.movies.utils

import android.content.Context
import com.cals.movies.data.source.remote.response.MovieResponse
import com.cals.movies.data.source.remote.response.TvShowResponse
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException

data class JsonHelper(private val context: Context){
    private fun parsingFileToString(fileName: String): String? {
        return try {
            val `is` = context.assets.open(fileName)
            val buffer = ByteArray(`is`.available())
            `is`.read(buffer)
            `is`.close()
            String(buffer)

        } catch (ex: IOException) {
            ex.printStackTrace()
            null
        }
    }

    fun loadMovies(): List<MovieResponse> {
        val list = ArrayList<MovieResponse>()
        try {
            val responseObject = JSONObject(parsingFileToString("MovieResponse.json").toString())
            val listArray = responseObject.getJSONArray("movie")
            for (i in 0 until listArray.length()) {
                val movie = listArray.getJSONObject(i)

                val id = movie.getString("id")
                val title = movie.getString("title")
                val description = movie.getString("description")
                val release_date = movie.getString("release_date")
                val poster_path = movie.getString("poster_path")

                val movieResponse = MovieResponse(id, title, description, release_date, poster_path)
                list.add(movieResponse)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }

        return list
    }

    fun loadTvShows(): List<TvShowResponse> {
        val list = ArrayList<TvShowResponse>()
        try {
            val responseObject = JSONObject(parsingFileToString("TvResponse.json").toString())
            val listArray = responseObject.getJSONArray("tv_show")
            for (i in 0 until listArray.length()) {
                val course = listArray.getJSONObject(i)

                val id = course.getString("id")
                val title = course.getString("title")
                val description = course.getString("description")
                val release_date = course.getString("release_date")
                val poster_path = course.getString("poster_path")

                val tvShowResponse = TvShowResponse(id, title, description, release_date, poster_path)
                list.add(tvShowResponse)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }

        return list
    }
}