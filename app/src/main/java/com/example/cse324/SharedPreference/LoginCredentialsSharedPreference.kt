package com.example.cse324.SharedPreference

import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.preference.PreferenceManager
import com.example.cse324.R
import com.example.cse324.databinding.ActivityLoginCredentialsSharedPreferenceBinding

class LoginCredentialsSharedPreference : AppCompatActivity() {
    private lateinit var binding : ActivityLoginCredentialsSharedPreferenceBinding
    private lateinit var listener : SharedPreferences.OnSharedPreferenceChangeListener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginCredentialsSharedPreferenceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // To change the ui through the settings checkBox
        val manager = PreferenceManager.getDefaultSharedPreferences(this)
        listener = SharedPreferences.OnSharedPreferenceChangeListener { sharedPreferences, key ->
            if(key.equals("Change_ui")){
                if(manager.getBoolean("Change_ui",false) == true){
                    binding.sharePreferenceActivityLayout.setBackgroundColor(Color.BLACK)
                    binding.email.setTextColor(Color.WHITE)
                    binding.pass.setTextColor(Color.WHITE)
                    binding.loginBtn.setBackgroundColor(Color.DKGRAY)
                    binding.loginBtn.setTextColor(Color.WHITE)
                }else{
                    binding.sharePreferenceActivityLayout.setBackgroundColor(Color.WHITE)
                    binding.email.setTextColor(Color.BLACK)
                    binding.pass.setTextColor(Color.BLACK)
                    binding.loginBtn.setBackgroundColor(Color.BLACK)
                    binding.loginBtn.setTextColor(Color.BLACK)
                }
            }
        }
        manager.registerOnSharedPreferenceChangeListener(listener)

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
//            startActivity(Intent(this, ActivityLevelPreference::class.java))
            startActivity(Intent(this, SettingsActivity::class.java))
        }
    }
}