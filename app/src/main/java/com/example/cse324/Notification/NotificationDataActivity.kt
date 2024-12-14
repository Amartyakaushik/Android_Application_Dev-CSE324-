package com.example.cse324.Notification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cse324.R
import com.example.cse324.databinding.ActivityNotificationDataBinding

class NotificationDataActivity : AppCompatActivity() {
    private lateinit var binding : ActivityNotificationDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNotificationDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.content.setText(intent.getStringExtra("Next data"))
    }
}