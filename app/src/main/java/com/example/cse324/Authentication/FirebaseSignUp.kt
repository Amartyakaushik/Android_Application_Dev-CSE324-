
package com.example.cse324.Authentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.cse324.R
import com.example.cse324.databinding.ActivityFirebaseSignUpBinding
import com.example.cse324.databinding.ActivityIntentExampleBinding
import com.google.firebase.auth.FirebaseAuth

class FirebaseSignUp : AppCompatActivity() {
    private lateinit var binding: ActivityFirebaseSignUpBinding
    private lateinit var auth : FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirebaseSignUpBinding.inflate(layoutInflater)
        auth = FirebaseAuth.getInstance()
        setContentView(binding.root)

        val registerBtn = binding.register
        val loginBtn = binding.loginBtn
        val email = binding.email
        val password = binding.password
        loginBtn.setOnClickListener {
            startActivity(Intent(this@FirebaseSignUp,FirebaseLogin::class.java))
        }
        registerBtn.setOnClickListener {
            if(email.text.toString().equals("") || password.text.toString().equals("")){
                Toast.makeText(this, "Please fill all the details first", Toast.LENGTH_SHORT).show()
            }else{
                auth.createUserWithEmailAndPassword(email.text.toString(),password.text.toString())
                    .addOnCompleteListener {
                        if(it.isSuccessful){
                            auth.currentUser?.sendEmailVerification()?.addOnCompleteListener {
                                if(it.isSuccessful){
//                                    Log.e("emailVerified", " emailVerifying status: ${it.exception!!.localizedMessage}")
                                    Toast.makeText(this, "Verify yourself through the link sent to your email", Toast.LENGTH_SHORT).show()
//                                    Toast.makeText(this, "Please verify it", Toast.LENGTH_SHORT).show()
                                }else{
                                    Log.e("emailVerified", " emailVerifying status: ${it.exception!!.localizedMessage}")
//                                    Toast.makeText(this, "email verification failed", Toast.LENGTH_SHORT).show()
                                    Toast.makeText(this, it.exception?.localizedMessage, Toast.LENGTH_SHORT).show()
                                }
                            }
                        }else{
                            Log.e("TAG", " emailVerifying status: ${it.exception!!.localizedMessage}")
//                            Toast.makeText(this, "user not created", Toast.LENGTH_SHORT).show()
                            Toast.makeText(this, it.exception?.localizedMessage, Toast.LENGTH_SHORT).show()
                        }
                    }
            }
        }


    }
}