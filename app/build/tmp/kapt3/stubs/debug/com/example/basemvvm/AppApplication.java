package com.example.basemvvm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u000bH\u0016R\u001a\u0010\u0003\u001a\u00020\u0000X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\f"}, d2 = {"Lcom/example/basemvvm/AppApplication;", "Ldagger/android/support/DaggerApplication;", "()V", "instance", "getInstance", "()Lcom/example/basemvvm/AppApplication;", "setInstance", "(Lcom/example/basemvvm/AppApplication;)V", "applicationInjector", "Ldagger/android/AndroidInjector;", "onCreate", "", "app_debug"})
public final class AppApplication extends dagger.android.support.DaggerApplication {
    @org.jetbrains.annotations.NotNull()
    public com.example.basemvvm.AppApplication instance;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.basemvvm.AppApplication getInstance() {
        return null;
    }
    
    public final void setInstance(@org.jetbrains.annotations.NotNull()
    com.example.basemvvm.AppApplication p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected dagger.android.AndroidInjector<? extends dagger.android.support.DaggerApplication> applicationInjector() {
        return null;
    }
    
    public AppApplication() {
        super();
    }
}