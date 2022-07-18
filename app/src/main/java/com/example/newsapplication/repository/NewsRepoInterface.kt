package com.example.newsapplication.repository

import com.example.newsapplication.model.Responses
import io.reactivex.Observable

interface NewsRepoInterface {
    fun getNews(country: String): Observable<Responses>
}
