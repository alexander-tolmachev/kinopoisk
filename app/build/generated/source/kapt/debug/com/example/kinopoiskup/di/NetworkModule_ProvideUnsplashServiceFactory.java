// Generated by Dagger (https://dagger.dev).
package com.example.kinopoiskup.di;

import com.example.kinopoiskup.data.RetrofitService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideUnsplashServiceFactory implements Factory<RetrofitService> {
  private final NetworkModule module;

  public NetworkModule_ProvideUnsplashServiceFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public RetrofitService get() {
    return provideUnsplashService(module);
  }

  public static NetworkModule_ProvideUnsplashServiceFactory create(NetworkModule module) {
    return new NetworkModule_ProvideUnsplashServiceFactory(module);
  }

  public static RetrofitService provideUnsplashService(NetworkModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideUnsplashService());
  }
}
