package com.example.basemvvm.di.module

import com.example.basemvvm.data.repository.IApiRepository
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module(includes = [ViewModelModule::class])
class NetworkModule {
    @Singleton
    @Provides
    fun provideRetrofit(client: OkHttpClient): Retrofit {
        //TODO fix here
        return Retrofit.Builder().baseUrl("https/google.com")
            .client(client)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideApiService(retrofit: Retrofit): IApiRepository {
        return retrofit.create<IApiRepository>(IApiRepository::class.java)
    }

    @Provides
    @Singleton
    fun provideHttpClient(): OkHttpClient? {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        return OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
//            .addInterceptor(NetworkConnectionInterceptor())
//            .connectTimeout(Define.Network.DEFAULT_TIMEOUT, TimeUnit.SECONDS)
//            .readTimeout(Define.Network.DEFAULT_TIMEOUT, TimeUnit.SECONDS)
            .build()
    }
}