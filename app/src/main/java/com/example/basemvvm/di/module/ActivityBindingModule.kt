package com.example.basemvvm.di.module

import com.example.basemvvm.ui.login.LoginFragment
import com.example.basemvvm.ui.main.MainActivity
import com.example.basemvvm.ui.register.RegisterFragment
import com.example.basemvvm.ui.signup.SignupFragment
import com.example.basemvvm.ui.splash.SplashFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun bindSplashFragment(): SplashFragment

    @ContributesAndroidInjector
    abstract fun bindRegisterFragment(): RegisterFragment

    @ContributesAndroidInjector
    abstract fun bindSignupFragment(): SignupFragment

    @ContributesAndroidInjector
    abstract fun bindLoginFragment(): LoginFragment

}