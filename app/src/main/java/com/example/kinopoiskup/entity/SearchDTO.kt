package com.example.kinopoiskup.entity

import com.google.gson.annotations.SerializedName

data class SearchDTO(
    @SerializedName("genres") var genres: List<Genres> = arrayListOf(),
    @SerializedName("countries") var countries: List<Countries> = arrayListOf()
)
