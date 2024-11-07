package com.example.cse324.ActionBar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.example.cse324.R
import com.example.cse324.databinding.ActivityActionSampleBarBinding
import com.google.android.material.snackbar.Snackbar

class ActionSampleBar : AppCompatActivity() {
    private lateinit var binding :ActivityActionSampleBarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityActionSampleBarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val actionBar = supportActionBar
        actionBar!!.title = "Hey Divyanshu"
        actionBar.subtitle = "hugly gugly"
//        actionBar.setIcon(R.drawable.ic_brain)

        actionBar.setDisplayUseLogoEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true)

    }



    fun SnackBar(view: View) {
        val snackBar_layout = binding.sampleActionBar
        val snackbar = Snackbar.make(snackBar_layout, "Sample snackBar", Snackbar.LENGTH_SHORT)
        snackbar.setAction("close"){
            Log.w("SAMPLEsnack", "SnackBar: Sample snackbar")
        }

        snackbar.setBackgroundTint(Color.YELLOW)
        snackbar.setActionTextColor(Color.BLACK)
        snackBar_layout.setBackgroundColor(Color.DKGRAY)
        snackbar.show()
    }
    override fun onCreateOptionsMenu(menu: Menu?):Boolean{
        menuInflater.inflate(R.menu.menu_list, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem):Boolean{
        when(item.itemId){
            R.id.call_cut -> {
                Toast.makeText(this,"Shara ra shara ra",Toast.LENGTH_SHORT).show()
            }
            R.id.error -> {
                SnackBar(binding.sampleActionBar)
                Toast.makeText(this,"Errara ra Errara ra",Toast.LENGTH_SHORT).show()
            }
//            R.id.error
//            -> {
//                SnackBar(this@ActionSampleBar)
//            }
        }
        return super.onOptionsItemSelected(item)
    }
}