package com.example.lab_week_06

import android.content.Context // <-- IMPORT Context
import android.widget.ImageView // <-- IMPORT ImageView
import com.bumptech.glide.Glide // <-- IMPORT Glide

class GlideImageLoader(private val context: Context) : ImageLoader {
    override fun loadImage(imageUrl: String, imageView: ImageView) {
        Glide.with(context)
            .load(imageUrl)
            .centerCrop()
            .into(imageView)
    }
}
