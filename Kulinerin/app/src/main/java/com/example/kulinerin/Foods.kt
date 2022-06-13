package com.example.kulinerin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Food(
        var name: String,
        var lokasi : String,
        val photo: Int,
        var resep : String,






        ) : Parcelable
