package com.example.basemvvm.ui.binding;

import java.lang.System;

/**
 * Data Binding adapters specific to the app.
 * for more detail: https://developer.android.com/topic/libraries/data-binding/binding-adapters
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/example/basemvvm/ui/binding/BindingAdapters;", "", "()V", "loadImage", "", "view", "Landroid/widget/ImageView;", "url", "", "showHide", "Landroid/view/View;", "show", "", "app_debug"})
public final class BindingAdapters {
    public static final com.example.basemvvm.ui.binding.BindingAdapters INSTANCE = null;
    
    @androidx.databinding.BindingAdapter(value = {"visibleGone"})
    public static final void showHide(@org.jetbrains.annotations.NotNull()
    android.view.View view, boolean show) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"imageUrl"})
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    private BindingAdapters() {
        super();
    }
}