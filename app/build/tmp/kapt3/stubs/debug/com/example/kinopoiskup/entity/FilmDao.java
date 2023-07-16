package com.example.kinopoiskup.entity;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0013H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J!\u0010\u0018\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/example/kinopoiskup/entity/FilmDao;", "", "cleanFilmsCategory", "", "bitset", "", "target", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFilmById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFilms", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFilmsByCategory", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFilmBitmask", "getFilmsAndActors", "", "Lcom/example/kinopoiskup/entity/FilmEntity;", "getFilmsByCategory", "insert", "entity", "(Lcom/example/kinopoiskup/entity/FilmEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateFilmById", "bitmask", "(IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface FilmDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM films_table WHERE bitmask & :bitset > 0")
    public abstract java.lang.Object getFilmsByCategory(long bitset, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.kinopoiskup.entity.FilmEntity>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM films_table WHERE bitmask=0 ORDER BY timestamp DESC")
    public abstract java.lang.Object getFilmsAndActors(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.kinopoiskup.entity.FilmEntity>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "UPDATE films_table SET bitmask=bitmask & :target WHERE bitmask & :bitset > 0")
    public abstract java.lang.Object cleanFilmsCategory(long bitset, long target, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM films_table WHERE kinopoiskId=:id")
    public abstract java.lang.Object deleteFilmById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM films_table WHERE bitmask & :bitset > 0")
    public abstract java.lang.Object deleteFilmsByCategory(long bitset, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM films_table WHERE bitmask = 0")
    public abstract java.lang.Object deleteFilms(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskup.entity.FilmEntity entity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "UPDATE films_table SET bitmask=:bitmask WHERE kinopoiskId=:id")
    public abstract java.lang.Object updateFilmById(int id, long bitmask, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT bitmask FROM films_table WHERE kinopoiskId=:id LIMIT 1")
    public abstract java.lang.Object getFilmBitmask(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
}