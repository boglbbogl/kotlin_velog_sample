package com.example.kotlinvelogsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonEvent = findViewById<Button>(R.id.buttonEvent)
        buttonEvent.setOnClickListener{
            print("click")
        }
    }
}