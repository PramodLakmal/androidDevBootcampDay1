package com.example.bootcampday1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val greetingTextView = findViewById<TextView>(R.id.tvHello)
        val inputField = findViewById<EditText>(R.id.tvName)
        val submitButton = findViewById<Button>(R.id.btnSubmit)
        val offersButton = findViewById<Button>(R.id.btnOffers)
        lateinit var enteredName: String

        submitButton.setOnClickListener {
            enteredName =  inputField.text.toString()

            if (enteredName.isEmpty()) {
                offersButton.visibility = Button.INVISIBLE
                inputField.error = "Please enter your name"
                return@setOnClickListener
            } else {
                val message = "Hello, $enteredName"
                greetingTextView.text = message
                inputField.text.clear()
                inputField.error = null
                offersButton.visibility = Button.VISIBLE
            }
        }

        offersButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("User", enteredName)
            startActivity(intent)
        }
    }
}