package com.example.indoretour.ui.main.adapter

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.indoretour.R
import com.example.indoretour.databinding.ItemViewPlacesBinding
import com.example.indoretour.model.Places
import com.example.indoretour.utils.setOnSingleClickListener

/**
 * Created by @author Deepak Dawade on 5/31/20.
 * Copyright (c) 2020 deepakdawade.dd@gmail.com All rights reserved.
 */
class PlaceViewHolder(private val binding: ItemViewPlacesBinding) : RecyclerView.ViewHolder(binding.root){
    private val resources = binding.root.resources
    fun bind(places: Places,onClick:(places:Places)->Unit){
        binding.title.text = places.title
        binding.title.setOnSingleClickListener {
            onClick(places)
        }
    }
}