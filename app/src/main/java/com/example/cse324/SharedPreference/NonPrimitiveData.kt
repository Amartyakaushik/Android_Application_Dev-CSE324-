package com.example.cse324.SharedPreference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cse324.Class.UserDataSharedPreferences
import com.example.cse324.R
import com.example.cse324.databinding.ActivityNonPrimitiveDataBinding
import com.google.gson.Gson

class NonPrimitiveData : AppCompatActivity() {
    private lateinit var binding : ActivityNonPrimitiveDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNonPrimitiveDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //this is the implementation of non primitive type data
        val editor = getSharedPreferences("USER_DATA", MODE_PRIVATE)
        val user = Gson().fromJson(editor.getString("AUTH_DATA",null), UserDataSharedPreferences::class.java)
        binding.email.setText(user.email)
        binding.pass.setText(user.pass)

        binding.loginBtn.setOnClickListener {
            val editor = getSharedPreferences("USER_DATA", MODE_PRIVATE).edit()
            val user = UserDataSharedPreferences(binding.email.text.toString(), binding.pass.text.toString())
            val gson = Gson()
            val data = gson.toJson(user,UserDataSharedPreferences::class.java)
            editor.putString("AUTH_DATA",data)
            editor.apply()
        }
    }
}