package com.example.vk_android_hw1

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val text = view.findViewById<TextView>(R.id.text_1)
    private val image = view.findViewById<ImageView>(R.id.image_view)

    fun bind(number: Int) {
        text.text = "$number"
        image.setBackgroundColor(
            ContextCompat.getColor(
                itemView.context,
                if (number % 2 == 1) R.color.blue else R.color.red
            )
        )
    }
}