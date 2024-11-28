package com.example.cse324

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cse324.databinding.ActivityCallingBinding

class calling : AppCompatActivity() {
    private lateinit var binding: ActivityCallingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCallingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val phone_num = binding.pNumber
        val name = binding.name

        val myIntent = intent
        val naam = myIntent.getStringExtra("name")
        name.text = naam

    }
}