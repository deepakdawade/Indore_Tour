package com.example.indoretour.ui.details

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.example.indoretour.R
import com.example.indoretour.databinding.ActivityDetailBinding
import com.example.indoretour.model.Places
import com.example.indoretour.ui.webview.IndoreWebView
import com.example.indoretour.utils.setOnSingleClickListener

/**
 * Created by @author Deepak Dawade on 5/31/20.
 * Copyright (c) 2020 deepakdawade.dd@gmail.com All rights reserved.
 */
class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_detail)
        setSupportActionBar(binding.toolbar)
        setupView()
    }
    private fun setupView(){
        val places = intent.getSerializableExtra(PLACES_KEY) as Places
        binding.apply {
            toolbar.title = places.title
            headerTitle.text = String.format(resources.getString(R.string.place_title),places.title)
            placeDesc.text = getString(places.description)
            Glide.with(headerImage).load(places.imageUrl).placeholder(R.drawable.ic_launcher_foreground).into(headerImage)
            toolbar.setNavigationOnClickListener {
                onBackPressed()
            }
        }
        binding.exploreMore.setOnSingleClickListener {
            startActivity(IndoreWebView.getStartIntent(this,places.shareUrl))
        }
        binding.share.setOnSingleClickListener {
            shareVia(places.shareUrl)
        }
    }

    private fun shareVia(shareUrl: String) {
        val message = "I found this amazing place in indore that we can visit,\nsee full description by this click below link.\n $shareUrl"
        val sendIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, message)
            type = "text/plain"
        }

        val shareIntent = Intent.createChooser(sendIntent, null)
        startActivity(shareIntent)


    }

    companion object{
        const val PLACES_KEY = "places_key"
        fun startIntent(context: Context,place:Places): Intent {
            return Intent(context,DetailActivity::class.java).apply{
                putExtra(PLACES_KEY,place)
            }
        }
    }
}