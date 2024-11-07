package com.example.cse324.Objects

import com.example.cse324.Class.RvModel
import com.example.cse324.R

object Constant {
    private  lateinit var dataList: ArrayList<RvModel>
    fun getData():ArrayList<RvModel>{
        dataList = ArrayList<RvModel>()
        dataList.add(RvModel(R.drawable.avt01,"Jig Jag","India"))
        dataList.add(RvModel(R.drawable.avt01,"Jig Jag Jig Jag","India"))
        dataList.add(RvModel(R.drawable.avt01,"Jig Jag Jig Jag","India"))
        dataList.add(RvModel(R.drawable.avt01,"Jig Jag Jig Jag","India"))
        dataList.add(RvModel(R.drawable.avt01,"Jig Jag Jig Jag","India"))
        dataList.add(RvModel(R.drawable.avt01,"Jig Jag Jig Jag","India"))
        dataList.add(RvModel(R.drawable.avt01,"Jig Jag Jig Jag","India"))
        dataList.add(RvModel(R.drawable.avt01,"Jig Jag Jig Jag","India"))
        dataList.add(RvModel(R.drawable.avt01,"Jig Jag Jig Jag","India"))
        dataList.add(RvModel(R.drawable.avt01,"Jig Jag Jig Jag","India"))
        return  dataList
    }
}