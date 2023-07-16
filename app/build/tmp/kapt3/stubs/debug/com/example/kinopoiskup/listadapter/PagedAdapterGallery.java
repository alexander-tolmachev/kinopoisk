package com.example.kinopoiskup.listadapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0011\u0012B!\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\u00020\b2\n\u0010\u000b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u001c\u0010\r\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016R\"\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/kinopoiskup/listadapter/PagedAdapterGallery;", "Landroidx/paging/PagingDataAdapter;", "Lcom/example/kinopoiskup/entity/ImageItems;", "Lcom/example/kinopoiskup/listadapter/PagedAdapterGallery$GalleryViewHolder;", "onClick", "Lkotlin/Function2;", "", "", "", "(Lkotlin/jvm/functions/Function2;)V", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "GalleryViewHolder", "app_debug"})
public final class PagedAdapterGallery extends androidx.paging.PagingDataAdapter<com.example.kinopoiskup.entity.ImageItems, com.example.kinopoiskup.listadapter.PagedAdapterGallery.GalleryViewHolder> {
    private final kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.String, kotlin.Unit> onClick = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.kinopoiskup.listadapter.PagedAdapterGallery.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.kinopoiskup.entity.ImageItems> DIFF_CALLBACK = null;
    
    public PagedAdapterGallery(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.String, kotlin.Unit> onClick) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.kinopoiskup.listadapter.PagedAdapterGallery.GalleryViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskup.listadapter.PagedAdapterGallery.GalleryViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/kinopoiskup/listadapter/PagedAdapterGallery$GalleryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/kinopoiskup/databinding/GalleryItemBinding;", "(Lcom/example/kinopoiskup/listadapter/PagedAdapterGallery;Lcom/example/kinopoiskup/databinding/GalleryItemBinding;)V", "getBinding", "()Lcom/example/kinopoiskup/databinding/GalleryItemBinding;", "app_debug"})
    public final class GalleryViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.kinopoiskup.databinding.GalleryItemBinding binding = null;
        
        public GalleryViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.kinopoiskup.databinding.GalleryItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.kinopoiskup.databinding.GalleryItemBinding getBinding() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/kinopoiskup/listadapter/PagedAdapterGallery$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/kinopoiskup/entity/ImageItems;", "getDIFF_CALLBACK", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.kinopoiskup.entity.ImageItems> getDIFF_CALLBACK() {
            return null;
        }
    }
}