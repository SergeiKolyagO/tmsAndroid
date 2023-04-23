package com.example.task3.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.task3.MAIN
import com.example.task3.R
import com.example.task3.model.Pocemon
import de.hdodenhof.circleimageview.CircleImageView


class RecyclerAdapter (private val items: List<Pocemon>) :
    RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.text_recycler1)
        val smallTextView: TextView = itemView.findViewById(R.id.text_recycler2)
        val newsImage: CircleImageView = itemView.findViewById(R.id.title_image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.resytler_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val pocemon = items[position]
        holder.titleTextView.text = MAIN.resources.getString(pocemon.nameRu)
        holder.newsImage.setImageResource(pocemon.imageResourceId)
        holder.smallTextView.text = MAIN.resources.getString(pocemon.nameEn)

    }

    override fun getItemCount() = items.size

}