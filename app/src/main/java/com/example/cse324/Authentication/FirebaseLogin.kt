package com.example.cse324.Authentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.cse324.Activity2
import com.example.cse324.R
import com.example.cse324.databinding.ActivityFirebaseLoginBinding
import com.example.cse324.databinding.ActivityNotificationDataBinding
import com.google.firebase.auth.FirebaseAuth

class FirebaseLogin : AppCompatActivity() {
    private lateinit var binding: ActivityFirebaseLoginBinding
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirebaseLoginBinding.inflate(layoutInflater)
        auth = FirebaseAuth.getInstance()
        setContentView(binding.root)

        val loginBtn = binding.loginBtn
        val signUpBtn = binding.signUpBtn
        val email = binding.email
        val password = binding.password
        signUpBtn.setOnClickListener {
            startActivity(Intent(this,FirebaseSignUp::class.java))
        }

        loginBtn.setOnClickListener {
            if(email.text.toString().equals("") || password.text.toString().equals("")){
                Toast.makeText(this, "Please fill all the details first", Toast.LENGTH_SHORT).show()
            }else{
                auth.signInWithEmailAndPassword(email.text.toString(), password.text.toString())
                    .addOnCompleteListener {
                        if(it.isSuccessful){
                            if(auth.currentUser!!.isEmailVerified){
                                startActivity(Intent(this, Activity2::class.java))
//                                it.exception?.localizedMessage?.let { it1 -> Log.e("isVerified", it1) }
                            }else{
                                it.exception?.localizedMessage?.let { it1 -> Log.e("isVerified", it1) }
//                                Log.e("tagged", it.exception!!.localizedMessage)
//                                Log.e("emailVerified", " emailVerified status: ${it.exception.localizedMessage}")
                                Toast.makeText(this, "not verified", Toast.LENGTH_SHORT).show()
//                                Toast.makeText(this, it.exception?.localizedMessage, Toast.LENGTH_SHORT).show()
                            }
                        }else{
                                Log.e("isVerified", " emailVerified status: ${it.exception!!.localizedMessage}")
                            Toast.makeText(this, it.exception?.localizedMessage, Toast.LENGTH_SHORT).show()
                        }
                    }
            }
        }
    }
}