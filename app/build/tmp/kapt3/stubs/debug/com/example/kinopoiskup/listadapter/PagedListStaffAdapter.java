package com.example.kinopoiskup.listadapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B-\u0012&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016R.\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/kinopoiskup/listadapter/PagedListStaffAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/example/kinopoiskup/entity/StaffEntity;", "Lcom/example/kinopoiskup/listadapter/StaffViewHolderHorizontal;", "onClick", "Lkotlin/Function4;", "", "Lcom/example/kinopoiskup/entity/RecyclerItem;", "", "(Lkotlin/jvm/functions/Function4;)V", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "app_debug"})
public final class PagedListStaffAdapter extends androidx.paging.PagingDataAdapter<com.example.kinopoiskup.entity.StaffEntity, com.example.kinopoiskup.listadapter.StaffViewHolderHorizontal> {
    private final kotlin.jvm.functions.Function4<java.lang.Integer, java.lang.Integer, java.lang.Integer, com.example.kinopoiskup.entity.RecyclerItem, kotlin.Unit> onClick = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.kinopoiskup.listadapter.PagedListStaffAdapter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.kinopoiskup.entity.StaffEntity> DIFF_CALLBACK = null;
    
    public PagedListStaffAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super com.example.kinopoiskup.entity.RecyclerItem, kotlin.Unit> onClick) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.kinopoiskup.listadapter.StaffViewHolderHorizontal onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskup.listadapter.StaffViewHolderHorizontal holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/kinopoiskup/listadapter/PagedListStaffAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/kinopoiskup/entity/StaffEntity;", "getDIFF_CALLBACK", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.kinopoiskup.entity.StaffEntity> getDIFF_CALLBACK() {
            return null;
        }
    }
}