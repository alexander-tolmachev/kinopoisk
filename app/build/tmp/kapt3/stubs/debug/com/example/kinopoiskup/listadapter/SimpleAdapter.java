package com.example.kinopoiskup.listadapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\"B\u001f\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0015\u001a\u00020\u0006H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J\u001c\u0010\u0019\u001a\u00020\u00072\n\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J\u001c\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0006H\u0016J\u0014\u0010\u001f\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050!R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006#"}, d2 = {"Lcom/example/kinopoiskup/listadapter/SimpleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/kinopoiskup/listadapter/SimpleAdapter$SimpleViewHolder;", "onClick", "Lkotlin/Function2;", "", "", "", "(Lkotlin/jvm/functions/Function2;)V", "tracker", "Landroidx/recyclerview/selection/SelectionTracker;", "getTracker", "()Landroidx/recyclerview/selection/SelectionTracker;", "setTracker", "(Landroidx/recyclerview/selection/SelectionTracker;)V", "values", "", "getValues", "()Ljava/util/List;", "setValues", "(Ljava/util/List;)V", "getItemCount", "getItemId", "", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "data", "", "SimpleViewHolder", "app_debug"})
public final class SimpleAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.kinopoiskup.listadapter.SimpleAdapter.SimpleViewHolder> {
    private final kotlin.jvm.functions.Function2<java.lang.String, java.lang.Integer, kotlin.Unit> onClick = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> values;
    @org.jetbrains.annotations.Nullable()
    private androidx.recyclerview.selection.SelectionTracker<java.lang.String> tracker;
    
    public SimpleAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> onClick) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getValues() {
        return null;
    }
    
    public final void setValues(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.recyclerview.selection.SelectionTracker<java.lang.String> getTracker() {
        return null;
    }
    
    public final void setTracker(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.selection.SelectionTracker<java.lang.String> p0) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> data) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.kinopoiskup.listadapter.SimpleAdapter.SimpleViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskup.listadapter.SimpleAdapter.SimpleViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/kinopoiskup/listadapter/SimpleAdapter$SimpleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/example/kinopoiskup/listadapter/SimpleAdapter;Landroid/view/View;)V", "text", "Landroid/widget/TextView;", "bind", "", "value", "", "isActivated", "", "position", "", "getItemDetails", "Landroidx/recyclerview/selection/ItemDetailsLookup$ItemDetails;", "app_debug"})
    public final class SimpleViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private android.widget.TextView text;
        
        public SimpleViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.selection.ItemDetailsLookup.ItemDetails<java.lang.String> getItemDetails() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        java.lang.String value, boolean isActivated, int position) {
        }
    }
}