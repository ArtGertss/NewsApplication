package com.example.newsapplication.di

import android.content.Context
import com.example.newsapplication.data.api.ApiInterface
import com.example.newsapplication.data.api.ApiService
import com.example.newsapplication.view.FragmentViewInterface
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(val context: Context, val view: FragmentViewInterface) {
    @Provides
    @Singleton
    fun provideContext(): Context = context

    @Provides
    @Singleton
    fun provideApiInterface(): ApiInterface = ApiService().getApi()

    @Provides
    @Singleton
    fun provideView(): FragmentViewInterface = view
}
