package com.example.transportmarket.data

import java.io.Serializable

data class AnnouncementInformations (
    val markaSamochodu: String,
    val modelSamochodu: String,
    val rok: Int,
    val mocSilnika: Int,
    val pojemnoscSilnika: Int,
    val kosztWynajmu: Int,
    val imageResourceId: Int,
    val czyPremium: Boolean
    ) : Serializable
