package com.example.cse324.SplashScreen

import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import com.example.cse324.MainActivity
import com.example.cse324.Menu.MenubarActivity
import com.example.cse324.R

class SplashScreenWithLoading : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen_with_loading)

        startHeavyTask()
    }

    private fun startHeavyTask(){
        LongOperation().execute()
    }

    private open inner class LongOperation:AsyncTask<String?, Void?, String?>(){
        // AsyncTask is used to prevent crash or system/API hang
        override fun doInBackground(vararg params: String?): String? {
            for (i in 0..6){
                try {
                    Thread.sleep(1000)
                }
                catch (e:Exception){
                    Thread.interrupted()
                }
            }
            return  "Result"
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            startActivity(Intent(this@SplashScreenWithLoading, MenubarActivity::class.java))
        }
    }
}