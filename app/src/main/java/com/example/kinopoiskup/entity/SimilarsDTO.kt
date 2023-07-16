package com.example.kinopoiskup.entity

import com.google.gson.annotations.SerializedName

data class SimilarsDTO(
    @SerializedName("total") var total: Int? = null,
    @SerializedName("items") var items: List<SimilarItems> = arrayListOf()
)

data class SimilarItems(
    @SerializedName("filmId") var filmId: Int? = null,
    @SerializedName("nameRu") var nameRu: String? = null,
    @SerializedName("nameEn") var nameEn: String? = null,
    @SerializedName("nameOriginal") var nameOriginal: String? = null,
    @SerializedName("posterUrl") var posterUrl: String? = null,
    @SerializedName("posterUrlPreview") var posterUrlPreview: String? = null,
    @SerializedName("relationType") var relationType: String? = null
)