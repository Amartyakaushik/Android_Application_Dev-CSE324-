package com.example.cse324

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cse324.Class.CustomMenu

class MenuActivity : AppCompatActivity() {
    val customMenu = CustomMenu()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val menuButton : Button = findViewById(R.id.menuBtn)
        menuButton.setOnClickListener {
            customMenu.customMenuu(this,it)
        }
    }
}