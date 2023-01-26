package com.example.hw2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val startBtn: Button = findViewById(R.id.startBtn)
        startBtn.setOnClickListener {
            val Intent = Intent(this, ShowPoemActivity::class.java)
            startActivity(Intent)
        }

        val aboutMe: Button = findViewById(R.id.aboutMeBtn)
        aboutMe.setOnClickListener {
            printAboutMe()
        }
    }

    private fun printAboutMe() {
        val Intent = Intent(this, AboutAppActivity::class.java)
        startActivity(Intent)
    }


}