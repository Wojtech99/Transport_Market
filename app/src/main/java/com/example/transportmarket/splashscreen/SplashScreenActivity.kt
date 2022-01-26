package com.example.transportmarket.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.transportmarket.MainActivity
import com.example.transportmarket.R

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val photoImage: ImageView = findViewById(R.id.photoSplashScreen)

        photoImage.setImageResource(R.drawable.yellow_pickup_icon)

        //powoduje pojawienie się spalshScreen
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
        }, 2500)
    }
}