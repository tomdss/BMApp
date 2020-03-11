package com.example.basemvvm.di.module

import androidx.lifecycle.ViewModelProvider
import com.example.basemvvm.di.util.ViewModelFactory
import com.example.basemvvm.ui.main.MainActivity
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity

}