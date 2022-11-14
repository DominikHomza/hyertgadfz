package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
            findViewById<ImageView>(R.id.imageView7).setImageResource(R.drawable.obrazek2)
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            findViewById<ImageView>(R.id.imageView7).setImageResource(R.drawable.obrazek)
        }
        findViewById<Button>(R.id.button3).setOnClickListener {

            findViewById<ImageView>(R.id.imageView7).setImageResource(R.drawable.obrazek3)
        }

    }
}