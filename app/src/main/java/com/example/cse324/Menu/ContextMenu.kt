package com.example.cse324.Menu

import android.annotation.SuppressLint
import android.graphics.Color
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import com.example.cse324.R
import com.example.cse324.databinding.ActivityContextMenuBinding

class ContextMenu : AppCompatActivity() {
    private  lateinit var binding : ActivityContextMenuBinding
//    private val textView = binding.textView
//    private val menuLayout = binding.menuLayout
        lateinit var image : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContextMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val textView = binding.textView
        image = findViewById<ImageView>(R.id.image_context_menu)


        registerForContextMenu(textView)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)

//        menuInflater.inflate(R.menu.menu_list, menu)
//        menu?.add(0,v!!.id, 0, "Yellow")
//        menu?.add(0,v!!.id, 1, "Gray")
//        menu?.add(0,v!!.id, 2, "Cyan")


        menu?.setHeaderTitle("Choose a color")
       menu?.add(0,v!!.id, 0, "AVT")
        menu?.add(0,v!!.id, 0, "hospital")
        menu?.add(0,v!!.id, 0, "bg")

    }

//    @SuppressLint("ResourceAsColor")
    override fun onContextItemSelected(item: MenuItem): Boolean {
        return super.onContextItemSelected(item)
        if(item.title === "AVT") {
//            binding.menuLayout.setBackgroundColor(Color.YELLOW)
//            binding.imageContextMenu.setBackgroundColor(Color.YELLOW)
            image.setImageResource(R.drawable.avt01)
//            menuLayout.setBackgroundColor(getResources().getColor(R.color.yellow))
//            binding.menuLayout.setBackgroundColor((R.color.yellow))
        }else if(item.title === "hospital"){
//            menuLayout.setBackgroundColor(getResources().getColor(R.color.black))
            image.setImageResource(R.drawable.hospital)
//            binding.imageContextMenu.setBackgroundColor(Color.GRAY)
//            binding.menuLayout.setBackgroundColor(Color.GRAY)
        }else if(item.title === "bg"){
            image.setImageResource(R.drawable.bg_dialer_pad)
//            binding.imageContextMenu.setBackgroundColor(Color.CYAN)
//            binding.menuLayout.setBackgroundColor(Color.CYAN)
        }
        return true
    }
}
// context menu
// pressing longer on the image view then change the color of the imageview

// btn click -> pop up menu to change the text in the textView

// option menu -> redirect to next page and transfer the text from the textview of that particular page
// and show to next page...