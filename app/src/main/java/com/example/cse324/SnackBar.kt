package com.example.cse324

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
//import android.widget.Toast
import com.example.cse324.databinding.ActivitySnackBarBinding
import com.google.android.material.snackbar.Snackbar

class SnackBar : AppCompatActivity() {
    private lateinit var binding: ActivitySnackBarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySnackBarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fun SnackBar(view: View) {
            val snackbar_layout : View = binding.main
//            val snackbar_layout : View = findViewById<View>(R.id.main)
            val snackbar = Snackbar.make(snackbar_layout,"Hii this is sample snackBar",Snackbar.LENGTH_INDEFINITE)
            snackbar.setAction("band kro"){
                Log.e("SnackBar","button clicked")
            }
            snackbar.setBackgroundTint(Color.GRAY)
            snackbar.setActionTextColor(Color.YELLOW)
            snackbar_layout.setBackgroundColor(Color.DKGRAY)

                snackbar.show()
        }

//        Toast.makeText()
        val snackBarBtn : Button = findViewById(R.id.snackBtn)
        snackBarBtn.setOnClickListener {it
            Log.w("SnackBtn","be Carefull!!")
            SnackBar(it)
        }
    }
}

//   28 - 308