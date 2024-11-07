package com.example.cse324

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class NavSample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nav_sample)

        var navController = findNavController(R.id.containerView)
        var navBar = findViewById<BottomNavigationView>(R.id.nav_space)

        navBar.setupWithNavController(navController)
    }
}