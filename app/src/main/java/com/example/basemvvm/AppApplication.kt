package com.example.basemvvm

import com.example.basemvvm.di.component.AppComponent
import com.example.basemvvm.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class AppApplication : DaggerApplication(){

    lateinit var instance : AppApplication

    override fun onCreate() {
        super.onCreate()
        instance = this

    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val component: AppComponent = DaggerAppComponent.builder().application(this).build()
        component.inject(this)
        return component
    }

}