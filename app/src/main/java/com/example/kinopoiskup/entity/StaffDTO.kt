package com.example.kinopoiskup.entity

import com.google.gson.annotations.SerializedName

data class StaffDTO(
    @SerializedName("personId") var personId: Int? = null,
    @SerializedName("webUrl") var webUrl: String? = null,
    @SerializedName("nameRu") var nameRu: String? = null,
    @SerializedName("nameEn") var nameEn: String? = null,
    @SerializedName("sex") var sex: String? = null,
    @SerializedName("posterUrl") var posterUrl: String? = null,
    @SerializedName("growth") var growth: Int? = null,
    @SerializedName("birthday") var birthday: String? = null,
    @SerializedName("death") var death: String? = null,
    @SerializedName("age") var age: Int? = null,
    @SerializedName("birthplace") var birthplace: String? = null,
    @SerializedName("deathplace") var deathplace: String? = null,
    @SerializedName("hasAwards") var hasAwards: Int? = null,
    @SerializedName("profession") var profession: String? = null,
    @SerializedName("facts") var facts: ArrayList<String> = arrayListOf(),
    @SerializedName("films") var films: ArrayList<StaffFilms> = arrayListOf()
)

data class StaffFilms(
    @SerializedName("filmId") var filmId: Int? = null,
    @SerializedName("nameRu") var nameRu: String? = null,
    @SerializedName("nameEn") var nameEn: String? = null,
    @SerializedName("rating") var rating: String? = null,
    @SerializedName("general") var general: Boolean? = null,
    @SerializedName("description") var description: String? = null,
    @SerializedName("professionKey") var professionKey: String? = null
)