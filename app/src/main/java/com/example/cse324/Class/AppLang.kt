package com.example.cse324.Class

import android.content.Context
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import com.example.cse324.Menu.PopUpMenu
import com.example.cse324.R

class AppLang {
    fun customMenuu(context: Context, view: View){
        val pop = PopupMenu(context, view)
        pop.inflate(R.menu.menu_list)

        pop.setOnMenuItemClickListener {
            when(it!!.itemId){
                R.id.mail -> {
                    Toast.makeText(context, "clicked Mail", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.upload -> {
                    Toast.makeText(context, "clicked Upload", Toast.LENGTH_SHORT).show()
                    true
                }


                R.id.sharshare -> {
                    Toast.makeText(context, "clicked Share", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }

        try {
            val fieldMPopUp = PopupMenu::class.java.getDeclaredField("mPopup")
            fieldMPopUp.isAccessible = true
            val mPopUp = fieldMPopUp.get(pop)
            mPopUp.javaClass
                .getDeclaredMethod("setFoeceShowIcon",Boolean::class.java)
                .invoke(mPopUp,true)
        }catch (e:Exception){

        }finally {
            pop.show()
        }
    }
}