package com.example.kinopoiskup.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J*\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/example/kinopoiskup/entity/SimilarsDTO;", "", "total", "", "items", "", "Lcom/example/kinopoiskup/entity/SimilarItems;", "(Ljava/lang/Integer;Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getTotal", "()Ljava/lang/Integer;", "setTotal", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/util/List;)Lcom/example/kinopoiskup/entity/SimilarsDTO;", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class SimilarsDTO {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "total")
    private java.lang.Integer total;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "items")
    private java.util.List<com.example.kinopoiskup.entity.SimilarItems> items;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kinopoiskup.entity.SimilarsDTO copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer total, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.SimilarItems> items) {
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
    
    public SimilarsDTO() {
        super();
    }
    
    public SimilarsDTO(@org.jetbrains.annotations.Nullable()
    java.lang.Integer total, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.SimilarItems> items) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotal() {
        return null;
    }
    
    public final void setTotal(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskup.entity.SimilarItems> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskup.entity.SimilarItems> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.SimilarItems> p0) {
    }
}