package com.example.indoretour.ui.webview

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.indoretour.R
import com.example.indoretour.databinding.ActivityIndoreWebViewBinding

/**
 * Created by @author Deepak Dawade on 5/31/20.
 * Copyright (c) 2020 deepakdawade.dd@gmail.com All rights reserved.
 */
private const val BASE_URL =
    "https://www.holidify.com/places/indore/sightseeing-and-things-to-do.html"

class IndoreWebView : AppCompatActivity() {
    private lateinit var binding: ActivityIndoreWebViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_indore_web_view)
        val url = intent.getStringExtra(WEB_URL) ?: BASE_URL
        binding.webView.apply {
            settings.javaScriptEnabled = true
            webViewClient = WebViewClient()
            loadUrl(url)
        }

    }

    override fun onBackPressed() {
        if (binding.webView.canGoBack()) binding.webView.goBack() else super.onBackPressed()

    }

    companion object {
        private const val WEB_URL = "web_url"
        fun getStartIntent(context: Context, webUrl: String) =
            Intent(context, IndoreWebView::class.java).apply {
                putExtra(WEB_URL, webUrl)
            }
    }
}