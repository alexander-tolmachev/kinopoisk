package com.example.kinopoiskup.entity;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bd\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u00a2\u0006\u0002\b\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u0017\u0010\'\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0003J\u0016\u0010(\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u00a2\u0006\u0002\b\fH\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\bH\u00c6\u0003Jm\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u00a2\u0006\u0002\b\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010+J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u00d6\u0003J\t\u00101\u001a\u00020\u0003H\u00d6\u0001J\t\u00102\u001a\u00020\bH\u00d6\u0001J\u0019\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\'\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u00a2\u0006\u0002\b\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u0012\u00a8\u00068"}, d2 = {"Lcom/example/kinopoiskup/entity/QueryItem;", "Landroid/os/Parcelable;", "query", "", "param1", "param2", "param3", "", "", "param4", "", "Lcom/example/kinopoiskup/entity/MoviesFilms;", "Lkotlinx/parcelize/RawValue;", "param5", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)V", "getParam1", "()Ljava/lang/Integer;", "setParam1", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getParam2", "setParam2", "getParam3", "()Ljava/util/Map;", "setParam3", "(Ljava/util/Map;)V", "getParam4", "()Ljava/util/List;", "setParam4", "(Ljava/util/List;)V", "getParam5", "()Ljava/lang/String;", "setParam5", "(Ljava/lang/String;)V", "getQuery", "setQuery", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)Lcom/example/kinopoiskup/entity/QueryItem;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class QueryItem implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer query;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer param1;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer param2;
    @org.jetbrains.annotations.Nullable()
    private java.util.Map<java.lang.String, java.lang.String> param3;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.example.kinopoiskup.entity.MoviesFilms> param4;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String param5;
    public static final android.os.Parcelable.Creator<com.example.kinopoiskup.entity.QueryItem> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kinopoiskup.entity.QueryItem copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer query, @org.jetbrains.annotations.Nullable()
    java.lang.Integer param1, @org.jetbrains.annotations.Nullable()
    java.lang.Integer param2, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> param3, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.kinopoiskup.entity.MoviesFilms> param4, @org.jetbrains.annotations.Nullable()
    java.lang.String param5) {
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
    
    public QueryItem() {
        super();
    }
    
    public QueryItem(@org.jetbrains.annotations.Nullable()
    java.lang.Integer query, @org.jetbrains.annotations.Nullable()
    java.lang.Integer param1, @org.jetbrains.annotations.Nullable()
    java.lang.Integer param2, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> param3, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.kinopoiskup.entity.MoviesFilms> param4, @org.jetbrains.annotations.Nullable()
    java.lang.String param5) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getQuery() {
        return null;
    }
    
    public final void setQuery(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getParam1() {
        return null;
    }
    
    public final void setParam1(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getParam2() {
        return null;
    }
    
    public final void setParam2(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.String> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.String> getParam3() {
        return null;
    }
    
    public final void setParam3(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.kinopoiskup.entity.MoviesFilms> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.kinopoiskup.entity.MoviesFilms> getParam4() {
        return null;
    }
    
    public final void setParam4(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.kinopoiskup.entity.MoviesFilms> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getParam5() {
        return null;
    }
    
    public final void setParam5(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.example.kinopoiskup.entity.QueryItem> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.kinopoiskup.entity.QueryItem createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.kinopoiskup.entity.QueryItem[] newArray(int size) {
            return null;
        }
    }
}