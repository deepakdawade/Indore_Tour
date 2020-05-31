package com.example.indoretour.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.indoretour.R
import com.example.indoretour.databinding.ActivityMainBinding
import com.example.indoretour.model.Places
import com.example.indoretour.ui.details.DetailActivity
import com.example.indoretour.ui.main.adapter.PlacesAdapter

/**
 * Created by @author Deepak Dawade on 5/31/20.
 * Copyright (c) 2020 deepakdawade.dd@gmail.com All rights reserved.
 */
class MainActivity : AppCompatActivity(), PlacesAdapter.HandleClickListener {
    private lateinit var binding: ActivityMainBinding
    private val placesAdapter by lazy { PlacesAdapter(this) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setupView()
    }

    private fun setupView() {
        binding.rvPlaces.apply {
            adapter = placesAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }

    override fun onClick(places: Places) {
        startActivity(DetailActivity.startIntent(this, places))
    }
}
