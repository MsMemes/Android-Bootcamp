package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.idClickMe)
        val txtMainText = findViewById<TextView>(R.id.idMainText)
        var timesClicked = 0
        btnClickMe.setOnClickListener {
            timesClicked += 1

            txtMainText.text = timesClicked.toString()
        }
    }
}