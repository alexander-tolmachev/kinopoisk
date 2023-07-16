package com.example.kinopoiskup.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00b1\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f\u0012\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\nj\b\u0012\u0004\u0012\u00020\u000e`\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0014J\u0010\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u000b\u00105\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0019\u0010<\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fH\u00c6\u0003J\u0019\u0010=\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\nj\b\u0012\u0004\u0012\u00020\u000e`\fH\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u00ba\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\nj\b\u0012\u0004\u0012\u00020\u000e`\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010E\u001a\u00020\u0003H\u00d6\u0001J\t\u0010F\u001a\u00020\u0005H\u00d6\u0001R.\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R.\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\nj\b\u0012\u0004\u0012\u00020\u000e`\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010\u0018R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b\'\u0010!R \u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010!R \u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001f\"\u0004\b+\u0010!R \u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010!R \u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001f\"\u0004\b/\u0010!R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u0010\u001cR \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001f\"\u0004\b3\u0010!\u00a8\u0006G"}, d2 = {"Lcom/example/kinopoiskup/entity/Films;", "", "filmId", "", "nameRu", "", "nameEn", "year", "filmLength", "countries", "Ljava/util/ArrayList;", "Lcom/example/kinopoiskup/entity/Countries;", "Lkotlin/collections/ArrayList;", "genres", "Lcom/example/kinopoiskup/entity/Genres;", "rating", "ratingVoteCount", "posterUrl", "posterUrlPreview", "ratingChange", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCountries", "()Ljava/util/ArrayList;", "setCountries", "(Ljava/util/ArrayList;)V", "getFilmId", "()Ljava/lang/Integer;", "setFilmId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getFilmLength", "()Ljava/lang/String;", "setFilmLength", "(Ljava/lang/String;)V", "getGenres", "setGenres", "getNameEn", "setNameEn", "getNameRu", "setNameRu", "getPosterUrl", "setPosterUrl", "getPosterUrlPreview", "setPosterUrlPreview", "getRating", "setRating", "getRatingChange", "setRatingChange", "getRatingVoteCount", "setRatingVoteCount", "getYear", "setYear", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/example/kinopoiskup/entity/Films;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Films {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "filmId")
    private java.lang.Integer filmId;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "nameRu")
    private java.lang.String nameRu;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "nameEn")
    private java.lang.String nameEn;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "year")
    private java.lang.String year;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "filmLength")
    private java.lang.String filmLength;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "countries")
    private java.util.ArrayList<com.example.kinopoiskup.entity.Countries> countries;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "genres")
    private java.util.ArrayList<com.example.kinopoiskup.entity.Genres> genres;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "rating")
    private java.lang.String rating;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "ratingVoteCount")
    private java.lang.Integer ratingVoteCount;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "posterUrl")
    private java.lang.String posterUrl;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "posterUrlPreview")
    private java.lang.String posterUrlPreview;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "ratingChange")
    private java.lang.String ratingChange;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kinopoiskup.entity.Films copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer filmId, @org.jetbrains.annotations.Nullable()
    java.lang.String nameRu, @org.jetbrains.annotations.Nullable()
    java.lang.String nameEn, @org.jetbrains.annotations.Nullable()
    java.lang.String year, @org.jetbrains.annotations.Nullable()
    java.lang.String filmLength, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.kinopoiskup.entity.Countries> countries, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.kinopoiskup.entity.Genres> genres, @org.jetbrains.annotations.Nullable()
    java.lang.String rating, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ratingVoteCount, @org.jetbrains.annotations.Nullable()
    java.lang.String posterUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String posterUrlPreview, @org.jetbrains.annotations.Nullable()
    java.lang.String ratingChange) {
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
    
    public Films() {
        super();
    }
    
    public Films(@org.jetbrains.annotations.Nullable()
    java.lang.Integer filmId, @org.jetbrains.annotations.Nullable()
    java.lang.String nameRu, @org.jetbrains.annotations.Nullable()
    java.lang.String nameEn, @org.jetbrains.annotations.Nullable()
    java.lang.String year, @org.jetbrains.annotations.Nullable()
    java.lang.String filmLength, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.kinopoiskup.entity.Countries> countries, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.kinopoiskup.entity.Genres> genres, @org.jetbrains.annotations.Nullable()
    java.lang.String rating, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ratingVoteCount, @org.jetbrains.annotations.Nullable()
    java.lang.String posterUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String posterUrlPreview, @org.jetbrains.annotations.Nullable()
    java.lang.String ratingChange) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
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
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getYear() {
        return null;
    }
    
    public final void setYear(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFilmLength() {
        return null;
    }
    
    public final void setFilmLength(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.kinopoiskup.entity.Countries> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.kinopoiskup.entity.Countries> getCountries() {
        return null;
    }
    
    public final void setCountries(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.kinopoiskup.entity.Countries> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.kinopoiskup.entity.Genres> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.kinopoiskup.entity.Genres> getGenres() {
        return null;
    }
    
    public final void setGenres(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.kinopoiskup.entity.Genres> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
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
    public final java.lang.Integer component9() {
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
    public final java.lang.String component10() {
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
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPosterUrlPreview() {
        return null;
    }
    
    public final void setPosterUrlPreview(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRatingChange() {
        return null;
    }
    
    public final void setRatingChange(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}