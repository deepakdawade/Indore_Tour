package com.example.indoretour.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.indoretour.R
import com.example.indoretour.databinding.ItemViewPlacesBinding
import com.example.indoretour.model.Places

/**
 * Created by @author Deepak Dawade on 5/31/20.
 * Copyright (c) 2020 deepakdawade.dd@gmail.com All rights reserved.
 */
class PlacesAdapter(private val listener: HandleClickListener) :
    RecyclerView.Adapter<PlaceViewHolder>() {
    private val placeList: MutableList<Places> = ArrayList()

    init {
        loadData()
    }

    fun addAll(list: List<Places>) {
        placeList.clear()
        placeList.addAll(list)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {
        return PlaceViewHolder(
            ItemViewPlacesBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = placeList.size

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {
        holder.bind(places = placeList[position], onClick = listener::onClick)
    }

    interface HandleClickListener {
        fun onClick(places: Places)
    }

    private fun loadData() {
        placeList.apply {
            add(
                Places(
                    title = "Lal Bagh Palace",
                    imageUrl = "https://www.holidify.com/images/compressed/thumbnail/3550.jpg",
                    description = R.string.lal_baagh_desc,
                    shareUrl = "https://www.holidify.com/places/indore/lal-bagh-palace-sightseeing-2100.html"
                )
            )
            add(
                Places(
                    title = "Rajwada",
                    imageUrl = "https://www.holidify.com/images/cmsuploads/thumbnail/3551_20190228103219.jpg",
                    description = R.string.rajwada_desc,
                    shareUrl = "https://www.holidify.com/places/indore/rajwada-sightseeing-2101.html"
                )
            )
            add(
                Places(
                    title = "City Shopping",
                    imageUrl = "https://www.holidify.com/images/compressed/thumbnail/6916.jpg",
                    description = R.string.city_shpooing_desc,
                    shareUrl = "https://www.holidify.com/places/indore/city-shopping-sightseeing-2097.html"
                )
            )
            add(
                Places(
                    title = "Kanch Mandir",
                    imageUrl = "https://curlytales.com/wp-content/uploads/2019/04/golden-735x413.jpg",
                    description = R.string.kanch_mandire_desc,
                    shareUrl = "https://www.holidify.com/places/indore/kanch-mandir-sightseeing-2099.html"
                )
            )
            add(
                Places(
                    title = "Bada Ganpati",
                    imageUrl = "https://www.holidify.com/images/compressed/8075.jpg",
                    description = R.string.bada_ganapati_desc,
                    shareUrl = "https://www.holidify.com/places/indore/bada-ganpati-sightseeing-2095.html"
                )
            )
            add(
                Places(
                    title = "Annapurna temple",
                    imageUrl = "https://www.holidify.com/images/cmsuploads/compressed/shutterstock_214875118_20200311114854.png",
                    description = R.string.annapurna_temple_desc,
                    shareUrl = "https://www.holidify.com/places/indore/annapurna-temple-sightseeing-2094.html"
                )
            )
            add(
                Places(
                    title = "Chhappan Dukan",
                    imageUrl = "https://www.holidify.com/images/compressed/8058.jpg",
                    description = R.string.annapurna_temple_desc,
                    shareUrl = "https://www.holidify.com/places/indore/chhappan-dukan-sightseeing-6232.html"
                )
            )
            add(
                Places(
                    title = "Gommat Giri",
                    imageUrl = "https://www.holidify.com/images/compressed/8070.jpg",
                    description = R.string.gomat_giri_desc,
                    shareUrl = "https://www.holidify.com/places/indore/gommat-giri-sightseeing-2098.html"
                )
            )
            add(
                Places(
                    title = "Chhatris",
                    imageUrl = "https://www.holidify.com/images/compressed/8250.jpg",
                    description = R.string.chhatris_desc,
                    shareUrl = "https://www.holidify.com/places/indore/chhatris-sightseeing-2096.html"
                )
            )
            add(
                Places(
                    title = "Khajrana Temple",
                    imageUrl = "https://www.holidify.com/images/compressed/8011.jpg",
                    description = R.string.khajrana_temple_desc,
                    shareUrl = "https://www.holidify.com/places/indore/khajrana-temple-sightseeing-6230.html"
                )
            )
            add(
                Places(
                    title = "Sarafa Bazaar",
                    imageUrl = "https://www.holidify.com/images/cmsuploads/compressed/city-dish-meal-food-vendor-asia-723282-pxhere.com_20190329112931_20190329113022.jpg",
                    description = R.string.gomat_giri_desc,
                    shareUrl = "https://www.holidify.com/places/indore/sarafa-bazaar-sightseeing-122312.html"
                )
            )
            add(
                Places(
                    title = "Rang Panchmi",
                    imageUrl = "https://www.holidify.com/images/compressed/7694.jpg",
                    description = R.string.rang_panchami_desc,
                    shareUrl = "https://www.holidify.com/places/indore/rang-panchmi-sightseeing-6231.html"
                )
            )
            add(
                Places(
                    title = "Patalpani Waterfall",
                    imageUrl = "https://www.holidify.com/images/cmsuploads/compressed/Patalpani_Waterfall_20190116141322.jpg",
                    description = R.string.patal_pani_desc,
                    shareUrl = "https://www.holidify.com/places/indore/patalpani-waterfall-sightseeing-122314.html"
                )
            )
            add(
                Places(
                    title = "Pipliyapala Regional Park",
                    imageUrl = "https://www.holidify.com/images/cmsuploads/compressed/391255_468867509791687_1009790156_n_20190329111621_20190329111635.jpg",
                    description = R.string.pipliyapala_desc,
                    shareUrl = "https://www.holidify.com/places/indore/pipliyapala-regional-park-sightseeing-122313.html"
                )
            )
            add(
                Places(
                    title = "ISKCON Indore",
                    imageUrl = "https://www.holidify.com/images/cmsuploads/compressed/Iskcon-elevation-2-New-Copy-1400x500_20190329111300_20190329111315.jpg",
                    description = R.string.iskcon_desc,
                    shareUrl = "https://www.holidify.com/places/indore/iskcon-indore-sightseeing-122315.html"
                )
            )
            add(
                Places(
                    title = "Indore White Church",
                    imageUrl = "https://www.holidify.com/images/cmsuploads/compressed/27712386702_a3c32fba12_o_20190329111117_20190329111134.jpg",
                    description = R.string.indore_white_church_desc,
                    shareUrl = "https://www.holidify.com/places/indore/indore-white-church-sightseeing-122318.html"
                )
            )
            add(
                Places(
                    title = "Ralamandal Wildlife Sanctuary",
                    imageUrl = "https://www.holidify.com/images/cmsuploads/compressed/1024px-Entrance_to_Ralamandal_sanctuary2C_near_Indore_20190729133919.JPG",
                    description = R.string.ralamandal_desc,
                    shareUrl = "https://www.holidify.com/places/indore/ralamandal-wildlife-sanctuary-sightseeing-122317.html"
                )
            )
            add(
                Places(
                    title = "Bijasen Tekri",
                    imageUrl = "https://www.holidify.com/images/cmsuploads/compressed/3107544593_0c81b6923c_o_20190329110230_20190329110250.jpg",
                    description = R.string.bijasen_tekri_desc,
                    shareUrl = "https://www.holidify.com/places/indore/bijasen-tekri-sightseeing-122320.html"
                )
            )
            add(
                Places(
                    title = "Nehru Park, Indore",
                    imageUrl = "https://www.holidify.com/images/cmsuploads/compressed/7449513656_3f022987a3_b_20190329110510_20190329110528.jpg",
                    description = R.string.nehru_park_desc,
                    shareUrl = "https://www.holidify.com/places/indore/nehru-park-sightseeing-122319.html"
                )
            )
            add(
                Places(
                    title = "Kamla Nehru Prani Sangrahalay",
                    imageUrl = "https://www.holidify.com/images/cmsuploads/compressed/5_20190329102552.JPG",
                    description = R.string.kamal_nehru_desc,
                    shareUrl = "https://www.holidify.com/places/indore/kamla-nehru-prani-sangrahalay-sightseeing-122322.html"
                )
            )
            add(
                Places(
                    title = "Indore Museum",
                    imageUrl = "https://www.holidify.com/images/cmsuploads/compressed/6536624855_fb465174bf_b_20190329105519_20190329105536.jpg",
                    description = R.string.indore_musem_desc,
                    shareUrl = "https://www.holidify.com/places/indore/indore-museum-sightseeing-122321.html"
                )
            )
            add(
                Places(
                    title = "Meghdoot Garden",
                    imageUrl = "https://www.holidify.com/images/cmsuploads/compressed/4792025927_b56017a194_z_20190329102146_20190329102206.jpg",
                    description = R.string.meghdoot_garden_desc,
                    shareUrl = "https://www.holidify.com/places/indore/meghdoot-garden-sightseeing-122323.html"
                )
            )
            add(
                Places(
                    title = " Mohadi Falls",
                    imageUrl = "https://www.holidify.com/images/cmsuploads/compressed/download_20180517181815_20181003150743.jpeg",
                    description = R.string.mohandi_falls_desc,
                    shareUrl = "https://www.holidify.com/places/indore/mohadi-falls-sightseeing-124727.html"
                )
            )
            add(
                Places(
                    title = " Geeta Bhawan",
                    imageUrl = "https://www.holidify.com/images/cmsuploads/compressed/Mgmmccollege_20190329100741_20190329100802.jpg",
                    description = R.string.geeta_bhavan_desc,
                    shareUrl = "https://www.holidify.com/places/indore/geeta-bhawan-sightseeing-122324.html"
                )
            )
            add(
                Places(
                    title = "Gandhi Hall",
                    imageUrl = "https://www.holidify.com/images/cmsuploads/compressed/Image_0217_%2528Indore%2529_20190116141326.png",
                    description = R.string.gandhi_hall_desc,
                    shareUrl = "https://www.holidify.com/places/indore/gandhi-hall-sightseeing-122325.html"
                )
            )
            add(
                Places(
                    title = "Tincha Falls",
                    imageUrl = "https://www.holidify.com/images/cmsuploads/compressed/Tincha_Fall_20181003154942.jpg",
                    description = R.string.tincha_fall_desc,
                    shareUrl = "https://www.holidify.com/places/indore/tincha-falls-sightseeing-124092.html"
                )
            )
            add(
                Places(
                    title = " Patalpani Waterfalls",
                    imageUrl = "https://www.holidify.com/images/cmsuploads/compressed/Patalpani_Waterfall_20180807213839.jpg",
                    description = R.string.patalpani_desc,
                    shareUrl = "https://www.holidify.com/places/indore/patalpani-waterfalls-sightseeing-124091.html"
                )
            )
            add(
                Places(
                    title = "Bamniya Kund",
                    imageUrl = "https://www.holidify.com/images/cmsuploads/compressed/Kanthanpara_waterfalls_20180517182005_20181003154426.JPG",
                    description = R.string.bamniya_kund_desc,
                    shareUrl = "https://www.holidify.com/places/indore/bamniya-kund-sightseeing-124735.html"
                )
            )
            add(
                Places(
                    title = "Dharampuri",
                    imageUrl = "https://www.holidify.com/images/cmsuploads/compressed/Dharampuri_20181003160747.jpg",
                    description = R.string.dharampuri_desc,
                    shareUrl = "https://www.holidify.com/places/indore/dharampuri-sightseeing-124093.html"
                )
            )
            add(
                Places(
                    title = "Choral Dam",
                    imageUrl = "https://www.holidify.com/images/cmsuploads/compressed/15155968280_5eea887571_z_20190208105130.jpg",
                    description = R.string.choral_dam_desc,
                    shareUrl = "https://www.holidify.com/places/indore/choral-dam-sightseeing-124659.html"
                )
            )
            add(
                Places(
                    title = "Janapav",
                    imageUrl = "https://www.holidify.com/images/cmsuploads/compressed/shutterstock_554608309_20191025173548.jpg",
                    description = R.string.janapav_desc,
                    shareUrl = "https://www.holidify.com/places/indore/janapav-sightseeing-124110.html"
                )
            )
            add(
                Places(
                    title = "Hanuwantiya",
                    imageUrl = "https://www.holidify.com/images/cmsuploads/compressed/jalmahotsav_20180921122633.jpg",
                    description = R.string.hanuwantiya_desc,
                    shareUrl = "https://www.holidify.com/places/indore/hanuwantiya-sightseeing-124668.html"
                )
            )
            add(
                Places(
                    title = "Royal Museum",
                    imageUrl = "https://www.holidify.com/images/cmsuploads/compressed/royal-museum-indore-gpo-indore-tourist-attraction-1byg49j_20181121202235_20181121202447.jpg",
                    description = R.string.royal_museum_desc,
                    shareUrl = "https://www.holidify.com/places/indore/royal-museum-sightseeing-125128.html"
                )
            )
            add(
                Places(
                    title = "Kanha Museum",
                    imageUrl = "https://www.holidify.com/images/cmsuploads/compressed/kanha-museum-mandla-h-o-mandla-tourist-attraction-1ahy4s8_20181121203010_20181121203158.jpg",
                    description = R.string.kanha_museum_desc,
                    shareUrl = "https://www.holidify.com/places/indore/kanha-museum-sightseeing-125129.html"
                )
            )
            add(
                Places(
                    title = "Chhatri Bagh",
                    imageUrl = "https://www.holidify.com/images/cmsuploads/compressed/j_20181213222712.png",
                    description = R.string.chhatri_bagh_desc,
                    shareUrl = "https://www.holidify.com/places/indore/chhatri-bagh-sightseeing-1253372.html"
                )
            )
            add(
                Places(
                    title = "Chidiya Bhadak Fall",
                    imageUrl = "https://www.holidify.com/images/cmsuploads/compressed/a_20181223164939.PNG",
                    description = R.string.chidiya_bhadak_fall_desc,
                    shareUrl = "https://www.holidify.com/places/indore/chidiya-bhadak-fall-sightseeing-1253501.html"
                )
            )
            add(
                Places(
                    title = "Gidiya Khoh Waterfall",
                    imageUrl = "https://www.holidify.com/images/cmsuploads/compressed/b_20181223165548.PNG",
                    description = R.string.gidiya_khoh_waterfall_desc,
                    shareUrl = "https://www.holidify.com/places/indore/gidiya-khoh-waterfall-sightseeing-1253502.html"
                )
            )
            add(
                Places(
                    title = "Jogi Bhadak Waterfall",
                    imageUrl = "https://www.holidify.com/images/cmsuploads/compressed/c_20181223170011.PNG",
                    description = R.string.jogi_bhadak_waterfall_desc,
                    shareUrl = "https://www.holidify.com/places/indore/jogi-bhadak-waterfall-sightseeing-1253503.html"
                )
            )
        }
    }

}