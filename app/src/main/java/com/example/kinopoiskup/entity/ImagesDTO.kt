package com.example.kinopoiskup.entity

import com.google.gson.annotations.SerializedName

data class ImagesDTO(
    @SerializedName("total") var total: Int? = null,
    @SerializedName("totalPages") var totalPages: Int? = null,
    @SerializedName("items") var items: List<ImageItems> = arrayListOf()
)

data class ImageItems(
    @SerializedName("imageUrl") var imageUrl: String? = null,
    @SerializedName("previewUrl") var previewUrl: String? = null
)