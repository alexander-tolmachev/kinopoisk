package com.example.kinopoiskup.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\tH\u00c6\u0003J1\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001J\t\u0010!\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\""}, d2 = {"Lcom/example/kinopoiskup/entity/RequestStatus;", "", "responseCode", "", "responseMessage", "", "responseUri", "Lokhttp3/HttpUrl;", "responseStatus", "", "(ILjava/lang/String;Lokhttp3/HttpUrl;Z)V", "getResponseCode", "()I", "getResponseMessage", "()Ljava/lang/String;", "setResponseMessage", "(Ljava/lang/String;)V", "getResponseStatus", "()Z", "setResponseStatus", "(Z)V", "getResponseUri", "()Lokhttp3/HttpUrl;", "setResponseUri", "(Lokhttp3/HttpUrl;)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class RequestStatus {
    private final int responseCode = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String responseMessage;
    @org.jetbrains.annotations.NotNull()
    private okhttp3.HttpUrl responseUri;
    private boolean responseStatus;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kinopoiskup.entity.RequestStatus copy(int responseCode, @org.jetbrains.annotations.NotNull()
    java.lang.String responseMessage, @org.jetbrains.annotations.NotNull()
    okhttp3.HttpUrl responseUri, boolean responseStatus) {
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
    
    public RequestStatus(int responseCode, @org.jetbrains.annotations.NotNull()
    java.lang.String responseMessage, @org.jetbrains.annotations.NotNull()
    okhttp3.HttpUrl responseUri, boolean responseStatus) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getResponseCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getResponseMessage() {
        return null;
    }
    
    public final void setResponseMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.HttpUrl component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.HttpUrl getResponseUri() {
        return null;
    }
    
    public final void setResponseUri(@org.jetbrains.annotations.NotNull()
    okhttp3.HttpUrl p0) {
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean getResponseStatus() {
        return false;
    }
    
    public final void setResponseStatus(boolean p0) {
    }
}