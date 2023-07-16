package com.example.kinopoiskup.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J%\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0002\u0010\u001aJ\u0012\u0010\u001b\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010$\u001a\u00020\u0015H\u0016J\u001a\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u001f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0006\u0010\'\u001a\u00020\u0015J\b\u0010(\u001a\u00020\u0015H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006)"}, d2 = {"Lcom/example/kinopoiskup/presentation/BottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "_binding", "Lcom/example/kinopoiskup/databinding/BottomSheetModalBinding;", "adapter", "Lcom/example/kinopoiskup/listadapter/MainAdapter;", "binding", "getBinding", "()Lcom/example/kinopoiskup/databinding/BottomSheetModalBinding;", "collection", "Lcom/example/kinopoiskup/entity/CollectionEntity;", "displayJob", "Lkotlinx/coroutines/Job;", "viewModel", "Lcom/example/kinopoiskup/presentation/MainViewModel;", "getViewModel", "()Lcom/example/kinopoiskup/presentation/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onClick", "", "item", "target", "", "mask", "(Lcom/example/kinopoiskup/entity/CollectionEntity;JLjava/lang/Long;)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "setUpView", "subscribeCollectionList", "app_debug"})
public final class BottomSheetFragment extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    private com.example.kinopoiskup.databinding.BottomSheetModalBinding _binding;
    private final com.example.kinopoiskup.entity.CollectionEntity collection = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private kotlinx.coroutines.Job displayJob;
    private com.example.kinopoiskup.listadapter.MainAdapter adapter;
    
    public BottomSheetFragment() {
        super();
    }
    
    private final com.example.kinopoiskup.databinding.BottomSheetModalBinding getBinding() {
        return null;
    }
    
    private final com.example.kinopoiskup.presentation.MainViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void subscribeCollectionList() {
    }
    
    public final void onClick(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskup.entity.CollectionEntity item, long target, @org.jetbrains.annotations.Nullable()
    java.lang.Long mask) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public final void setUpView() {
    }
}