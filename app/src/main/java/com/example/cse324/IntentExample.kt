package com.example.cse324

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cse324.databinding.ActivityIntentExampleBinding

class IntentExample : AppCompatActivity() {
    private lateinit var binding: ActivityIntentExampleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}