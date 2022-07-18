package com.example.newsapplication.di


import com.example.newsapplication.fragment.HomeFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(homeFragment: HomeFragment)
}
