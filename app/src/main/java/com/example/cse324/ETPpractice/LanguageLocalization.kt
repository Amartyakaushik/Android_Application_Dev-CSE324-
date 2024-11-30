package com.example.cse324.ETPpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.cse324.R
import com.example.cse324.databinding.ActivityLanguageLocalizationBinding

class LanguageLocalization : AppCompatActivity() {
    private lateinit var spinner : Spinner
    public var languages = arrayOf("Select Lang", "English", "Hindi")
    private lateinit var binding : ActivityLanguageLocalizationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLanguageLocalizationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        spinner = binding.spinner
        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, languages)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
        spinner.setSelection(0)
        spinner.onItemSelectedListener

    }
}