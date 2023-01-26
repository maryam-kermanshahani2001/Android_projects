package com.example.hw2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ShowPoemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_poem)
        val startBtn: Button = findViewById(R.id.startBtn)
        startBtn.setOnClickListener {
            roll()
        }
        roll()

    }

    private fun roll() {
        val randomNumber = (1..5).random()
        val poetImage: ImageView = findViewById(R.id.poemIv)
        when (randomNumber) {
            1 -> poetImage.setImageResource(R.drawable.p1)
            2 -> poetImage.setImageResource(R.drawable.p2)
            3 -> poetImage.setImageResource(R.drawable.p3)
            4 -> poetImage.setImageResource(R.drawable.p4)
            5 -> poetImage.setImageResource(R.drawable.p5)

        }
        poetImage.contentDescription = randomNumber.toString()
    }
}