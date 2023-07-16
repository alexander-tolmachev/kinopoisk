package com.example.kinopoiskup.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J!\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J!\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/example/kinopoiskup/data/DataStoreManager;", "", "appContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "readUserPreferences", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/kinopoiskup/data/UserPreferences;", "getReadUserPreferences", "()Lkotlinx/coroutines/flow/Flow;", "settingsDataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "updateIntPreference", "", "value", "", "mode", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateShowCompleted", "showCompleted", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateStringPreference", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Settings", "app_debug"})
@javax.inject.Singleton()
public final class DataStoreManager {
    private final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> settingsDataStore = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.example.kinopoiskup.data.UserPreferences> readUserPreferences = null;
    
    @javax.inject.Inject()
    public DataStoreManager(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context appContext) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateShowCompleted(boolean showCompleted, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateIntPreference(int value, int mode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateStringPreference(@org.jetbrains.annotations.NotNull()
    java.lang.String value, int mode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.kinopoiskup.data.UserPreferences> getReadUserPreferences() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007\u00a8\u0006\u001c"}, d2 = {"Lcom/example/kinopoiskup/data/DataStoreManager$Settings;", "", "()V", "COUNTRY_SELECTED", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "getCOUNTRY_SELECTED", "()Landroidx/datastore/preferences/core/Preferences$Key;", "GENRE_SELECTED", "getGENRE_SELECTED", "NIGHT_MODE", "", "getNIGHT_MODE", "ORDER_SELECTOR", "getORDER_SELECTOR", "RANGE_FROM", "getRANGE_FROM", "RANGE_TO", "getRANGE_TO", "SHOW_COMPLETED", "", "getSHOW_COMPLETED", "TYPE_SELECTOR", "getTYPE_SELECTOR", "YEAR_FROM", "getYEAR_FROM", "YEAR_TO", "getYEAR_TO", "app_debug"})
    public static final class Settings {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.kinopoiskup.data.DataStoreManager.Settings INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> SHOW_COMPLETED = null;
        @org.jetbrains.annotations.NotNull()
        private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Integer> NIGHT_MODE = null;
        @org.jetbrains.annotations.NotNull()
        private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Integer> ORDER_SELECTOR = null;
        @org.jetbrains.annotations.NotNull()
        private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Integer> TYPE_SELECTOR = null;
        @org.jetbrains.annotations.NotNull()
        private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> COUNTRY_SELECTED = null;
        @org.jetbrains.annotations.NotNull()
        private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> GENRE_SELECTED = null;
        @org.jetbrains.annotations.NotNull()
        private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> YEAR_FROM = null;
        @org.jetbrains.annotations.NotNull()
        private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> YEAR_TO = null;
        @org.jetbrains.annotations.NotNull()
        private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Integer> RANGE_FROM = null;
        @org.jetbrains.annotations.NotNull()
        private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Integer> RANGE_TO = null;
        
        private Settings() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> getSHOW_COMPLETED() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.Integer> getNIGHT_MODE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.Integer> getORDER_SELECTOR() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.Integer> getTYPE_SELECTOR() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> getCOUNTRY_SELECTED() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> getGENRE_SELECTED() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> getYEAR_FROM() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> getYEAR_TO() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.Integer> getRANGE_FROM() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.Integer> getRANGE_TO() {
            return null;
        }
    }
}