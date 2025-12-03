package com.vacral.myapplication

import android.media.Image
import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.loadImg(img: String){
    Glide.with(this).load(img).into(this);

}