package com.example.bootcampday1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val user = intent.getStringExtra("User")
        val textView = findViewById<TextView>(R.id.tvOffer)
        val message = "Hello, $user! Here are some offers for you."
        textView.text = message
    }
}