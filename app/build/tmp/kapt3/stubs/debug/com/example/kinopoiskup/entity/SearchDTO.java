package com.example.kinopoiskup.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J)\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lcom/example/kinopoiskup/entity/SearchDTO;", "", "genres", "", "Lcom/example/kinopoiskup/entity/Genres;", "countries", "Lcom/example/kinopoiskup/entity/Countries;", "(Ljava/util/List;Ljava/util/List;)V", "getCountries", "()Ljava/util/List;", "setCountries", "(Ljava/util/List;)V", "getGenres", "setGenres", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class SearchDTO {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "genres")
    private java.util.List<com.example.kinopoiskup.entity.Genres> genres;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "countries")
    private java.util.List<com.example.kinopoiskup.entity.Countries> countries;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kinopoiskup.entity.SearchDTO copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.Genres> genres, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.Countries> countries) {
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
    
    public SearchDTO() {
        super();
    }
    
    public SearchDTO(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.Genres> genres, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.Countries> countries) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskup.entity.Genres> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskup.entity.Genres> getGenres() {
        return null;
    }
    
    public final void setGenres(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.Genres> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskup.entity.Countries> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskup.entity.Countries> getCountries() {
        return null;
    }
    
    public final void setCountries(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.Countries> p0) {
    }
}