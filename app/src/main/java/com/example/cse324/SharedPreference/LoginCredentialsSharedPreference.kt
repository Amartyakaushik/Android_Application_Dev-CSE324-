package com.example.cse324.SharedPreference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cse324.R
import com.example.cse324.databinding.ActivityLoginCredentialsSharedPreferenceBinding

class LoginCredentialsSharedPreference : AppCompatActivity() {
    private lateinit var binding : ActivityLoginCredentialsSharedPreferenceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginCredentialsSharedPreferenceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val loginBtn = binding.loginBtn
        loginBtn.setOnClickListener {
            val editor = getSharedPreferences("AUTH_DETAILS",  MODE_PRIVATE).edit()
            editor.putString("email", binding.email.text.toString())
            editor.putString("pass",binding.pass.text.toString())
            editor.apply()
        }
    }
}