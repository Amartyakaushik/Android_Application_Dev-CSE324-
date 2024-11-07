package com.example.cse324.CA02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.cse324.databinding.ActivityCaMainPageBinding

class CaMainPage : AppCompatActivity() {
    private lateinit var binding: ActivityCaMainPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCaMainPageBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val taskInfo: EditText = binding.taskInfo
        val taskButton: Button = binding.taskButton
        val previousTasks = intent.getStringExtra("previousTasks") ?: ""

        taskButton.setOnClickListener {
            val newTask = taskInfo.text.toString()
            Toast.makeText(this,"Task Added",Toast.LENGTH_SHORT).show()

            val intent = Intent(this, TaskPage::class.java)
            intent.putExtra("info", newTask)
            intent.putExtra("previousTasks", previousTasks)
            startActivity(intent)
        }
    }
}
