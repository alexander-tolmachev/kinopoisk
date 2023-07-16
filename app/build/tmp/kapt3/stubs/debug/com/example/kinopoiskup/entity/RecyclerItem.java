package com.example.kinopoiskup.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00eb\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u001cJ\u000b\u0010F\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000eH\u00c6\u0003J\u0011\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000eH\u00c6\u0003J\u0011\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000eH\u00c6\u0003J\u0011\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000eH\u00c6\u0003J\u0011\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000eH\u00c6\u0003J\u0011\u0010L\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010(J\u0010\u0010O\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010(J\u0010\u0010P\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010(J\u0017\u0010Q\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nH\u00c6\u0003J\t\u0010R\u001a\u00020\u0006H\u00c6\u0003J\t\u0010S\u001a\u00020\u0006H\u00c6\u0003J\u0011\u0010T\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u00c6\u0003J\u00f4\u0001\u0010U\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000e2\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0002\u0010VJ\u0013\u0010W\u001a\u00020X2\b\u0010Y\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010Z\u001a\u00020\u0006H\u00d6\u0001J\t\u0010[\u001a\u00020\u0003H\u00d6\u0001R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010+\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001e\"\u0004\b-\u0010 R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010+\u001a\u0004\b2\u0010(\"\u0004\b3\u0010*R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010+\u001a\u0004\b4\u0010(\"\u0004\b5\u0010*R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010\f\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001e\"\u0004\b?\u0010 R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001e\"\u0004\bA\u0010 R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010/\"\u0004\bC\u00101R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010;\"\u0004\bE\u0010=\u00a8\u0006\\"}, d2 = {"Lcom/example/kinopoiskup/entity/RecyclerItem;", "", "title", "", "mark", "line", "", "param1", "param2", "param3", "", "type", "position", "list", "", "Lcom/example/kinopoiskup/entity/MoviesFilms;", "stafflist", "Lcom/example/kinopoiskup/entity/FilmStaffDTO;", "imagelist", "Lcom/example/kinopoiskup/entity/ImageItems;", "similars", "Lcom/example/kinopoiskup/entity/SimilarItems;", "films", "Lcom/example/kinopoiskup/entity/StaffFilms;", "collections", "Lcom/example/kinopoiskup/entity/CollectionEntity;", "episodes", "Lcom/example/kinopoiskup/entity/Episodes;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;IILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getCollections", "()Ljava/util/List;", "setCollections", "(Ljava/util/List;)V", "getEpisodes", "setEpisodes", "getFilms", "setFilms", "getImagelist", "setImagelist", "getLine", "()Ljava/lang/Integer;", "setLine", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getList", "setList", "getMark", "()Ljava/lang/String;", "setMark", "(Ljava/lang/String;)V", "getParam1", "setParam1", "getParam2", "setParam2", "getParam3", "()Ljava/util/Map;", "setParam3", "(Ljava/util/Map;)V", "getPosition", "()I", "setPosition", "(I)V", "getSimilars", "setSimilars", "getStafflist", "setStafflist", "getTitle", "setTitle", "getType", "setType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;IILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/example/kinopoiskup/entity/RecyclerItem;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class RecyclerItem {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String title;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String mark;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer line;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer param1;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer param2;
    @org.jetbrains.annotations.Nullable()
    private java.util.Map<java.lang.String, java.lang.String> param3;
    private int type;
    private int position;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.example.kinopoiskup.entity.MoviesFilms> list;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.example.kinopoiskup.entity.FilmStaffDTO> stafflist;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.example.kinopoiskup.entity.ImageItems> imagelist;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.example.kinopoiskup.entity.SimilarItems> similars;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.example.kinopoiskup.entity.StaffFilms> films;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.example.kinopoiskup.entity.CollectionEntity> collections;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.example.kinopoiskup.entity.Episodes> episodes;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kinopoiskup.entity.RecyclerItem copy(@org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String mark, @org.jetbrains.annotations.Nullable()
    java.lang.Integer line, @org.jetbrains.annotations.Nullable()
    java.lang.Integer param1, @org.jetbrains.annotations.Nullable()
    java.lang.Integer param2, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> param3, int type, int position, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.kinopoiskup.entity.MoviesFilms> list, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.kinopoiskup.entity.FilmStaffDTO> stafflist, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.kinopoiskup.entity.ImageItems> imagelist, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.kinopoiskup.entity.SimilarItems> similars, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.kinopoiskup.entity.StaffFilms> films, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.kinopoiskup.entity.CollectionEntity> collections, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.kinopoiskup.entity.Episodes> episodes) {
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
    
    public RecyclerItem() {
        super();
    }
    
    public RecyclerItem(@org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String mark, @org.jetbrains.annotations.Nullable()
    java.lang.Integer line, @org.jetbrains.annotations.Nullable()
    java.lang.Integer param1, @org.jetbrains.annotations.Nullable()
    java.lang.Integer param2, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> param3, int type, int position, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.kinopoiskup.entity.MoviesFilms> list, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.kinopoiskup.entity.FilmStaffDTO> stafflist, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.kinopoiskup.entity.ImageItems> imagelist, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.kinopoiskup.entity.SimilarItems> similars, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.kinopoiskup.entity.StaffFilms> films, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.kinopoiskup.entity.CollectionEntity> collections, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.kinopoiskup.entity.Episodes> episodes) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMark() {
        return null;
    }
    
    public final void setMark(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getLine() {
        return null;
    }
    
    public final void setLine(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getParam1() {
        return null;
    }
    
    public final void setParam1(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getParam2() {
        return null;
    }
    
    public final void setParam2(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.String> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.String> getParam3() {
        return null;
    }
    
    public final void setParam3(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> p0) {
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getType() {
        return 0;
    }
    
    public final void setType(int p0) {
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getPosition() {
        return 0;
    }
    
    public final void setPosition(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.kinopoiskup.entity.MoviesFilms> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.kinopoiskup.entity.MoviesFilms> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.kinopoiskup.entity.MoviesFilms> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.kinopoiskup.entity.FilmStaffDTO> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.kinopoiskup.entity.FilmStaffDTO> getStafflist() {
        return null;
    }
    
    public final void setStafflist(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.kinopoiskup.entity.FilmStaffDTO> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.kinopoiskup.entity.ImageItems> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.kinopoiskup.entity.ImageItems> getImagelist() {
        return null;
    }
    
    public final void setImagelist(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.kinopoiskup.entity.ImageItems> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.kinopoiskup.entity.SimilarItems> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.kinopoiskup.entity.SimilarItems> getSimilars() {
        return null;
    }
    
    public final void setSimilars(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.kinopoiskup.entity.SimilarItems> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.kinopoiskup.entity.StaffFilms> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.kinopoiskup.entity.StaffFilms> getFilms() {
        return null;
    }
    
    public final void setFilms(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.kinopoiskup.entity.StaffFilms> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.kinopoiskup.entity.CollectionEntity> component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.kinopoiskup.entity.CollectionEntity> getCollections() {
        return null;
    }
    
    public final void setCollections(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.kinopoiskup.entity.CollectionEntity> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.kinopoiskup.entity.Episodes> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.kinopoiskup.entity.Episodes> getEpisodes() {
        return null;
    }
    
    public final void setEpisodes(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.kinopoiskup.entity.Episodes> p0) {
    }
}