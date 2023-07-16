package com.example.kinopoiskup.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u0016H\u0016J\u0018\u0010&\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\'\u001a\u0004\u0018\u00010\u000eJ\u001a\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010*\u001a\u00020\u00162\b\u0010+\u001a\u0004\u0018\u00010\u000eR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006,"}, d2 = {"Lcom/example/kinopoiskup/presentation/TabFragmentGallery;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/kinopoiskup/databinding/FragmentTabGalleryBinding;", "binding", "getBinding", "()Lcom/example/kinopoiskup/databinding/FragmentTabGalleryBinding;", "listAdapter", "Lcom/example/kinopoiskup/listadapter/MovieGalleryAdapter;", "pagedAdapter", "Lcom/example/kinopoiskup/listadapter/PagedAdapterGallery;", "translations", "", "", "viewModel", "Lcom/example/kinopoiskup/presentation/MainViewModel;", "getViewModel", "()Lcom/example/kinopoiskup/presentation/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onClick", "", "item", "", "position", "type", "params", "Lcom/example/kinopoiskup/entity/RecyclerItem;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onItemClick", "image", "onViewCreated", "view", "showPhoto", "photoUri", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class TabFragmentGallery extends androidx.fragment.app.Fragment {
    private com.example.kinopoiskup.databinding.FragmentTabGalleryBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.example.kinopoiskup.listadapter.MovieGalleryAdapter listAdapter;
    private com.example.kinopoiskup.listadapter.PagedAdapterGallery pagedAdapter;
    private java.util.Map<java.lang.String, java.lang.String> translations;
    
    public TabFragmentGallery() {
        super();
    }
    
    private final com.example.kinopoiskup.databinding.FragmentTabGalleryBinding getBinding() {
        return null;
    }
    
    private final com.example.kinopoiskup.presentation.MainViewModel getViewModel() {
        return null;
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
    
    public final void onClick(int item, int position, int type, @org.jetbrains.annotations.Nullable()
    com.example.kinopoiskup.entity.RecyclerItem params) {
    }
    
    public final void onItemClick(int item, @org.jetbrains.annotations.Nullable()
    java.lang.String image) {
    }
    
    public final void showPhoto(@org.jetbrains.annotations.Nullable()
    java.lang.String photoUri) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}