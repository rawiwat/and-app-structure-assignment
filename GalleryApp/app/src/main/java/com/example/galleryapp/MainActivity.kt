package com.example.galleryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.firework)
        imageView.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.firework_background))
        val imageView2 = findViewById<ImageView>(R.id.shoes)
        imageView.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.Shoes_background))
    }
}