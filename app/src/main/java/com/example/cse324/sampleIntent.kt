package com.example.cse324

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cse324.CA02.TaskPage

class sampleIntent : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_intent)

        val button : Button = findViewById(R.id.btn)
        val googleUrl = "https://www.google.com"
        button.setOnClickListener {
            val url = Uri.parse(googleUrl)
//            val intt = Intent(Intent.ACTION_VIEW,googleUrl)
//            startActivity(intt)
        }
    }
}