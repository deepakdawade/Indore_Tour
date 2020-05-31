package com.example.indoretour.utils

import android.os.Handler
import android.view.View

/**
 * Created by @author Deepak Dawade on 5/31/20.
 * Copyright (c) 2020 deepakdawade.dd@gmail.com All rights reserved.
 */
fun View.setOnSingleClickListener(body:(View)->Unit){
    setOnClickListener {
        isEnabled = false
        body(it)
        Handler().postDelayed({
            parent?.run {
                isEnabled = true
            }
        },700)

    }
}