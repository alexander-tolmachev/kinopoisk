package com.example.kinopoiskup.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\bS\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\u0002\u0010\u001fJ\u0010\u0010Y\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010[\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010^\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u000b\u0010_\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003\u00a2\u0006\u0002\u0010MJ\u0010\u0010c\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003\u00a2\u0006\u0002\u0010MJ\u000b\u0010d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010g\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u000b\u0010h\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010i\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u000b\u0010j\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000f\u0010l\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00c6\u0003J\u000f\u0010m\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u00c6\u0003J\u0010\u0010n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u009e\u0002\u0010o\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00c6\u0001\u00a2\u0006\u0002\u0010pJ\u0013\u0010q\u001a\u00020r2\b\u0010s\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010t\u001a\u00020\u0003H\u00d6\u0001J\t\u0010u\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R \u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010&\"\u0004\b5\u0010(R \u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00101\"\u0004\b7\u00103R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\b8\u0010*\"\u0004\b9\u0010,R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u00101\"\u0004\b;\u00103R \u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u00101\"\u0004\b=\u00103R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u00101\"\u0004\b?\u00103R \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u00101\"\u0004\bA\u00103R \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u00101\"\u0004\bC\u00103R \u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u00101\"\u0004\bE\u00103R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u00101\"\u0004\bG\u00103R \u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u00101\"\u0004\bI\u00103R \u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u00101\"\u0004\bK\u00103R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010P\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010P\u001a\u0004\bQ\u0010M\"\u0004\bR\u0010OR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\bS\u0010*\"\u0004\bT\u0010,R \u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u00101\"\u0004\bV\u00103R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\bW\u0010*\"\u0004\bX\u0010,\u00a8\u0006v"}, d2 = {"Lcom/example/kinopoiskup/entity/MoviesFilms;", "", "kinopoiskId", "", "nameRu", "", "nameEn", "year", "posterUrl", "posterUrlPreview", "countries", "", "Lcom/example/kinopoiskup/entity/Countries;", "genres", "Lcom/example/kinopoiskup/entity/Genres;", "duration", "premiereRu", "filmId", "filmLength", "rating", "ratingVoteCount", "ratingChange", "imdbId", "nameOriginal", "ratingKinopoisk", "", "ratingImdb", "type", "profession", "bitmask", "", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getBitmask", "()Ljava/lang/Long;", "setBitmask", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCountries", "()Ljava/util/List;", "setCountries", "(Ljava/util/List;)V", "getDuration", "()Ljava/lang/Integer;", "setDuration", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getFilmId", "setFilmId", "getFilmLength", "()Ljava/lang/String;", "setFilmLength", "(Ljava/lang/String;)V", "getGenres", "setGenres", "getImdbId", "setImdbId", "getKinopoiskId", "setKinopoiskId", "getNameEn", "setNameEn", "getNameOriginal", "setNameOriginal", "getNameRu", "setNameRu", "getPosterUrl", "setPosterUrl", "getPosterUrlPreview", "setPosterUrlPreview", "getPremiereRu", "setPremiereRu", "getProfession", "setProfession", "getRating", "setRating", "getRatingChange", "setRatingChange", "getRatingImdb", "()Ljava/lang/Double;", "setRatingImdb", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getRatingKinopoisk", "setRatingKinopoisk", "getRatingVoteCount", "setRatingVoteCount", "getType", "setType", "getYear", "setYear", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/example/kinopoiskup/entity/MoviesFilms;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class MoviesFilms {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "kinopoiskId")
    private java.lang.Integer kinopoiskId;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "nameRu")
    private java.lang.String nameRu;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "nameEn")
    private java.lang.String nameEn;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "year")
    private java.lang.Integer year;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "posterUrl")
    private java.lang.String posterUrl;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "posterUrlPreview")
    private java.lang.String posterUrlPreview;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "countries")
    private java.util.List<com.example.kinopoiskup.entity.Countries> countries;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "genres")
    private java.util.List<com.example.kinopoiskup.entity.Genres> genres;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "duration")
    private java.lang.Integer duration;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "premiereRu")
    private java.lang.String premiereRu;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "filmId")
    private java.lang.Integer filmId;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "filmLength")
    private java.lang.String filmLength;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "rating")
    private java.lang.String rating;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "ratingVoteCount")
    private java.lang.Integer ratingVoteCount;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "ratingChange")
    private java.lang.String ratingChange;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "imdbId")
    private java.lang.String imdbId;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "nameOriginal")
    private java.lang.String nameOriginal;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "ratingKinopoisk")
    private java.lang.Double ratingKinopoisk;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "ratingImdb")
    private java.lang.Double ratingImdb;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "type")
    private java.lang.String type;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String profession;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long bitmask;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kinopoiskup.entity.MoviesFilms copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer kinopoiskId, @org.jetbrains.annotations.Nullable()
    java.lang.String nameRu, @org.jetbrains.annotations.Nullable()
    java.lang.String nameEn, @org.jetbrains.annotations.Nullable()
    java.lang.Integer year, @org.jetbrains.annotations.Nullable()
    java.lang.String posterUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String posterUrlPreview, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.Countries> countries, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.Genres> genres, @org.jetbrains.annotations.Nullable()
    java.lang.Integer duration, @org.jetbrains.annotations.Nullable()
    java.lang.String premiereRu, @org.jetbrains.annotations.Nullable()
    java.lang.Integer filmId, @org.jetbrains.annotations.Nullable()
    java.lang.String filmLength, @org.jetbrains.annotations.Nullable()
    java.lang.String rating, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ratingVoteCount, @org.jetbrains.annotations.Nullable()
    java.lang.String ratingChange, @org.jetbrains.annotations.Nullable()
    java.lang.String imdbId, @org.jetbrains.annotations.Nullable()
    java.lang.String nameOriginal, @org.jetbrains.annotations.Nullable()
    java.lang.Double ratingKinopoisk, @org.jetbrains.annotations.Nullable()
    java.lang.Double ratingImdb, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String profession, @org.jetbrains.annotations.Nullable()
    java.lang.Long bitmask) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public MoviesFilms() {
        super();
    }
    
    public MoviesFilms(@org.jetbrains.annotations.Nullable()
    java.lang.Integer kinopoiskId, @org.jetbrains.annotations.Nullable()
    java.lang.String nameRu, @org.jetbrains.annotations.Nullable()
    java.lang.String nameEn, @org.jetbrains.annotations.Nullable()
    java.lang.Integer year, @org.jetbrains.annotations.Nullable()
    java.lang.String posterUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String posterUrlPreview, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.Countries> countries, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.Genres> genres, @org.jetbrains.annotations.Nullable()
    java.lang.Integer duration, @org.jetbrains.annotations.Nullable()
    java.lang.String premiereRu, @org.jetbrains.annotations.Nullable()
    java.lang.Integer filmId, @org.jetbrains.annotations.Nullable()
    java.lang.String filmLength, @org.jetbrains.annotations.Nullable()
    java.lang.String rating, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ratingVoteCount, @org.jetbrains.annotations.Nullable()
    java.lang.String ratingChange, @org.jetbrains.annotations.Nullable()
    java.lang.String imdbId, @org.jetbrains.annotations.Nullable()
    java.lang.String nameOriginal, @org.jetbrains.annotations.Nullable()
    java.lang.Double ratingKinopoisk, @org.jetbrains.annotations.Nullable()
    java.lang.Double ratingImdb, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String profession, @org.jetbrains.annotations.Nullable()
    java.lang.Long bitmask) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getKinopoiskId() {
        return null;
    }
    
    public final void setKinopoiskId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNameRu() {
        return null;
    }
    
    public final void setNameRu(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNameEn() {
        return null;
    }
    
    public final void setNameEn(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getYear() {
        return null;
    }
    
    public final void setYear(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPosterUrl() {
        return null;
    }
    
    public final void setPosterUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPosterUrlPreview() {
        return null;
    }
    
    public final void setPosterUrlPreview(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskup.entity.Countries> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskup.entity.Countries> getCountries() {
        return null;
    }
    
    public final void setCountries(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.Countries> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskup.entity.Genres> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskup.entity.Genres> getGenres() {
        return null;
    }
    
    public final void setGenres(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.Genres> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDuration() {
        return null;
    }
    
    public final void setDuration(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPremiereRu() {
        return null;
    }
    
    public final void setPremiereRu(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getFilmId() {
        return null;
    }
    
    public final void setFilmId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFilmLength() {
        return null;
    }
    
    public final void setFilmLength(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRating() {
        return null;
    }
    
    public final void setRating(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRatingVoteCount() {
        return null;
    }
    
    public final void setRatingVoteCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRatingChange() {
        return null;
    }
    
    public final void setRatingChange(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImdbId() {
        return null;
    }
    
    public final void setImdbId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNameOriginal() {
        return null;
    }
    
    public final void setNameOriginal(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getRatingKinopoisk() {
        return null;
    }
    
    public final void setRatingKinopoisk(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getRatingImdb() {
        return null;
    }
    
    public final void setRatingImdb(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProfession() {
        return null;
    }
    
    public final void setProfession(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getBitmask() {
        return null;
    }
    
    public final void setBitmask(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
}