package com.example.basemvvm.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\'J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\'J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\'\u00a8\u0006\u001a"}, d2 = {"Lcom/example/basemvvm/di/module/ViewModelModule;", "", "()V", "bindListCategoryViewModel", "Landroidx/lifecycle/ViewModel;", "listCategoryViewModel", "Lcom/example/basemvvm/ui/list_category/ListCategoryViewModel;", "bindLoginViewModel", "loginViewModel", "Lcom/example/basemvvm/ui/login/LoginViewModel;", "bindMainViewModel", "mainViewModel", "Lcom/example/basemvvm/ui/main/MainViewModel;", "bindRegisterViewModel", "registerViewModel", "Lcom/example/basemvvm/ui/register/RegisterViewModel;", "bindSignupViewModel", "signupViewModel", "Lcom/example/basemvvm/ui/signup/SignupViewModel;", "bindSplashViewModel", "splashViewModel", "Lcom/example/basemvvm/ui/splash/SplashViewModel;", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/example/basemvvm/di/util/ViewModelFactory;", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.example.basemvvm.di.util.ViewModelFactory factory);
    
    @org.jetbrains.annotations.NotNull()
    @com.example.basemvvm.di.util.ViewModelKey(value = com.example.basemvvm.ui.main.MainViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindMainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.basemvvm.ui.main.MainViewModel mainViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.example.basemvvm.di.util.ViewModelKey(value = com.example.basemvvm.ui.splash.SplashViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindSplashViewModel(@org.jetbrains.annotations.NotNull()
    com.example.basemvvm.ui.splash.SplashViewModel splashViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.example.basemvvm.di.util.ViewModelKey(value = com.example.basemvvm.ui.register.RegisterViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindRegisterViewModel(@org.jetbrains.annotations.NotNull()
    com.example.basemvvm.ui.register.RegisterViewModel registerViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.example.basemvvm.di.util.ViewModelKey(value = com.example.basemvvm.ui.signup.SignupViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindSignupViewModel(@org.jetbrains.annotations.NotNull()
    com.example.basemvvm.ui.signup.SignupViewModel signupViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.example.basemvvm.di.util.ViewModelKey(value = com.example.basemvvm.ui.login.LoginViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindLoginViewModel(@org.jetbrains.annotations.NotNull()
    com.example.basemvvm.ui.login.LoginViewModel loginViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.example.basemvvm.di.util.ViewModelKey(value = com.example.basemvvm.ui.list_category.ListCategoryViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindListCategoryViewModel(@org.jetbrains.annotations.NotNull()
    com.example.basemvvm.ui.list_category.ListCategoryViewModel listCategoryViewModel);
    
    public ViewModelModule() {
        super();
    }
}