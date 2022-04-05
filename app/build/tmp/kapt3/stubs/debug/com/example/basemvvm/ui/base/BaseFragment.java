package com.example.basemvvm.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H$J\u0006\u0010#\u001a\u00020 J\b\u0010$\u001a\u00020 H$J\b\u0010%\u001a\u00020\"H%J&\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u001a\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u00020\'2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0006\u00100\u001a\u00020 J\u000e\u00101\u001a\b\u0012\u0004\u0012\u00028\u000102H$R\u001c\u0010\u0007\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\r\u001a\u00020\u000e8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\u00028\u0001X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0019\u001a\u00020\u001a8\u0004@\u0004X\u0085.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u00063"}, d2 = {"Lcom/example/basemvvm/ui/base/BaseFragment;", "T", "Landroidx/databinding/ViewDataBinding;", "M", "Lcom/example/basemvvm/ui/base/BaseViewModel;", "Ldagger/android/support/DaggerFragment;", "()V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "sharedViewModel", "Lcom/example/basemvvm/ui/base/SharedViewModel;", "getSharedViewModel", "()Lcom/example/basemvvm/ui/base/SharedViewModel;", "sharedViewModel$delegate", "Lkotlin/Lazy;", "viewModel", "getViewModel", "()Lcom/example/basemvvm/ui/base/BaseViewModel;", "setViewModel", "(Lcom/example/basemvvm/ui/base/BaseViewModel;)V", "Lcom/example/basemvvm/ui/base/BaseViewModel;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "handleViewState", "", "viewState", "", "hideLoading", "initView", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showLoading", "viewModelClass", "Ljava/lang/Class;", "app_debug"})
public abstract class BaseFragment<T extends androidx.databinding.ViewDataBinding, M extends com.example.basemvvm.ui.base.BaseViewModel> extends dagger.android.support.DaggerFragment {
    @org.jetbrains.annotations.NotNull()
    protected T binding;
    @org.jetbrains.annotations.NotNull()
    protected M viewModel;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy sharedViewModel$delegate = null;
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
    protected final com.example.basemvvm.ui.base.SharedViewModel getSharedViewModel() {
        return null;
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
    
    protected abstract void handleViewState(int viewState);
    
    protected abstract void initView();
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void showLoading() {
    }
    
    public final void hideLoading() {
    }
    
    public BaseFragment() {
        super();
    }
}