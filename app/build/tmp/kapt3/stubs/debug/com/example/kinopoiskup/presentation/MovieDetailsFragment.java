package com.example.kinopoiskup.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J(\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u0006\u0010\u001f\u001a\u00020\u0013J\u0010\u0010 \u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ$\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020\u0013H\u0016J\b\u0010*\u001a\u00020\u0013H\u0016J\u001a\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\"2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u000e\u0010-\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020.J\u0010\u0010/\u001a\u00020\u00132\b\u00100\u001a\u0004\u0018\u000101J\b\u00102\u001a\u00020\u0013H\u0002J\u0012\u00103\u001a\u00020\u0013*\u00020\u00152\u0006\u00104\u001a\u00020\u0017R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u00065"}, d2 = {"Lcom/example/kinopoiskup/presentation/MovieDetailsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/kinopoiskup/databinding/FragmentMovieDetailsBinding;", "binding", "getBinding", "()Lcom/example/kinopoiskup/databinding/FragmentMovieDetailsBinding;", "isExpanded", "", "movieAdapter", "Lcom/example/kinopoiskup/listadapter/MovieFragmentAdapterFull;", "viewModel", "Lcom/example/kinopoiskup/presentation/MainViewModel;", "getViewModel", "()Lcom/example/kinopoiskup/presentation/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "collapseTextView", "", "tv", "Landroid/widget/TextView;", "numLines", "", "expandTextView", "onClick", "item", "position", "type", "params", "Lcom/example/kinopoiskup/entity/RecyclerItem;", "onClickCollection", "onClickContinue", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onStart", "onViewCreated", "view", "showFilmInfo", "Lcom/example/kinopoiskup/entity/FilmInfoDTO;", "showPhoto", "photoUri", "", "subscribeUiFull", "limitLength", "maxLength", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MovieDetailsFragment extends androidx.fragment.app.Fragment {
    private com.example.kinopoiskup.databinding.FragmentMovieDetailsBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private boolean isExpanded = false;
    private com.example.kinopoiskup.listadapter.MovieFragmentAdapterFull movieAdapter;
    
    public MovieDetailsFragment() {
        super();
    }
    
    private final com.example.kinopoiskup.databinding.FragmentMovieDetailsBinding getBinding() {
        return null;
    }
    
    private final com.example.kinopoiskup.presentation.MainViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
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
    
    public final void showPhoto(@org.jetbrains.annotations.Nullable()
    java.lang.String photoUri) {
    }
    
    private final void expandTextView(android.widget.TextView tv) {
    }
    
    private final void collapseTextView(android.widget.TextView tv, int numLines) {
    }
    
    public final void limitLength(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$limitLength, int maxLength) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public final void onClickCollection() {
    }
    
    public final void onClickContinue(@org.jetbrains.annotations.Nullable()
    com.example.kinopoiskup.entity.RecyclerItem params) {
    }
    
    public final void onClick(int item, int position, int type, @org.jetbrains.annotations.Nullable()
    com.example.kinopoiskup.entity.RecyclerItem params) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    private final void subscribeUiFull() {
    }
    
    public final void showFilmInfo(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskup.entity.FilmInfoDTO item) {
    }
}