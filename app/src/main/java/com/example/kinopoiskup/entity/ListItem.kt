package com.example.kinopoiskup.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Parcelize
data class ListItem(
    val title: String,
    val position: Int,
    val itemsList: @RawValue List<SeasonItems>
): Parcelable
