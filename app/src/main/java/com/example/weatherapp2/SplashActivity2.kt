package com.example.weatherapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash2)
        Handler(Looper.getMainLooper()).postDelayed({
        val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        },3000)
    }
}