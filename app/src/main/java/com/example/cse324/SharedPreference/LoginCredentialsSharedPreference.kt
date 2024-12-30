package com.example.cse324.SharedPreference

import android.content.Intent
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

        // now to access the data every time the user opens the application.
        val editor = getSharedPreferences("AUTH_DETAILS",  MODE_PRIVATE)
        binding.email.setText(editor.getString("email", null))
        binding.pass.setText(editor.getString("pass", null))

        val loginBtn = binding.loginBtn
        loginBtn.setOnClickListener {
            val editor = getSharedPreferences("AUTH_DETAILS",  MODE_PRIVATE).edit()
            editor.putString("email", binding.email.text.toString())
            editor.putString("pass",binding.pass.text.toString())
            editor.apply()
        }

        binding.settings.setOnClickListener {
            startActivity(Intent(this, ActivityLevelPreference::class.java))
        }
    }
}