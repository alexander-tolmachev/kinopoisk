package com.example.kinopoiskup.listadapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0014\u0015B1\u0012 \u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\f\u001a\u00020\u00072\n\u0010\r\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R\u0012\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000bR(\u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/kinopoiskup/listadapter/MainAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/example/kinopoiskup/entity/CollectionEntity;", "Lcom/example/kinopoiskup/listadapter/MainAdapter$MainViewHolder;", "onClick", "Lkotlin/Function3;", "", "", "filmBitmask", "(Lkotlin/jvm/functions/Function3;Ljava/lang/Long;)V", "bitmask", "Ljava/lang/Long;", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "MainViewHolder", "app_debug"})
public final class MainAdapter extends androidx.paging.PagingDataAdapter<com.example.kinopoiskup.entity.CollectionEntity, com.example.kinopoiskup.listadapter.MainAdapter.MainViewHolder> {
    private final kotlin.jvm.functions.Function3<com.example.kinopoiskup.entity.CollectionEntity, java.lang.Long, java.lang.Long, kotlin.Unit> onClick = null;
    private final java.lang.Long filmBitmask = null;
    private java.lang.Long bitmask;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.kinopoiskup.listadapter.MainAdapter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.kinopoiskup.entity.CollectionEntity> DIFF_CALLBACK = null;
    
    public MainAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super com.example.kinopoiskup.entity.CollectionEntity, ? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> onClick, @org.jetbrains.annotations.Nullable()
    java.lang.Long filmBitmask) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.kinopoiskup.listadapter.MainAdapter.MainViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskup.listadapter.MainAdapter.MainViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/kinopoiskup/listadapter/MainAdapter$MainViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/kinopoiskup/databinding/CollectionItemHorizontalBinding;", "(Lcom/example/kinopoiskup/listadapter/MainAdapter;Lcom/example/kinopoiskup/databinding/CollectionItemHorizontalBinding;)V", "getBinding", "()Lcom/example/kinopoiskup/databinding/CollectionItemHorizontalBinding;", "app_debug"})
    public final class MainViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.kinopoiskup.databinding.CollectionItemHorizontalBinding binding = null;
        
        public MainViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.kinopoiskup.databinding.CollectionItemHorizontalBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.kinopoiskup.databinding.CollectionItemHorizontalBinding getBinding() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/kinopoiskup/listadapter/MainAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/kinopoiskup/entity/CollectionEntity;", "getDIFF_CALLBACK", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.kinopoiskup.entity.CollectionEntity> getDIFF_CALLBACK() {
            return null;
        }
    }
}