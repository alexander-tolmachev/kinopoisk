package com.example.kinopoiskup.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/example/kinopoiskup/di/DatabaseModule;", "", "()V", "provideAppDatabase", "Lcom/example/kinopoiskup/data/AppDatabase;", "context", "Landroid/content/Context;", "provideCollectionDao", "Lcom/example/kinopoiskup/entity/CollectionDao;", "appDatabase", "provideFilmDao", "Lcom/example/kinopoiskup/entity/FilmDao;", "provideLocationDao", "Lcom/example/kinopoiskup/entity/StaffDao;", "app_debug"})
@dagger.Module()
public final class DatabaseModule {
    
    public DatabaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.kinopoiskup.data.AppDatabase provideAppDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.kinopoiskup.entity.CollectionDao provideCollectionDao(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskup.data.AppDatabase appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.kinopoiskup.entity.StaffDao provideLocationDao(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskup.data.AppDatabase appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.kinopoiskup.entity.FilmDao provideFilmDao(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskup.data.AppDatabase appDatabase) {
        return null;
    }
}