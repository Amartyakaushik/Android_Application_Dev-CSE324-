package com.example.cse324.Toast

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.emreesen.sntoast.SnToast
import com.emreesen.sntoast.Type
import com.example.cse324.R
import com.shashank.sony.fancytoastlib.FancyToast


class FancyAndCustomToast : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fancy_and_custom_toast)

        val successButton : Button = findViewById(R.id.successBtn)
        val errorButton : Button = findViewById(R.id.errorBtn)
        val warningButton : Button = findViewById(R.id.warningBtn)
        successButton.setOnClickListener {
            FancyToast.makeText(this,"Hello World !",FancyToast.LENGTH_LONG,FancyToast.SUCCESS,true).show();
//            FancyToast.makeText(this,"Hello World !",FancyToast.LENGTH_LONG,FancyToast.ERROR,true).show()
//            FancyToast.makeText(this,"Hello World !",FancyToast.LENGTH_LONG,FancyToast.WARNING,true).show()
        }

        errorButton.setOnClickListener {
            SnToast.Builder()
                .context(this@FancyAndCustomToast)
                .type(Type.SUCCESS)
                .message("Error !") //.cancelable(false or true) Optional Default: False
                 .iconSize(34) //Optional Default: 34dp
                 .textSize(18) //Optional Default 18sp
                 .animation( true) //Optional Default: True
                 .duration(1456) //Optional Default: 3000ms
                 .backgroundColor(R.color.yellow) //Default: It is filled according to the toast type. If an assignment is made, the assigned value is used
                 .icon(R.drawable.ic_error) //Default: It is filled according to the toast type. If an assignment is made, the assigned value is used
                .build()
        }

        warningButton.setOnClickListener {
        SnToast.Builder()
            .context(this@FancyAndCustomToast)
            .type(Type.WARNING)
            .message("alert !") //.cancelable(false or true) Optional Default: False
             .iconSize(32) //Optional Default: 34dp
             .textSize(19) //Optional Default 18sp
             .animation(false) //Optional Default: True
             .duration(1500) //Optional Default: 3000ms
             .backgroundColor(R.color.yellow) //Default: It is filled according to the toast type. If an assignment is made, the assigned value is used
             .icon(R.drawable.ic_warning) //Default: It is filled according to the toast type. If an assignment is made, the assigned value is used
            .build()
        }
    }
}