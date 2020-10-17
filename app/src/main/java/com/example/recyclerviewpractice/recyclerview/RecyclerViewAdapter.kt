package com.example.recyclerviewpractice.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewpractice.R

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewHolder>() {
    var datas = listOf<RecyclerViewData>()
        set(value){
            field = value
            notifyDataSetChanged()
        }
    //뷰를 보여준다
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_recyclerview, parent,false)
        return RecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.bind(datas[position])
    }

    override fun getItemCount() = datas.size
}