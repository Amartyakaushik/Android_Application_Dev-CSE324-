package com.example.cse324

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cse324.HomeWork.DialerActivity
import com.example.cse324.HomeWork.HWLinearLayout

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val logInButton: Button = findViewById(R.id.loginbtn)
        logInButton.setOnClickListener{
//            val intent = Intent(this,callingActivity::class.java)
//            val intent = Intent(this,callingActivity!!::class.java)
            val intent2 = Intent(this,HWLinearLayout::class.java)
            startActivity(intent2)

        }

    }

}