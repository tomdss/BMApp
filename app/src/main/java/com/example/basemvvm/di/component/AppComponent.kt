package com.example.basemvvm.di.component

import android.app.Application
import com.example.basemvvm.AppApplication
import com.example.basemvvm.di.module.ActivityBindingModule
import com.example.basemvvm.di.module.AppModule
import com.example.basemvvm.di.module.NetworkModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, AppModule::class, AndroidSupportInjectionModule::class, ActivityBindingModule::class])
interface AppComponent : AndroidInjector<DaggerApplication> {

    fun inject(application: AppApplication)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent?
    }
}