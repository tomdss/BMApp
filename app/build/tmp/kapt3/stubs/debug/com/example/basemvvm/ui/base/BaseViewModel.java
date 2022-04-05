package com.example.basemvvm.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0004@\u0004X\u0085.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0014"}, d2 = {"Lcom/example/basemvvm/ui/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "apiRepository", "Lcom/example/basemvvm/data/repository/ApiRepository;", "getApiRepository", "()Lcom/example/basemvvm/data/repository/ApiRepository;", "setApiRepository", "(Lcom/example/basemvvm/data/repository/ApiRepository;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "viewState", "Lcom/example/basemvvm/ui/base/SingleLiveEvent;", "", "getViewState", "()Lcom/example/basemvvm/ui/base/SingleLiveEvent;", "onCleared", "", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    protected com.example.basemvvm.data.repository.ApiRepository apiRepository;
    @org.jetbrains.annotations.NotNull()
    private final com.example.basemvvm.ui.base.SingleLiveEvent<java.lang.Integer> viewState = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final com.example.basemvvm.data.repository.ApiRepository getApiRepository() {
        return null;
    }
    
    protected final void setApiRepository(@org.jetbrains.annotations.NotNull()
    com.example.basemvvm.data.repository.ApiRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.basemvvm.ui.base.SingleLiveEvent<java.lang.Integer> getViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.disposables.CompositeDisposable getDisposable() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public BaseViewModel() {
        super();
    }
}