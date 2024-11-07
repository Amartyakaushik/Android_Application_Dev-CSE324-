package com.example.cse324.Intent

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import com.example.cse324.R
import com.example.cse324.SnackBar

class IntentActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        val explicitBtn : Button = findViewById(R.id.explicitBtn)
        val implicitBtn : Button = findViewById(R.id.implicitBtn)
        val checkTheBox : CheckBox = findViewById(R.id.checkTheBox)
//        val ex : Button = findViewById(R.id.implicitBtn)

//        checkTheBox.setOnCheckedChangeListener { -, isChecked ->
//
//        }

        val checkButton : Button = findViewById(R.id.checkButton)
        checkButton.setOnClickListener {
            if(checkTheBox.isChecked){
                Toast.makeText(this, "Checked",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"Please agree to the terms and condition first",Toast.LENGTH_SHORT).show()
            }

        }
        explicitBtn.setOnClickListener {
            val intent = Intent(this,SnackBar::class.java)
            startActivity(intent)
        }

        val msg = "https://www.google.com"
        implicitBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(msg))
//            Uri.parse(msg)
//            startActivity(intent)

            val tel = "8538946343"
            val call = Uri.parse("tel:$tel")
            val intent2 = Intent(Intent.ACTION_DIAL,call)
//            startActivity(intent2)

            val text = "Hey this is Amartya"
            val num = "8538946343"
            val intent3 = Intent(Intent.ACTION_SENDTO)
            intent3.data = Uri.parse("smsto: $num")
            intent3.putExtra("sms_body",text)
//            startActivity(intent3)

            val location = "https://www.google.com/maps/place/Lovely+Professional+University/@31.2537118,75.6940468,2578m/data=!3m1!1e3!4m10!1m2!2m1!1slpu+location!3m6!1s0x391a5f5e9c489cf3:0x4049a5409d53c300!8m2!3d31.2553921!4d75.7048678!15sCgxscHUgbG9jYXRpb24iA4gBAVoFIgNscHWSARJwcml2YXRlX3VuaXZlcnNpdHngAQA!16s%2Fm%2F02wbfhd?entry=ttu&g_ep=EgoyMDI0MTAwNy4xIKXMDSoASAFQAw%3D%3D"

            val intent4 = Intent(Intent.ACTION_VIEW, Uri.parse(location))
            startActivity(intent4)



        }
    }
}