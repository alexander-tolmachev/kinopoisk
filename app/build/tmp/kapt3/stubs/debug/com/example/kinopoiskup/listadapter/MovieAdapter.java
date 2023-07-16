package com.example.kinopoiskup.listadapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f B-\u0012&\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0012\u001a\u00020\u0005H\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\u0018\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0005H\u0016J.\u0010\u001b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R.\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/kinopoiskup/listadapter/MovieAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onClick", "Lkotlin/Function4;", "", "Lcom/example/kinopoiskup/entity/RecyclerItem;", "", "(Lkotlin/jvm/functions/Function4;)V", "category", "data", "", "Lcom/example/kinopoiskup/entity/MoviesFilms;", "dataLine", "dataType", "itemCount", "queryParams", "transCat", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "count", "type", "params", "PlaceholderViewHolder", "ThumbnailViewHolder", "app_debug"})
public final class MovieAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final kotlin.jvm.functions.Function4<java.lang.Integer, java.lang.Integer, java.lang.Integer, com.example.kinopoiskup.entity.RecyclerItem, kotlin.Unit> onClick = null;
    private int itemCount = 0;
    private int dataType = 0;
    private int dataLine = 0;
    private int category = 0;
    private com.example.kinopoiskup.entity.RecyclerItem queryParams;
    private java.util.List<com.example.kinopoiskup.entity.MoviesFilms> data;
    private final com.example.kinopoiskup.entity.RecyclerItem transCat = null;
    
    public MovieAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super com.example.kinopoiskup.entity.RecyclerItem, kotlin.Unit> onClick) {
        super();
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.MoviesFilms> data, int count, int type, @org.jetbrains.annotations.Nullable()
    com.example.kinopoiskup.entity.RecyclerItem params) {
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
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\n\u00a8\u0006&"}, d2 = {"Lcom/example/kinopoiskup/listadapter/MovieAdapter$ThumbnailViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/example/kinopoiskup/listadapter/MovieAdapter;Landroid/view/View;)V", "button", "Landroid/widget/TextView;", "getButton", "()Landroid/widget/TextView;", "setButton", "(Landroid/widget/TextView;)V", "genres", "getGenres", "setGenres", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "setIcon", "(Landroid/widget/ImageView;)V", "itemV", "Landroid/widget/FrameLayout;", "getItemV", "()Landroid/widget/FrameLayout;", "setItemV", "(Landroid/widget/FrameLayout;)V", "poster", "getPoster", "setPoster", "title", "getTitle", "setTitle", "bind", "", "item", "Lcom/example/kinopoiskup/entity/MoviesFilms;", "position", "", "app_debug"})
    public final class ThumbnailViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView title;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView genres;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView poster;
        @org.jetbrains.annotations.NotNull()
        private android.widget.FrameLayout itemV;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView icon;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView button;
        
        public ThumbnailViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTitle() {
            return null;
        }
        
        public final void setTitle(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getGenres() {
            return null;
        }
        
        public final void setGenres(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getPoster() {
            return null;
        }
        
        public final void setPoster(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.FrameLayout getItemV() {
            return null;
        }
        
        public final void setItemV(@org.jetbrains.annotations.NotNull()
        android.widget.FrameLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIcon() {
            return null;
        }
        
        public final void setIcon(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getButton() {
            return null;
        }
        
        public final void setButton(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.kinopoiskup.entity.MoviesFilms item, int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010\u00a8\u0006\u001a"}, d2 = {"Lcom/example/kinopoiskup/listadapter/MovieAdapter$PlaceholderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/example/kinopoiskup/listadapter/MovieAdapter;Landroid/view/View;)V", "btn", "Landroid/widget/ImageButton;", "getBtn", "()Landroid/widget/ImageButton;", "setBtn", "(Landroid/widget/ImageButton;)V", "text", "Landroid/widget/TextView;", "getText", "()Landroid/widget/TextView;", "setText", "(Landroid/widget/TextView;)V", "text2", "getText2", "setText2", "bind", "", "item", "Lcom/example/kinopoiskup/entity/MoviesFilms;", "position", "", "app_debug"})
    public final class PlaceholderViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageButton btn;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView text;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView text2;
        
        public PlaceholderViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageButton getBtn() {
            return null;
        }
        
        public final void setBtn(@org.jetbrains.annotations.NotNull()
        android.widget.ImageButton p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getText() {
            return null;
        }
        
        public final void setText(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getText2() {
            return null;
        }
        
        public final void setText2(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.kinopoiskup.entity.MoviesFilms item, int position) {
        }
    }
}