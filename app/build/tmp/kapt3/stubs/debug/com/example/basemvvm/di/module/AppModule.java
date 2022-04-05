package com.example.basemvvm.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/example/basemvvm/di/module/AppModule;", "", "()V", "provideAppPreferences", "Lcom/example/basemvvm/data/preferences/AppPreferences;", "appPreferences", "provideContext", "Landroid/content/Context;", "application", "Landroid/app/Application;", "app_debug"})
@dagger.Module()
public abstract class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract android.content.Context provideContext(@org.jetbrains.annotations.NotNull()
    android.app.Application application);
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract com.example.basemvvm.data.preferences.AppPreferences provideAppPreferences(@org.jetbrains.annotations.NotNull()
    com.example.basemvvm.data.preferences.AppPreferences appPreferences);
    
    public AppModule() {
        super();
    }
}