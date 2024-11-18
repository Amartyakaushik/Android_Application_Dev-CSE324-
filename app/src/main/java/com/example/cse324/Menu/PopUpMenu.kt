package com.example.cse324.Menu


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast
import com.example.cse324.R

class PopUpMenu : AppCompatActivity() {
    lateinit var btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pop_up_menu)
        btn = findViewById(R.id.btn_pop_up)

        btn.setOnClickListener {
            val popUpMenu = PopupMenu(this, btn)
            popUpMenu.menuInflater.inflate(R.menu.pop_up_menu_list, popUpMenu.menu)
            popUpMenu.setOnMenuItemClickListener{ menuItem ->
                Toast.makeText(this, "You clicked" + menuItem.title, Toast.LENGTH_SHORT).show()
                if(menuItem.title === "Change Color"){
                    val color = resources.getColor(R.color.yellow)
                    btn.setBackgroundColor(color)
                }else if(menuItem.title === "cha"){
                    btn.text = "Clicked!"
                }
                true
            }
            popUpMenu.show()
        }
    }
}