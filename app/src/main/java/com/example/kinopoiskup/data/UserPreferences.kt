package com.example.kinopoiskup.data

data class UserPreferences(
    val showCompleted: Boolean,
    val orderSelector: Int,
    val typeSelector: Int,
    val countrySelected: String,
    val genreSelected: String,
    val yearFirst: String,
    val yearLast: String,
    val rangeFrom: Int,
    val rangeTo: Int

)
