package com.example.cse324

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.cse324.HomeWork.DialerActivity
import com.example.cse324.HomeWork.HWLinearLayout
import com.example.cse324.HomeWork.HWRelativeLayout

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val logInButton: Button = findViewById(R.id.loginbtn)
        logInButton.setOnClickListener{
//            val intent = Intent(this,callingActivity::class.java)
//            val intent = Intent(this,callingActivity!!::class.java)
            val intent2 = Intent(this,HWLinearLayout::class.java)
            startActivity(intent2)

        }

        val loginBtn : Button = findViewById(R.id.loginbtn)
        var data : EditText = findViewById(R.id.useName)
        loginBtn.setOnClickListener {
        val  str = data.text.toString()
        val intent = Intent(this,HWRelativeLayout::class.java)
            intent.putExtra("myUserName",str)
            startActivity(intent)

        var receive_data : TextView = findViewById(R.id.receive_data)
            receive_data.text = str

        }





    }

}