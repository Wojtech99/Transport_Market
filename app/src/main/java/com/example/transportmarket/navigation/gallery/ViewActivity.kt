package com.example.transportmarket.navigation.gallery

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.transportmarket.R

class ViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        var modalItems:Int = intent.getSerializableExtra( "data") as Int
        val viewImage: ImageView = findViewById(R.id.viewImage)
        viewImage.setImageResource(modalItems!!)
    }
}