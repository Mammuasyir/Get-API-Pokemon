package com.example.tugasapipokemon

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tugasapipokemon.model.DataItem
import com.example.tugasapipokemon.model.ResponsePokemon

class PokemonAdapter(val ResponseGameItem: List<DataItem?>?) : RecyclerView.Adapter<PokemonAdapter.MyViewHolder>() {
    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgImages = view.findViewById<ImageView>(R.id.item_image_pokemon)
        val tvTypes = view.findViewById<TextView>(R.id.item_tv_types)
        val tvLevel = view.findViewById<TextView>(R.id.item_tv_level)
        val tvHp = view.findViewById<TextView>(R.id.item_tv_hp)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_row_pokemon, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvLevel.text = ResponseGameItem?.get(position)?.name
        holder.tvHp.text = ResponseGameItem?.get(position)?.hp
        holder.tvTypes.text = ResponseGameItem?.get(position)?.supertype

        Glide.with(holder.imgImages)
            .load(ResponseGameItem?.get(position)?.images?.small)
            .error(R.drawable.ic_launcher_background)
            .into(holder.imgImages)
    }

    override fun getItemCount(): Int {
        if (ResponseGameItem != null) {
            return ResponseGameItem.size
        }
        return 0
    }

}