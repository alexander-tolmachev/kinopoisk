package com.example.kinopoiskup.entity

import okhttp3.HttpUrl

data class RequestStatus (
    val responseCode : Int,
    var responseMessage: String,
    var responseUri: HttpUrl,
    var responseStatus: Boolean
)