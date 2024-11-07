package com.example.cse324

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class Roll17 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roll17)

        val spinnerCountry : Spinner = findViewById(R.id.country)
        val btnSubmit : Button = findViewById(R.id.btnsubmit)

        // Populate the spinner with country options
        val countries = arrayOf("India", "USA", "Canada", "UK", "Australia")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, countries)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerCountry.adapter = adapter

        // Handle form submission
        btnSubmit.setOnClickListener { view ->
            val selectedCountry = spinnerCountry.selectedItem.toString()

            // Validate Spinner selection
            if (selectedCountry.isEmpty()) {
                Snackbar.make(view, "Please select a country", Snackbar.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Selected Country: $selectedCountry", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

