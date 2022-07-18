package com.example.newsapplication.view

interface ActivityViewInterface {
    fun openNews(url: String)
    fun onNetworkChanged(isConnected: Boolean)
}
