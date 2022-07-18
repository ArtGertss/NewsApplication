package com.example.newsapplication.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.newsapplication.databinding.ActivityWebviewBinding


class WebViewActivity: AppCompatActivity() {

    private lateinit var binding: ActivityWebviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.webviewContent.loadUrl(intent.getStringExtra("URL").toString())

        binding.closeBtn.setOnClickListener{ finish() }
    }
}
