package com.example.cse324.HomeWork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.cse324.R

class HWRelativeLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hwrelative_layout)

        val detail : TextView = findViewById(R.id.details)
        val intent = intent
        var data = intent.getStringExtra("myUserName")
        detail.text = data
    }
}