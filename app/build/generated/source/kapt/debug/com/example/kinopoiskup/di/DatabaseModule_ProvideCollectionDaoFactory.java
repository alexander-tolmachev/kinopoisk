// Generated by Dagger (https://dagger.dev).
package com.example.kinopoiskup.di;

import com.example.kinopoiskup.data.AppDatabase;
import com.example.kinopoiskup.entity.CollectionDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideCollectionDaoFactory implements Factory<CollectionDao> {
  private final DatabaseModule module;

  private final Provider<AppDatabase> appDatabaseProvider;

  public DatabaseModule_ProvideCollectionDaoFactory(DatabaseModule module,
      Provider<AppDatabase> appDatabaseProvider) {
    this.module = module;
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public CollectionDao get() {
    return provideCollectionDao(module, appDatabaseProvider.get());
  }

  public static DatabaseModule_ProvideCollectionDaoFactory create(DatabaseModule module,
      Provider<AppDatabase> appDatabaseProvider) {
    return new DatabaseModule_ProvideCollectionDaoFactory(module, appDatabaseProvider);
  }

  public static CollectionDao provideCollectionDao(DatabaseModule instance,
      AppDatabase appDatabase) {
    return Preconditions.checkNotNullFromProvides(instance.provideCollectionDao(appDatabase));
  }
}
