package com.example.newsapplication.presenter

import android.content.Context
import android.widget.Toast
import com.example.newsapplication.repository.NewsRepo
import com.example.newsapplication.view.FragmentViewInterface
import io.reactivex.disposables.Disposable
import javax.inject.Inject

class NewsPresenter @Inject constructor (
    private val context: Context,
    private val view: FragmentViewInterface,
    private val newsRepo: NewsRepo
) : NewsPresenterInterface {

    private var disposable: Disposable? = null

    override fun loadNews() {
        Toast.makeText(context, "Loading news", Toast.LENGTH_SHORT).show()

        //get your country top headline news
         disposable = newsRepo.getNews("ru").subscribe(
             { view.onSuccess(it) },
             { view.onError() }
         )
    }

    override fun disposeNews() {
        disposable?.dispose()
    }

}
