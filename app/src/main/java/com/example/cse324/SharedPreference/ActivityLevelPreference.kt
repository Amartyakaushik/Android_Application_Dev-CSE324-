package com.example.cse324.SharedPreference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cse324.R
import com.example.cse324.databinding.ActivityLevelPreferenceBinding

class ActivityLevelPreference : AppCompatActivity() {
    private lateinit var binding : ActivityLevelPreferenceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLevelPreferenceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val editor = getPreferences(MODE_PRIVATE)
        binding.name.setText(editor.getString("name",null))
        binding.checkBox.isChecked = editor.getBoolean("isChecked",false)
        binding.save.setOnClickListener {
            val editor = getPreferences(MODE_PRIVATE).edit()
            editor.putString("name",binding.name.text.toString())
            editor.putBoolean("isChecked",binding.checkBox.isChecked)
            editor.apply()
        }
    }
}