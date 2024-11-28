package com.example.cse324

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cse324.databinding.ActivityPracticeQuestionBinding

class PracticeQuestion : AppCompatActivity() {
    private lateinit var binding: ActivityPracticeQuestionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPracticeQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = binding.name.text.toString()
        val call_btn = binding.callBtn
        val phoneNumber = binding.phoneNumber.text.toString()

        call_btn.setOnClickListener {
//            val intent = Intent(this, calling::class.java)
//            intent.putExtra("name", name)
//            startActivity(intent)
//
            val call = Uri.parse("tel:$phoneNumber")
            val intent = Intent(Intent.ACTION_DIAL,call)
            startActivity(intent)
        }
    }
}