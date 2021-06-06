package com.cals.movies.data.source.remote.response

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieResponse(
    var id: String,
    var title: String,
    var description: String,
    var release_date: String,
    var img_poster: String
): Parcelable
