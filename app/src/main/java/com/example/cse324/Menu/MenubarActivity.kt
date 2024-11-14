package com.example.cse324.Menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import com.example.cse324.R

class MenubarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menubar)

        // calling this activity's function to
        // use ActionBar utility methods

        val actionBar = supportActionBar

        // providing title for the ActionBar
        actionBar!!.title = "  GfG | Action Bar"

        // providing subtitle for the ActionBar
        actionBar.subtitle = "   Design a custom Action Bar"
//        actionBar.setBackgroundDrawable(@drawable)

        // adding icon in the ActionBar
//        actionBar.setIcon(R.drawable.avt01)

        // methods to display the icon in the ActionBar
        actionBar.setDisplayUseLogoEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        return super.onCreateOptionsMenu(menu)
//        menuInflater.inflate(R.menu.menu_app,menu)
//        return true
        menuInflater.inflate(R.menu.menu_list,menu)
        return  true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return  (
//        when(item.itemId)
//        {
//            R.id.mail -> {
//                Toast.makeText(this,"Search clicked",Toast.LENGTH_LONG).show()
//                true
//            }else -> super .onOptionsItemSelected(item)
//        }
//                )

//        return  (
                when(item.itemId)
                {
                    R.id.mail -> Toast.makeText(this,"Mail clicked",Toast.LENGTH_LONG).show()
                    R.id.upload -> Toast.makeText(this,"Upload clicked",Toast.LENGTH_LONG).show()
                    R.id.sharshare -> Toast.makeText(this,"Search clicked",Toast.LENGTH_LONG).show()

                }
                    return super.onOptionsItemSelected(item)

    }
}