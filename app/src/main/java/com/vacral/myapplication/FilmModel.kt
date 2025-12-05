package com.vacral.myapplication

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class FilmModel(
    val img: String,
    val name: String,
    val rating: String
) : Parcelable