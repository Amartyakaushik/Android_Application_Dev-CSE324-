package com.example.cse324

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cse324.Adapters.RvAdapter
import com.example.cse324.Class.RvModel
import com.example.cse324.Objects.Constant
import com.example.cse324.databinding.ActivityRecyclerViewBinding
import com.example.cse324.databinding.RvItemBinding
import java.util.Objects

class RecyclerView : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerViewBinding
//    private lateinit var dataList: ArrayList<RvModel>
    private lateinit var rvAdapter: RvAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        dataList = ArrayList<RvModel>()
//        dataList.add(RvModel(R.drawable.avt01,"Jig Jag Jig Jag","India"))
//        dataList.add(RvModel(R.drawable.avt01,"Jig Jag Jig Jag","India"))
//        dataList.add(RvModel(R.drawable.avt01,"Jig Jag Jig Jag","India"))
//        dataList.add(RvModel(R.drawable.avt01,"Jig Jag Jig Jag","India"))


        supportActionBar?.hide()
//        rvAdapter = RvAdapter(dataList,this)
//        binding.rv.layoutManager = LinearLayoutManager(this)
        rvAdapter = RvAdapter(Constant.getData(),this)
        binding.rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        binding.rv.adapter = rvAdapter
    }
}