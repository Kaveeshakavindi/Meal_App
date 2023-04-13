package com.example.mealapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    val dbButton = findViewById<Button>(R.id.button3)
    myButton.setOnClickListener {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

}