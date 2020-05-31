package com.example.indoretour.model

import androidx.annotation.StringRes
import java.io.Serializable

/**
 * Created by @author Deepak Dawade on 5/31/20.
 * Copyright (c) 2020 deepakdawade.dd@gmail.com All rights reserved.
 */
data class Places(
    val title:String,
    val imageUrl:String,
    @StringRes
    val description: Int,
    val shareUrl:String
):Serializable
