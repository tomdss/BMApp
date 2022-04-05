package com.example.basemvvm.utils.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0001H\u0002J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bJ\u001c\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0012J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0001R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/basemvvm/utils/network/NetworkEvent;", "", "()V", "compositeDisposableMap", "Ljava/util/HashMap;", "Lio/reactivex/disposables/CompositeDisposable;", "subject", "Lio/reactivex/subjects/PublishSubject;", "Lcom/example/basemvvm/utils/network/NetworkState;", "getCompositeSubscription", "anyObject", "getSubject", "publish", "", "networkState", "register", "lifecycle", "action", "Lio/reactivex/functions/Consumer;", "unregister", "app_debug"})
public final class NetworkEvent {
    private static io.reactivex.subjects.PublishSubject<com.example.basemvvm.utils.network.NetworkState> subject;
    private static final java.util.HashMap<java.lang.Object, io.reactivex.disposables.CompositeDisposable> compositeDisposableMap = null;
    public static final com.example.basemvvm.utils.network.NetworkEvent INSTANCE = null;
    
    private final io.reactivex.subjects.PublishSubject<com.example.basemvvm.utils.network.NetworkState> getSubject() {
        return null;
    }
    
    private final io.reactivex.disposables.CompositeDisposable getCompositeSubscription(java.lang.Object anyObject) {
        return null;
    }
    
    public final void publish(@org.jetbrains.annotations.NotNull()
    com.example.basemvvm.utils.network.NetworkState networkState) {
    }
    
    public final void register(@org.jetbrains.annotations.NotNull()
    java.lang.Object lifecycle, @org.jetbrains.annotations.NotNull()
    io.reactivex.functions.Consumer<com.example.basemvvm.utils.network.NetworkState> action) {
    }
    
    public final void unregister(@org.jetbrains.annotations.NotNull()
    java.lang.Object lifecycle) {
    }
    
    private NetworkEvent() {
        super();
    }
}