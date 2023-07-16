package com.example.kinopoiskup.listadapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BQ\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012&\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00050\n\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\u000f\u001a\u00020\u0005J\b\u0010\u0010\u001a\u00020\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\u0014\u0010\u001b\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u000eR.\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/kinopoiskup/listadapter/MovieFragmentAdapterFull;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/kinopoiskup/listadapter/MovieFragmentViewHolder;", "onClickCollection", "Lkotlin/Function0;", "", "onClickContinue", "Lkotlin/Function1;", "Lcom/example/kinopoiskup/entity/RecyclerItem;", "onClick", "Lkotlin/Function4;", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "values", "", "clear", "getItemCount", "getItemId", "", "position", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "data", "app_debug"})
public final class MovieFragmentAdapterFull extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.kinopoiskup.listadapter.MovieFragmentViewHolder> {
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onClickCollection = null;
    private final kotlin.jvm.functions.Function1<com.example.kinopoiskup.entity.RecyclerItem, kotlin.Unit> onClickContinue = null;
    private final kotlin.jvm.functions.Function4<java.lang.Integer, java.lang.Integer, java.lang.Integer, com.example.kinopoiskup.entity.RecyclerItem, kotlin.Unit> onClick = null;
    private java.util.List<com.example.kinopoiskup.entity.RecyclerItem> values;
    
    public MovieFragmentAdapterFull(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClickCollection, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.kinopoiskup.entity.RecyclerItem, kotlin.Unit> onClickContinue, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super com.example.kinopoiskup.entity.RecyclerItem, kotlin.Unit> onClick) {
        super();
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.RecyclerItem> data) {
    }
    
    public final void clear() {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.kinopoiskup.listadapter.MovieFragmentViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskup.listadapter.MovieFragmentViewHolder holder, int position) {
    }
}