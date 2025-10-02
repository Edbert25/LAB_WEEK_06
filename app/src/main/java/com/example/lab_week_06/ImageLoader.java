package com.example.lab_week_06;

import android.widget.ImageView; // <-- TAMBAHKAN IMPORT INI

public interface ImageLoader {
    // Ubah sintaks parameter ke format Java
    void loadImage(String imageUrl, ImageView imageView);
}


