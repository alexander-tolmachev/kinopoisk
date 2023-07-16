package com.example.kinopoiskup.presentation;

import java.lang.System;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\u0012\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0015J\b\u0010\u001b\u001a\u00020\u0014H\u0002J\b\u0010\u001c\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000e8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/example/kinopoiskup/presentation/FullscreenActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/kinopoiskup/databinding/ActivityFullscreenBinding;", "delayHideTouchListener", "Landroid/view/View$OnTouchListener;", "fullscreenContent", "Landroid/widget/ImageView;", "fullscreenContentControls", "Landroid/widget/LinearLayout;", "hideHandler", "Landroid/os/Handler;", "hidePart2Runnable", "Ljava/lang/Runnable;", "hideRunnable", "isFullscreen", "", "showPart2Runnable", "delayedHide", "", "delayMillis", "", "hide", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "show", "toggle", "Companion", "app_debug"})
public final class FullscreenActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.kinopoiskup.databinding.ActivityFullscreenBinding binding;
    private android.widget.ImageView fullscreenContent;
    private android.widget.LinearLayout fullscreenContentControls;
    private final android.os.Handler hideHandler = null;
    @android.annotation.SuppressLint(value = {"InlinedApi"})
    private final java.lang.Runnable hidePart2Runnable = null;
    private final java.lang.Runnable showPart2Runnable = null;
    private boolean isFullscreen = false;
    private final java.lang.Runnable hideRunnable = null;
    
    /**
     * Touch listener to use for in-layout UI controls to delay hiding the
     * system UI. This is to prevent the jarring behavior of controls going away
     * while interacting with activity UI.
     */
    private final android.view.View.OnTouchListener delayHideTouchListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.kinopoiskup.presentation.FullscreenActivity.Companion Companion = null;
    
    /**
     * Whether or not the system UI should be auto-hidden after
     * [AUTO_HIDE_DELAY_MILLIS] milliseconds.
     */
    private static final boolean AUTO_HIDE = true;
    
    /**
     * If [AUTO_HIDE] is set, the number of milliseconds to wait after
     * user interaction before hiding the system UI.
     */
    private static final int AUTO_HIDE_DELAY_MILLIS = 3000;
    
    /**
     * Some older devices needs a small delay between UI widget updates
     * and a change of the status and navigation bar.
     */
    private static final int UI_ANIMATION_DELAY = 300;
    
    public FullscreenActivity() {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void toggle() {
    }
    
    private final void hide() {
    }
    
    private final void show() {
    }
    
    /**
     * Schedules a call to hide() in [delayMillis], canceling any
     * previously scheduled calls.
     */
    private final void delayedHide(int delayMillis) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/kinopoiskup/presentation/FullscreenActivity$Companion;", "", "()V", "AUTO_HIDE", "", "AUTO_HIDE_DELAY_MILLIS", "", "UI_ANIMATION_DELAY", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}