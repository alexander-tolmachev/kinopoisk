package com.example.kinopoiskup.data;

import java.lang.System;

@androidx.room.Database(entities = {com.example.kinopoiskup.entity.CollectionEntity.class, com.example.kinopoiskup.entity.FilmEntity.class, com.example.kinopoiskup.entity.StaffEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0010"}, d2 = {"Lcom/example/kinopoiskup/data/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "collectionDao", "Lcom/example/kinopoiskup/entity/CollectionDao;", "getCollectionDao", "()Lcom/example/kinopoiskup/entity/CollectionDao;", "filmDao", "Lcom/example/kinopoiskup/entity/FilmDao;", "getFilmDao", "()Lcom/example/kinopoiskup/entity/FilmDao;", "staffDao", "Lcom/example/kinopoiskup/entity/StaffDao;", "getStaffDao", "()Lcom/example/kinopoiskup/entity/StaffDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.kinopoiskup.data.AppDatabase.Companion Companion = null;
    @kotlin.jvm.Volatile()
    private static volatile com.example.kinopoiskup.data.AppDatabase instance;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.kinopoiskup.entity.CollectionDao getCollectionDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.kinopoiskup.entity.FilmDao getFilmDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.kinopoiskup.entity.StaffDao getStaffDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/kinopoiskup/data/AppDatabase$Companion;", "", "()V", "instance", "Lcom/example/kinopoiskup/data/AppDatabase;", "buildDatabase", "context", "Landroid/content/Context;", "getInstance", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.kinopoiskup.data.AppDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final com.example.kinopoiskup.data.AppDatabase buildDatabase(android.content.Context context) {
            return null;
        }
    }
}