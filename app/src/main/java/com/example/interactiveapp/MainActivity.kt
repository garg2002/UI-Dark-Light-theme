package com.example.interactiveapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDark= findViewById<Button>(R.id.btnDark)
        val buttonLight= findViewById<Button>(R.id.btnLight)
        val layout= findViewById<LinearLayout>(R.id.linearLayout)

        buttonLight.setOnClickListener {
            //Change to light mode
            layout.setBackgroundResource(R.color.white)
        }
        buttonDark.setOnClickListener {
            //Change to light mode
            layout.setBackgroundResource(R.color.black)
        }
    }
}