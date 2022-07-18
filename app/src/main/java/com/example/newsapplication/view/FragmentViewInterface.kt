package com.example.newsapplication.view

import com.example.newsapplication.model.Responses

interface FragmentViewInterface {
    fun onSuccess(responses: Responses)
    fun onError()
}
