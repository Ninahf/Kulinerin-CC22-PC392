package com.example.kulinerin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class ListFoodAdapter(private val listFood: ArrayList<Food>) : RecyclerView.Adapter<ListFoodAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvUsername : TextView = itemView.findViewById(R.id.tv_item_lokasi)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_list_users, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name,company, foto) = listFood[position]
        holder.imgPhoto.setImageResource(foto)
        holder.tvName.text = name
        holder.tvUsername.text = company
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listFood[holder.adapterPosition]) }
    }
    interface OnItemClickCallback {
        fun onItemClicked(data: Food)
    }
    override fun getItemCount(): Int = listFood.size
}


