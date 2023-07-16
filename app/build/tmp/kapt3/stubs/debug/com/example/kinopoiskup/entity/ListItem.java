package com.example.kinopoiskup.entity;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\b\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\u0014\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\b\tH\u00c6\u0003J2\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0013\b\u0002\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\b\tH\u00c6\u0001J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0005H\u00d6\u0001R\u001c\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\b\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006!"}, d2 = {"Lcom/example/kinopoiskup/entity/ListItem;", "Landroid/os/Parcelable;", "title", "", "position", "", "itemsList", "", "Lcom/example/kinopoiskup/entity/SeasonItems;", "Lkotlinx/parcelize/RawValue;", "(Ljava/lang/String;ILjava/util/List;)V", "getItemsList", "()Ljava/util/List;", "getPosition", "()I", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class ListItem implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    private final int position = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.kinopoiskup.entity.SeasonItems> itemsList = null;
    public static final android.os.Parcelable.Creator<com.example.kinopoiskup.entity.ListItem> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kinopoiskup.entity.ListItem copy(@org.jetbrains.annotations.NotNull()
    java.lang.String title, int position, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.SeasonItems> itemsList) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ListItem(@org.jetbrains.annotations.NotNull()
    java.lang.String title, int position, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.SeasonItems> itemsList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getPosition() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskup.entity.SeasonItems> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskup.entity.SeasonItems> getItemsList() {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.example.kinopoiskup.entity.ListItem> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.kinopoiskup.entity.ListItem createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.kinopoiskup.entity.ListItem[] newArray(int size) {
            return null;
        }
    }
}