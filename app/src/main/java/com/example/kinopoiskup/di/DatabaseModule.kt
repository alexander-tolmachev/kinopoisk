package com.example.kinopoiskup.di

import android.content.Context
import com.example.kinopoiskup.data.AppDatabase
import com.example.kinopoiskup.entity.CollectionDao
import com.example.kinopoiskup.entity.FilmDao
import com.example.kinopoiskup.entity.StaffDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return AppDatabase.getInstance(context)
    }
    @Provides
    fun provideCollectionDao(appDatabase: AppDatabase): CollectionDao {
        return appDatabase.collectionDao
    }

    @Provides
    fun provideLocationDao(appDatabase: AppDatabase): StaffDao {
        return appDatabase.staffDao
    }

    @Provides
    fun provideFilmDao(appDatabase: AppDatabase): FilmDao {
        return appDatabase.filmDao
    }

}
