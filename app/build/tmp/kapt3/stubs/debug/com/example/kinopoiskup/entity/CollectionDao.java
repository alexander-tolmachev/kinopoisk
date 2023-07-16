package com.example.kinopoiskup.entity;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\'J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\'\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ!\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ!\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/example/kinopoiskup/entity/CollectionDao;", "", "add", "", "entity", "Lcom/example/kinopoiskup/entity/CollectionEntity;", "(Lcom/example/kinopoiskup/entity/CollectionEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "", "index", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCollectionItem", "Lkotlinx/coroutines/flow/Flow;", "name", "", "getCollectionList", "getCount", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCountByIdx", "getPagedList", "limit", "offset", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "count", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCount", "number", "app_debug"})
public abstract interface CollectionDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM collection_table ORDER BY name ASC LIMIT :limit OFFSET :offset")
    public abstract java.lang.Object getPagedList(int limit, int offset, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.kinopoiskup.entity.CollectionEntity>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = 5)
    public abstract java.lang.Object add(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskup.entity.CollectionEntity entity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM collection_table WHERE idx = :index")
    public abstract java.lang.Object delete(int index, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "UPDATE collection_table SET count=:count   WHERE name =:name")
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    java.lang.String name, int count, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "UPDATE collection_table SET count=count + :number  WHERE name =:name")
    public abstract java.lang.Object updateCount(@org.jetbrains.annotations.NotNull()
    java.lang.String name, int number, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT count FROM collection_table WHERE name =:name")
    public abstract java.lang.Object getCount(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT count FROM collection_table WHERE idx =:name")
    public abstract java.lang.Object getCountByIdx(int name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT idx FROM collection_table")
    public abstract java.lang.Object getAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Integer>> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM collection_table WHERE name =:name")
    public abstract kotlinx.coroutines.flow.Flow<com.example.kinopoiskup.entity.CollectionEntity> getCollectionItem(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM collection_table ORDER BY idx DESC")
    public abstract java.lang.Object getCollectionList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.kinopoiskup.entity.CollectionEntity>> continuation);
}