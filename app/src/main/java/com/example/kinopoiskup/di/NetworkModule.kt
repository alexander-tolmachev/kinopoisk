package com.example.kinopoiskup.di

import com.example.kinopoiskup.data.RetrofitService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideUnsplashService(): RetrofitService {
        return RetrofitService.create()
    }
}
