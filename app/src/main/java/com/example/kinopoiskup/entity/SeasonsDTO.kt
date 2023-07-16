package com.example.kinopoiskup.entity

import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.RawValue

data class SeasonsDTO(
    @SerializedName("total") var total: Int? = null,
    @SerializedName("items") var items: ArrayList<SeasonItems> = arrayListOf()
)

data class SeasonItems(
    @SerializedName("number") var number: Int? = null,
    @SerializedName("episodes") var episodes: ArrayList<Episodes> = arrayListOf()
)

data class Episodes(
    @SerializedName("seasonNumber") var seasonNumber: Int? = null,
    @SerializedName("episodeNumber") var episodeNumber: Int? = null,
    @SerializedName("nameRu") var nameRu: String? = null,
    @SerializedName("nameEn") var nameEn: String? = null,
    @SerializedName("synopsis") var synopsis: String? = null,
    @SerializedName("releaseDate") var releaseDate: String? = null
)