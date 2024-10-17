package com.example.cse324.Toast

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cse324.R
import android.widget.Toast

class Toast : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)

        val toastButton : Button = findViewById(R.id.toastBtn)
        toastButton.setOnClickListener {
//            android.widget.Toast

           Toast.makeText(this, "This is sample Toast", Toast.LENGTH_SHORT).show()
        }
    }
}