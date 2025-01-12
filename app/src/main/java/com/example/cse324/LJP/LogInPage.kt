package com.example.cse324.LJP

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.cse324.R
import com.example.cse324.databinding.ActivityLogInPageBinding

class LogInPage : AppCompatActivity() {
    private lateinit var binding : ActivityLogInPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogInPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var email = binding.email
        var password = binding.password
        var loginBtn = binding.loginBtn
        loginBtn.setOnClickListener{
            startActivity(Intent(this,SplashScreen::class.java))
            startActivity(Intent(this,SplashScreen::class.java))
            Toast.makeText(this, "NOthing else", Toast.LENGTH_SHORT).show()

        }
    }
}