package com.example.kinopoiskup.data


import com.example.kinopoiskup.entity.*
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

interface RetrofitService {

    @Headers("X-API-KEY: $api_key")
    @GET("/api/v2.2/films")
    suspend fun getFilmsByKeyword(@Query("keyword") keyword: String, @Query("page") page: Int): KinopoiskDTO
    @Headers("X-API-KEY: $api_key")
    @GET("/api/v2.2/films")
    suspend fun searchFilmsByKeyword(@QueryMap(encoded=false) params: Map<String, String>, @Query("page") page: Int): KinopoiskDTO

    @Headers("X-API-KEY: $api_key")
    @GET("/api/v2.2/films/filters")
    suspend fun getCountriesGenres(): SearchDTO

    @Headers("X-API-KEY: $api_key")
    @GET("/api/v2.2/films/{id}")
    suspend fun getFilmInfo( @Path("id") id: Int): FilmInfoDTO

    @Headers("X-API-KEY: $api_key")
    @GET("/api/v2.2/films/{id}/similars")
    suspend fun getSimilarFilms( @Path("id") id: Int): SimilarsDTO

    @Headers("X-API-KEY: $api_key")
    @GET("/api/v2.2/films/{id}/images")
    suspend fun getFilmImages( @Path("id") id: Int, @Query("type") type: String, @Query("page") page: Int): ImagesDTO

    @Headers("X-API-KEY: $api_key")
    @GET("/api/v2.2/films/{id}/seasons")
    suspend fun getFilmSeasons( @Path("id") id: Int): SeasonsDTO

    @Headers("X-API-KEY: $api_key")
    @GET("/api/v1/staff/{id}")
    suspend fun getStaffById( @Path("id") id: Int): StaffDTO

    @Headers("X-API-KEY: $api_key")
    @GET("/api/v1/staff")
    suspend fun getFilmStaff(@Query("filmId") id: Int): List<FilmStaffDTO>

    @Headers("X-API-KEY: $api_key")
    @GET("/api/v2.2/films/premieres")
    suspend fun getPremieres(@Query("year") year: Int, @Query("month") month: String): KinopoiskDTO

    @Headers("X-API-KEY: $api_key")
    @GET("/api/v2.2/films/top?type=TOP_250_BEST_FILMS")
    suspend fun topList(@Query("page") page: Int): KinopoiskDTO

    @Headers("X-API-KEY: $api_key")
    @GET("/api/v2.2/films/top?type=TOP_100_POPULAR_FILMS")
    suspend fun topPopular(@Query("page") page: Int): KinopoiskDTO

    @Headers("X-API-KEY: $api_key")
    @GET("/api/v2.2/films?ratingFrom=4&ratingTo=8&type=TV_SERIES")
    suspend fun getSerials(@Query("page") page: Int): KinopoiskDTO


    @Headers("X-API-KEY: $api_key")
    @GET("/api/v2.2/films?ratingFrom=5&ratingTo=10")
    suspend fun getRandom(@Query("countries") country: Int, @Query("genres") genre: Int, @Query("page") page: Int): KinopoiskDTO

    companion object {
        const val API_KEY3= "c92f9a94-f068-435f-855b-a5acff019cc5"
        const val API_KEY4 = "8c5cddf6-0364-4744-a57b-5d13c7f48063"
        const val API_KEY = "70e0059c-0587-4549-9cbf-8a9c5c4143f6"
        const val API_KEY2= "2c7d0bf6-864e-4403-a497-85dde3bc1c16"
        const val API_KEY5= "4afdb41e-920d-4f23-bb5b-ff9015206a1b"
        const val API_KEY6= "ca3b0d40-c9dc-4950-b32f-d4e29e560d62"
        const val API_KEY7= "b317ee48-fb96-4de5-9fd6-eb95d9598322"
        const val API_KEY8= "187344d2-c8a5-43e9-82e5-f574f97cc045"


        private const val api_key = "970d43b9-5361-4a05-919a-2e53b1c80960"    //"c95ee258-72ee-449e-9db9-0aa97db4b59a" // "686b2399-d36a-4b2c-afec-95732d8a0e96" // "970d43b9-5361-4a05-919a-2e53b1c80960" //"e8676ee7-cdeb-4577-867d-aa177bb0841c"
        private const val BASE_URL = "https://kinopoiskapiunofficial.tech"

        fun create(): RetrofitService {
            val logger =
                HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BASIC }

            val client = OkHttpClient.Builder()
                .addInterceptor(logger)
                .build()

            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(RetrofitService::class.java)
        }

    }
}
