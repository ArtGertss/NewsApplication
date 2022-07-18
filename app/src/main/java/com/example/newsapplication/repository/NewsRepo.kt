package com.example.newsapplication.repository

import com.example.newsapplication.BuildConfig
import com.example.newsapplication.data.api.ApiInterface
import com.example.newsapplication.model.Responses
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class NewsRepo @Inject constructor (private val apiInterface: ApiInterface) : NewsRepoInterface {

    override fun getNews(country: String): Observable<Responses> =
        apiInterface.getNews(country, BuildConfig.NewsApiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())

}
