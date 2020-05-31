package com.example.indoretour.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.indoretour.R
import com.example.indoretour.ui.main.MainActivity

/**
 * Created by @author Deepak Dawade on 5/31/20.
 * Copyright (c) 2020 deepakdawade.dd@gmail.com All rights reserved.
 */
class SplashActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        },2000)
    }
}