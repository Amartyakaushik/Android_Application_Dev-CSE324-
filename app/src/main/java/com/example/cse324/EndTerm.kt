package com.example.cse324
    import android.os.Bundle
    import android.util.Log
    import android.widget.ArrayAdapter
    import android.widget.Button
    import android.widget.RadioGroup
    import android.widget.Spinner
    import android.widget.TextView
    import android.widget.Toast
    import androidx.activity.enableEdgeToEdge
    import androidx.appcompat.app.AppCompatActivity
    import com.example.cse324.databinding.ActivityEndTermBinding
    import java.util.Locale

class EndTerm : AppCompatActivity() {
    private lateinit var binding:ActivityEndTermBinding
    val languages = listOf("select Language","english","hindi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEndTermBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val spinner = binding.spinner
        val languageBtn = binding.langBtn
//        languageBtn.setOnClickListener {
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, languages)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
        languageBtn.setOnClickListener {
            val selectedLanguage = spinner.selectedItem.toString()
            changeLang(selectedLanguage)
        }

        }
            fun setLocale(LanguageCode:String){
                val locale=Locale(LanguageCode)
                Locale.setDefault(locale)
                val config=resources.configuration
                config.setLocale(locale)
                resources.updateConfiguration(config,resources.displayMetrics)
                recreate()
            }
            fun changeLang(Lang : String) {
                when (Lang) {
//                    R.id.hindi
                    "hindi"-> {
                        setLocale("hi")
                        Toast.makeText(this, "Hindi Selected", Toast.LENGTH_LONG).show()
                    }
//                    R.id.english
                    "english"-> {
                        setLocale("es")
                        Toast.makeText(this, "English Selected", Toast.LENGTH_LONG).show()
                    }
                    "select Language" -> {
                        Toast.makeText(this, "Select a valid language", Toast.LENGTH_SHORT).show()
                    }
                }
            }

}
