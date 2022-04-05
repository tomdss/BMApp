package com.example.basemvvm.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/example/basemvvm/di/module/ActivityBindingModule;", "", "()V", "bindListCategoryFragment", "Lcom/example/basemvvm/ui/list_category/ListCategoryFragment;", "bindLoginFragment", "Lcom/example/basemvvm/ui/login/LoginFragment;", "bindMainActivity", "Lcom/example/basemvvm/ui/main/MainActivity;", "bindRegisterFragment", "Lcom/example/basemvvm/ui/register/RegisterFragment;", "bindSignupFragment", "Lcom/example/basemvvm/ui/signup/SignupFragment;", "bindSplashFragment", "Lcom/example/basemvvm/ui/splash/SplashFragment;", "app_debug"})
@dagger.Module()
public abstract class ActivityBindingModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.example.basemvvm.ui.main.MainActivity bindMainActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.example.basemvvm.ui.splash.SplashFragment bindSplashFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.example.basemvvm.ui.register.RegisterFragment bindRegisterFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.example.basemvvm.ui.signup.SignupFragment bindSignupFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.example.basemvvm.ui.login.LoginFragment bindLoginFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.example.basemvvm.ui.list_category.ListCategoryFragment bindListCategoryFragment();
    
    public ActivityBindingModule() {
        super();
    }
}