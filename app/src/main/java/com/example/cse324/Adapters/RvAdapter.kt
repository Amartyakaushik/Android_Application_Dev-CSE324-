package com.example.cse324.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AlphaAnimation
import android.widget.Toast
import com.example.cse324.Class.RvModel
//import com.example.cse324.RecyclerView
import androidx.recyclerview.widget.RecyclerView
import com.example.cse324.R
import com.example.cse324.databinding.RvItemBinding

class RvAdapter(var dataList: ArrayList<RvModel>, var context: Context):RecyclerView.Adapter<RvAdapter.MyViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
//        var view = LayoutInflater.from(context).inflate(R.layout.rv_item,parent,false)
        var binding = RvItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        anim(holder.itemView)
        holder.binding.icon.setImageResource(dataList.get(position).profile)
        holder.binding.name.text=(dataList.get(position).name)
        holder.binding.address.text=(dataList.get(position).address)
        holder.itemView.setOnClickListener{
            Toast.makeText(context,dataList.get(position).name, Toast.LENGTH_SHORT).show()
        }
    }
    inner class MyViewHolder(var binding: RvItemBinding):RecyclerView.ViewHolder(binding.root)

    fun anim(view: View){
        var animation = AlphaAnimation(0.0f, 1.0f)

        animation.duration = 1500
        view.startAnimation(animation)
    }
}
