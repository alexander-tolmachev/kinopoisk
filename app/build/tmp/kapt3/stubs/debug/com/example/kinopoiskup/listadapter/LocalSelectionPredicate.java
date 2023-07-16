package com.example.kinopoiskup.listadapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0011H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0018"}, d2 = {"Lcom/example/kinopoiskup/listadapter/LocalSelectionPredicate;", "Landroidx/recyclerview/selection/SelectionTracker$SelectionPredicate;", "", "context", "Landroid/content/Context;", "adapter", "Lcom/example/kinopoiskup/listadapter/SimpleAdapter;", "viewModel", "Lcom/example/kinopoiskup/presentation/MainViewModel;", "(Landroid/content/Context;Lcom/example/kinopoiskup/listadapter/SimpleAdapter;Lcom/example/kinopoiskup/presentation/MainViewModel;)V", "getAdapter", "()Lcom/example/kinopoiskup/listadapter/SimpleAdapter;", "getContext", "()Landroid/content/Context;", "getViewModel", "()Lcom/example/kinopoiskup/presentation/MainViewModel;", "canSelectMultiple", "", "canSetStateAtPosition", "position", "", "nextState", "canSetStateForKey", "key", "app_debug"})
public final class LocalSelectionPredicate extends androidx.recyclerview.selection.SelectionTracker.SelectionPredicate<java.lang.String> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.kinopoiskup.listadapter.SimpleAdapter adapter = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.kinopoiskup.presentation.MainViewModel viewModel = null;
    
    public LocalSelectionPredicate(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.kinopoiskup.listadapter.SimpleAdapter adapter, @org.jetbrains.annotations.NotNull()
    com.example.kinopoiskup.presentation.MainViewModel viewModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kinopoiskup.listadapter.SimpleAdapter getAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kinopoiskup.presentation.MainViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public boolean canSelectMultiple() {
        return false;
    }
    
    @java.lang.Override()
    public boolean canSetStateForKey(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean nextState) {
        return false;
    }
    
    @java.lang.Override()
    public boolean canSetStateAtPosition(int position, boolean nextState) {
        return false;
    }
}