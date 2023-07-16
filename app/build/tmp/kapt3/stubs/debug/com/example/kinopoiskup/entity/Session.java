package com.example.kinopoiskup.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000  2\u00020\u0001:\u0001 B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001cR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006!"}, d2 = {"Lcom/example/kinopoiskup/entity/Session;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "PRIVATE_MODE", "", "getPRIVATE_MODE", "()I", "setPRIVATE_MODE", "(I)V", "_context", "get_context", "()Landroid/content/Context;", "set_context", "editor", "Landroid/content/SharedPreferences$Editor;", "getEditor", "()Landroid/content/SharedPreferences$Editor;", "setEditor", "(Landroid/content/SharedPreferences$Editor;)V", "pref", "Landroid/content/SharedPreferences;", "getPref", "()Landroid/content/SharedPreferences;", "setPref", "(Landroid/content/SharedPreferences;)V", "isFirstTimeLaunch", "", "setFirstTimeLaunch", "", "isFirstTime", "Companion", "app_debug"})
public final class Session {
    @org.jetbrains.annotations.NotNull()
    private android.content.SharedPreferences pref;
    @org.jetbrains.annotations.NotNull()
    private android.content.SharedPreferences.Editor editor;
    @org.jetbrains.annotations.NotNull()
    private android.content.Context _context;
    private int PRIVATE_MODE = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.kinopoiskup.entity.Session.Companion Companion = null;
    private static final java.lang.String PREF_NAME = "snow-intro-slider";
    private static final java.lang.String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";
    
    public Session(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getPref() {
        return null;
    }
    
    public final void setPref(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences.Editor getEditor() {
        return null;
    }
    
    public final void setEditor(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences.Editor p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context get_context() {
        return null;
    }
    
    public final void set_context(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    public final int getPRIVATE_MODE() {
        return 0;
    }
    
    public final void setPRIVATE_MODE(int p0) {
    }
    
    public final void setFirstTimeLaunch(boolean isFirstTime) {
    }
    
    public final boolean isFirstTimeLaunch() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/kinopoiskup/entity/Session$Companion;", "", "()V", "IS_FIRST_TIME_LAUNCH", "", "PREF_NAME", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}