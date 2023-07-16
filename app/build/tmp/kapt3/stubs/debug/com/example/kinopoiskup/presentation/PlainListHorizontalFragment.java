package com.example.kinopoiskup.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u0013H\u0016J\u001a\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u0015H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\'"}, d2 = {"Lcom/example/kinopoiskup/presentation/PlainListHorizontalFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/kinopoiskup/databinding/FragmentResultsRecyclerItemsBinding;", "binding", "getBinding", "()Lcom/example/kinopoiskup/databinding/FragmentResultsRecyclerItemsBinding;", "displayJob", "Lkotlinx/coroutines/Job;", "pagedAdapter", "Lcom/example/kinopoiskup/listadapter/PagedListStaffAdapter;", "viewModel", "Lcom/example/kinopoiskup/presentation/MainViewModel;", "getViewModel", "()Lcom/example/kinopoiskup/presentation/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onClick", "", "item", "", "position", "type", "params", "Lcom/example/kinopoiskup/entity/RecyclerItem;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "subscribeStaffList", "query", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class PlainListHorizontalFragment extends androidx.fragment.app.Fragment {
    private com.example.kinopoiskup.databinding.FragmentResultsRecyclerItemsBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.example.kinopoiskup.listadapter.PagedListStaffAdapter pagedAdapter;
    private kotlinx.coroutines.Job displayJob;
    
    public PlainListHorizontalFragment() {
        super();
    }
    
    private final com.example.kinopoiskup.databinding.FragmentResultsRecyclerItemsBinding getBinding() {
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
    
    private final void subscribeStaffList(int query) {
    }
    
    public final void onClick(int item, int position, int type, @org.jetbrains.annotations.Nullable()
    com.example.kinopoiskup.entity.RecyclerItem params) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}