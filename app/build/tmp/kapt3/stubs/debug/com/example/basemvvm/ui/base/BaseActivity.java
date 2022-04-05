package com.example.basemvvm.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH$J\b\u0010\u001b\u001a\u00020\u001aH&J\b\u0010\u001c\u001a\u00020\u001aH$J\b\u0010\u001d\u001a\u00020\u001eH%J\u0012\u0010\u001f\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\b\u0010\"\u001a\u00020\u001aH\u0014J\b\u0010#\u001a\u00020\u001aH\u0014J\b\u0010$\u001a\u00020\u001aH&J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010&H$R\u001c\u0010\u0007\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\u00028\u0001X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0013\u001a\u00020\u00148\u0004@\u0004X\u0085.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\'"}, d2 = {"Lcom/example/basemvvm/ui/base/BaseActivity;", "T", "Landroidx/databinding/ViewDataBinding;", "M", "Lcom/example/basemvvm/ui/base/BaseViewModel;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "viewModel", "getViewModel", "()Lcom/example/basemvvm/ui/base/BaseViewModel;", "setViewModel", "(Lcom/example/basemvvm/ui/base/BaseViewModel;)V", "Lcom/example/basemvvm/ui/base/BaseViewModel;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "handleViewState", "", "hideLoading", "initView", "layoutRes", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onStop", "showLoading", "viewModelClass", "Ljava/lang/Class;", "app_debug"})
public abstract class BaseActivity<T extends androidx.databinding.ViewDataBinding, M extends com.example.basemvvm.ui.base.BaseViewModel> extends dagger.android.support.DaggerAppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    protected T binding;
    @org.jetbrains.annotations.NotNull()
    protected M viewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    protected androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected final T getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull()
    T p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final M getViewModel() {
        return null;
    }
    
    protected final void setViewModel(@org.jetbrains.annotations.NotNull()
    M p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    protected final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @androidx.annotation.LayoutRes()
    protected abstract int layoutRes();
    
    @org.jetbrains.annotations.NotNull()
    protected abstract java.lang.Class<M> viewModelClass();
    
    protected abstract void handleViewState();
    
    protected abstract void initView();
    
    public abstract void showLoading();
    
    public abstract void hideLoading();
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * we register the BaseActivity as subscriber
     * and specify what needs to be done in case of NetworkState
     */
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    public BaseActivity() {
        super();
    }
}