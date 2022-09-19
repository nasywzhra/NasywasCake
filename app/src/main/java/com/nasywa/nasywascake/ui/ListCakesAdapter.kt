package com.nasywa.nasywascake.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.nasywa.nasywascake.R
import com.nasywa.nasywascake.data.CakesData
import com.squareup.picasso.Picasso

class ListCakesAdapter(private val listCakes: ArrayList<CakesData>) : RecyclerView.Adapter<ListCakesAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback:OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_Name)
        var tvLocation: TextView = itemView.findViewById(R.id.tv_item_location)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_row_cake,viewGroup,false)
        return  ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val cake = listCakes[position]

        cake.photo?.let {
            Glide.with(holder.itemView.context)
                .load(it)
                .apply(RequestOptions().override(50, 50))
                .into(holder.imgPhoto)
        }
        holder.tvName.text = cake.cakeName
        holder.tvLocation.text = cake.location
        holder.itemView.setOnClickListener{onItemClickCallback.onItemClickedData(listCakes[holder.adapterPosition])}
    }

    override fun getItemCount(): Int {
        return listCakes.size
    }
    interface OnItemClickCallback {
        fun onItemClickedData(data: CakesData)

    }
}



