package com.example.basemvvm.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/basemvvm/di/component/AppComponent;", "Ldagger/android/AndroidInjector;", "Lcom/example/basemvvm/AppApplication;", "inject", "", "application", "Builder", "app_debug"})
@dagger.Component(modules = {com.example.basemvvm.di.module.NetworkModule.class, com.example.basemvvm.di.module.AppModule.class, dagger.android.support.AndroidSupportInjectionModule.class, com.example.basemvvm.di.module.ActivityBindingModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent extends dagger.android.AndroidInjector<com.example.basemvvm.AppApplication> {
    
    @java.lang.Override()
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.basemvvm.AppApplication application);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/basemvvm/di/component/AppComponent$Builder;", "", "application", "Landroid/app/Application;", "build", "Lcom/example/basemvvm/di/component/AppComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.example.basemvvm.di.component.AppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        android.app.Application application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.example.basemvvm.di.component.AppComponent build();
    }
}