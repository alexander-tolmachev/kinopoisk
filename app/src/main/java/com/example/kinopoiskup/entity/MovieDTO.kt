package com.example.kinopoiskup.entity

import com.google.gson.annotations.SerializedName

data class MovieDTO(
    @SerializedName("total") var total: Int? = null,
    @SerializedName("totalPages") var totalPages: Int? = null,
    @SerializedName("items") var items: List<Items> = arrayListOf()
)

data class Items(
    @SerializedName("kinopoiskId") var kinopoiskId: Int? = null,
    @SerializedName("imdbId") var imdbId: String? = null,
    @SerializedName("nameRu") var nameRu: String? = null,
    @SerializedName("nameEn") var nameEn: String? = null,
    @SerializedName("nameOriginal") var nameOriginal: String? = null,
    @SerializedName("countries") var countries: ArrayList<Countries> = arrayListOf(),
    @SerializedName("genres") var genres: ArrayList<Genres> = arrayListOf(),
    @SerializedName("ratingKinopoisk") var ratingKinopoisk: Double? = null,
    @SerializedName("ratingImdb") var ratingImdb: Double? = null,
    @SerializedName("year") var year: Int? = null,
    @SerializedName("type") var type: String? = null,
    @SerializedName("posterUrl") var posterUrl: String? = null,
    @SerializedName("posterUrlPreview") var posterUrlPreview: String? = null
)

data class Countries(
    @SerializedName("country") var country: String? = null,
    @SerializedName("index") var index: Int = 0
)

data class Genres(
    @SerializedName("genre") var genre: String? = null,
    @SerializedName("index") var index: Int = 0
)