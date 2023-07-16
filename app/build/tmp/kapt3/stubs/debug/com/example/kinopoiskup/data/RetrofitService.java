package com.example.kinopoiskup.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\bf\u0018\u0000 ,2\u00020\u0001:\u0001,J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J/\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001b\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ%\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u0017\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J%\u0010\u0019\u001a\u00020\u00162\b\b\u0001\u0010\u001a\u001a\u00020\b2\b\b\u0001\u0010\u001b\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ/\u0010\u001d\u001a\u00020\u00162\b\b\u0001\u0010\u001e\u001a\u00020\b2\b\b\u0001\u0010\u001f\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u001b\u0010!\u001a\u00020\u00162\b\b\u0001\u0010\u000b\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001b\u0010\"\u001a\u00020#2\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001b\u0010$\u001a\u00020%2\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ1\u0010&\u001a\u00020\u00162\u0014\b\u0001\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0(2\b\b\u0001\u0010\u000b\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u001b\u0010*\u001a\u00020\u00162\b\b\u0001\u0010\u000b\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001b\u0010+\u001a\u00020\u00162\b\b\u0001\u0010\u000b\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006-"}, d2 = {"Lcom/example/kinopoiskup/data/RetrofitService;", "", "getCountriesGenres", "Lcom/example/kinopoiskup/entity/SearchDTO;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFilmImages", "Lcom/example/kinopoiskup/entity/ImagesDTO;", "id", "", "type", "", "page", "(ILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFilmInfo", "Lcom/example/kinopoiskup/entity/FilmInfoDTO;", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFilmSeasons", "Lcom/example/kinopoiskup/entity/SeasonsDTO;", "getFilmStaff", "", "Lcom/example/kinopoiskup/entity/FilmStaffDTO;", "getFilmsByKeyword", "Lcom/example/kinopoiskup/entity/KinopoiskDTO;", "keyword", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPremieres", "year", "month", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRandom", "country", "genre", "(IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSerials", "getSimilarFilms", "Lcom/example/kinopoiskup/entity/SimilarsDTO;", "getStaffById", "Lcom/example/kinopoiskup/entity/StaffDTO;", "searchFilmsByKeyword", "params", "", "(Ljava/util/Map;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "topList", "topPopular", "Companion", "app_debug"})
public abstract interface RetrofitService {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.kinopoiskup.data.RetrofitService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_KEY3 = "c92f9a94-f068-435f-855b-a5acff019cc5";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_KEY4 = "8c5cddf6-0364-4744-a57b-5d13c7f48063";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_KEY = "70e0059c-0587-4549-9cbf-8a9c5c4143f6";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_KEY2 = "2c7d0bf6-864e-4403-a497-85dde3bc1c16";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_KEY5 = "4afdb41e-920d-4f23-bb5b-ff9015206a1b";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_KEY6 = "ca3b0d40-c9dc-4950-b32f-d4e29e560d62";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_KEY7 = "b317ee48-fb96-4de5-9fd6-eb95d9598322";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_KEY8 = "187344d2-c8a5-43e9-82e5-f574f97cc045";
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/api/v2.2/films")
    @retrofit2.http.Headers(value = {"X-API-KEY: 970d43b9-5361-4a05-919a-2e53b1c80960"})
    public abstract java.lang.Object getFilmsByKeyword(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "keyword")
    java.lang.String keyword, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskup.entity.KinopoiskDTO> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/api/v2.2/films")
    @retrofit2.http.Headers(value = {"X-API-KEY: 970d43b9-5361-4a05-919a-2e53b1c80960"})
    public abstract java.lang.Object searchFilmsByKeyword(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap(encoded = false)
    java.util.Map<java.lang.String, java.lang.String> params, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskup.entity.KinopoiskDTO> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/api/v2.2/films/filters")
    @retrofit2.http.Headers(value = {"X-API-KEY: 970d43b9-5361-4a05-919a-2e53b1c80960"})
    public abstract java.lang.Object getCountriesGenres(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskup.entity.SearchDTO> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/api/v2.2/films/{id}")
    @retrofit2.http.Headers(value = {"X-API-KEY: 970d43b9-5361-4a05-919a-2e53b1c80960"})
    public abstract java.lang.Object getFilmInfo(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskup.entity.FilmInfoDTO> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/api/v2.2/films/{id}/similars")
    @retrofit2.http.Headers(value = {"X-API-KEY: 970d43b9-5361-4a05-919a-2e53b1c80960"})
    public abstract java.lang.Object getSimilarFilms(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskup.entity.SimilarsDTO> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/api/v2.2/films/{id}/images")
    @retrofit2.http.Headers(value = {"X-API-KEY: 970d43b9-5361-4a05-919a-2e53b1c80960"})
    public abstract java.lang.Object getFilmImages(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "type")
    java.lang.String type, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskup.entity.ImagesDTO> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/api/v2.2/films/{id}/seasons")
    @retrofit2.http.Headers(value = {"X-API-KEY: 970d43b9-5361-4a05-919a-2e53b1c80960"})
    public abstract java.lang.Object getFilmSeasons(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskup.entity.SeasonsDTO> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/api/v1/staff/{id}")
    @retrofit2.http.Headers(value = {"X-API-KEY: 970d43b9-5361-4a05-919a-2e53b1c80960"})
    public abstract java.lang.Object getStaffById(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskup.entity.StaffDTO> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/api/v1/staff")
    @retrofit2.http.Headers(value = {"X-API-KEY: 970d43b9-5361-4a05-919a-2e53b1c80960"})
    public abstract java.lang.Object getFilmStaff(@retrofit2.http.Query(value = "filmId")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.kinopoiskup.entity.FilmStaffDTO>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/api/v2.2/films/premieres")
    @retrofit2.http.Headers(value = {"X-API-KEY: 970d43b9-5361-4a05-919a-2e53b1c80960"})
    public abstract java.lang.Object getPremieres(@retrofit2.http.Query(value = "year")
    int year, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "month")
    java.lang.String month, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskup.entity.KinopoiskDTO> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/api/v2.2/films/top?type=TOP_250_BEST_FILMS")
    @retrofit2.http.Headers(value = {"X-API-KEY: 970d43b9-5361-4a05-919a-2e53b1c80960"})
    public abstract java.lang.Object topList(@retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskup.entity.KinopoiskDTO> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/api/v2.2/films/top?type=TOP_100_POPULAR_FILMS")
    @retrofit2.http.Headers(value = {"X-API-KEY: 970d43b9-5361-4a05-919a-2e53b1c80960"})
    public abstract java.lang.Object topPopular(@retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskup.entity.KinopoiskDTO> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/api/v2.2/films?ratingFrom=4&ratingTo=8&type=TV_SERIES")
    @retrofit2.http.Headers(value = {"X-API-KEY: 970d43b9-5361-4a05-919a-2e53b1c80960"})
    public abstract java.lang.Object getSerials(@retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskup.entity.KinopoiskDTO> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/api/v2.2/films?ratingFrom=5&ratingTo=10")
    @retrofit2.http.Headers(value = {"X-API-KEY: 970d43b9-5361-4a05-919a-2e53b1c80960"})
    public abstract java.lang.Object getRandom(@retrofit2.http.Query(value = "countries")
    int country, @retrofit2.http.Query(value = "genres")
    int genre, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kinopoiskup.entity.KinopoiskDTO> continuation);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/kinopoiskup/data/RetrofitService$Companion;", "", "()V", "API_KEY", "", "API_KEY2", "API_KEY3", "API_KEY4", "API_KEY5", "API_KEY6", "API_KEY7", "API_KEY8", "BASE_URL", "api_key", "create", "Lcom/example/kinopoiskup/data/RetrofitService;", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String API_KEY3 = "c92f9a94-f068-435f-855b-a5acff019cc5";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String API_KEY4 = "8c5cddf6-0364-4744-a57b-5d13c7f48063";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String API_KEY = "70e0059c-0587-4549-9cbf-8a9c5c4143f6";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String API_KEY2 = "2c7d0bf6-864e-4403-a497-85dde3bc1c16";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String API_KEY5 = "4afdb41e-920d-4f23-bb5b-ff9015206a1b";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String API_KEY6 = "ca3b0d40-c9dc-4950-b32f-d4e29e560d62";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String API_KEY7 = "b317ee48-fb96-4de5-9fd6-eb95d9598322";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String API_KEY8 = "187344d2-c8a5-43e9-82e5-f574f97cc045";
        private static final java.lang.String api_key = "970d43b9-5361-4a05-919a-2e53b1c80960";
        private static final java.lang.String BASE_URL = "https://kinopoiskapiunofficial.tech";
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.kinopoiskup.data.RetrofitService create() {
            return null;
        }
    }
}