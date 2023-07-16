package com.example.kinopoiskup.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Parcelize
data class QueryItem(
    var query: Int? = null,
    var param1: Int? = null,
    var param2: Int? = null,
    var param3: MutableMap<String, String>? = null,
    var param4: @RawValue List<MoviesFilms>? = null,
    var param5: String? = null
    ) : Parcelable
