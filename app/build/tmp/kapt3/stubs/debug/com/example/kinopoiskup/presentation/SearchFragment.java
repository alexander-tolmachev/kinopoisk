package com.example.kinopoiskup.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u0018H\u0016J\u001a\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010\'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0(*\u00020*R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006+"}, d2 = {"Lcom/example/kinopoiskup/presentation/SearchFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/kinopoiskup/databinding/FragmentSearchBinding;", "adapterCount", "", "binding", "getBinding", "()Lcom/example/kinopoiskup/databinding/FragmentSearchBinding;", "pattern", "Lkotlin/text/Regex;", "getPattern", "()Lkotlin/text/Regex;", "queryParams", "", "", "viewModel", "Lcom/example/kinopoiskup/presentation/MainViewModel;", "getViewModel", "()Lcom/example/kinopoiskup/presentation/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onClick", "", "item", "position", "type", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "textChanges", "Lkotlinx/coroutines/flow/Flow;", "", "Landroid/widget/EditText;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SearchFragment extends androidx.fragment.app.Fragment {
    private com.example.kinopoiskup.databinding.FragmentSearchBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.text.Regex pattern = null;
    private int adapterCount = -1;
    private java.util.Map<java.lang.String, java.lang.String> queryParams;
    
    public SearchFragment() {
        super();
    }
    
    private final com.example.kinopoiskup.databinding.FragmentSearchBinding getBinding() {
        return null;
    }
    
    private final com.example.kinopoiskup.presentation.MainViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.text.Regex getPattern() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.CharSequence> textChanges(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$textChanges) {
        return null;
    }
    
    public final void onClick(int item, int position, int type) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}