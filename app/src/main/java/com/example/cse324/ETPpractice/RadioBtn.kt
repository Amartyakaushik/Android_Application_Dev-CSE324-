package com.example.cse324.ETPpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import com.example.cse324.R
import com.example.cse324.databinding.ActivityRadioBtnBinding

class RadioBtn : AppCompatActivity() {
    private lateinit var binding : ActivityRadioBtnBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRadioBtnBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val RG = binding.RG
        val submitBtn = binding.submitBtn
        val clearBtn = binding.submitBtn

        RG.clearCheck()
//        RG.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener(){
////            @Override
//
//        })
    }
}