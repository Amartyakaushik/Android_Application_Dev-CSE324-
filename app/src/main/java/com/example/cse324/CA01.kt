package com.example.cse324

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CA01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ca01)

        val singInButn:Button = findViewById(R.id.singInBtn)
        val UserId:EditText = findViewById(R.id.userId)
        val Receiver:TextView = findViewById(R.id.receiver)

        singInButn.setOnClickListener {
            val data = UserId.text.toString()
            Receiver.text = data
        }
    }
}