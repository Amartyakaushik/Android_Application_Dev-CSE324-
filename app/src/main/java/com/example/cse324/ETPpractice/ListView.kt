package com.example.cse324.ETPpractice

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.cse324.R
import com.example.cse324.databinding.ActivityListViewBinding

//public class MainActivity extends AppCompatActivity
class ListView : AppCompatActivity() {
    private lateinit var binding: ActivityListViewBinding
//    private lateinit var l : ListView
    var tutorials = arrayOf(
        "Algorithms", "Data Structures",
        "Languages", "Interview Corner",
        "GATE", "ISRO CS",
        "UGC NET CS", "CS Subjects",
        "Web Technologies"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val l = binding.listView
        var arr: ArrayAdapter<String?>
        arr = ArrayAdapter<String?>(this, R.layout.support_simple_spinner_dropdown_item, tutorials)
        l.adapter = arr;
    }
}
//
//package com.example.languageswitcher
//
//import android.content.res.Configuration
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.ArrayAdapter
//import android.widget.Button
//import android.widget.Spinner
//import android.widget.Toast
//import java.util.*
//
//class MainActivity : AppCompatActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        // Spinner setup
//
//    }
//
//    private fun changeLanguage(language: String) {
//        val locale = when (language) {
//            "Español" -> Locale("es")
//            else -> Locale("en")
//        }
//
//        // Change app's locale
//        val config = resources.configuration
//        config.setLocale(locale)
//        resources.updateConfiguration(config, resources.displayMetrics)
//
//        // Show a Toast message in the selected language
//        Toast.makeText(this, getString(R.string.toast_message), Toast.LENGTH_SHORT).show()
//    }
//}
