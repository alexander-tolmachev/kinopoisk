package com.example.kinopoiskup.entity


import com.google.gson.annotations.SerializedName
import java.util.*

data class KinopoiskDTO(
    @SerializedName("total") var total: Int? = null,
    @SerializedName("items") var items: List<MoviesFilms> = arrayListOf(),
    @SerializedName("pagesCount") var pagesCount: Int? = null,
    @SerializedName("totalPages") var totalPages: Int? = null,
    @SerializedName("films") var films: List<MoviesFilms> = arrayListOf()
)

data class MoviesFilms(
    @SerializedName("kinopoiskId") var kinopoiskId: Int? = null,
    @SerializedName("nameRu") var nameRu: String? = null,
    @SerializedName("nameEn") var nameEn: String? = null,
    @SerializedName("year") var year: Int? = null,
    @SerializedName("posterUrl") var posterUrl: String? = null,
    @SerializedName("posterUrlPreview") var posterUrlPreview: String? = null,
    @SerializedName("countries") var countries: List<Countries> = arrayListOf(),
    @SerializedName("genres") var genres: List<Genres> = arrayListOf(),
    @SerializedName("duration") var duration: Int? = null,
    @SerializedName("premiereRu") var premiereRu: String? = null,
    @SerializedName("filmId") var filmId: Int? = null,
    @SerializedName("filmLength") var filmLength: String? = null,
    @SerializedName("rating") var rating: String? = null,
    @SerializedName("ratingVoteCount") var ratingVoteCount: Int? = null,
    @SerializedName("ratingChange") var ratingChange: String? = null,
    @SerializedName("imdbId") var imdbId: String? = null,
    @SerializedName("nameOriginal") var nameOriginal: String? = null,
    @SerializedName("ratingKinopoisk") var ratingKinopoisk: Double? = null,
    @SerializedName("ratingImdb") var ratingImdb: Double? = null,
    @SerializedName("type") var type: String? = null,
    var profession: String? = null,
    var bitmask: Long? = null
)


