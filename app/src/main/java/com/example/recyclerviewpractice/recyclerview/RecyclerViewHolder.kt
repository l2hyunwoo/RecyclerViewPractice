package com.example.recyclerviewpractice.recyclerview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewpractice.R

class RecyclerViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    val img_recyclerview = itemView.findViewById<ImageView>(R.id.img_recyclerview)
    val text_name = itemView.findViewById<TextView>(R.id.text_name)
    val text_age = itemView.findViewById<TextView>(R.id.text_age)
    val text_address = itemView.findViewById<TextView>(R.id.text_address)

    fun bind(recyclerViewData: RecyclerViewData) {
        img_recyclerview.setImageResource(recyclerViewData.img_data)
        text_name.text = recyclerViewData.text_name
        text_age.text = recyclerViewData.text_age
        text_address.text = recyclerViewData.text_address
    }
}