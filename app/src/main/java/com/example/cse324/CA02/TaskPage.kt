package com.example.cse324.CA02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.example.cse324.R
import com.example.cse324.databinding.ActivityTaskPageBinding

class TaskPage : AppCompatActivity() {
    private lateinit var binding: ActivityTaskPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTaskPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent
        val previousTasks = intent.getStringExtra("previousTasks") ?: ""
        val newTask = intent.getStringExtra("info")

        val updatedTasks: String
        if (previousTasks.isNotEmpty()) {
            updatedTasks = "$previousTasks\n$newTask"
            Log.e("taskAdd", "task Added", )

        } else {
            updatedTasks = "$newTask"
            Log.e("taskAdd", "task Added", )
        }

        val dataStoring: TextView = binding.dataStoring
        dataStoring.text = updatedTasks

        val backButton: Button = binding.backButton
        backButton.setOnClickListener {
            val intent2 = Intent(this, CaMainPage::class.java)
            intent2.putExtra("previousTasks", updatedTasks)
            startActivity(intent2)
        }
    }
}
