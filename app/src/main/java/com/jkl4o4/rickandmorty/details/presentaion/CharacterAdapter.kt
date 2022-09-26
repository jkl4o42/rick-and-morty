package com.jkl4o4.rickandmorty.details.presentaion

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.jkl4o4.rickandmorty.R

class CharacterAdapter(private val onClickListener: OnClickListener) :
    RecyclerView.Adapter<CharacterAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val item: CardView = view.findViewById(R.id.item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_character, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.item.setOnClickListener {
            onClickListener.onClickListener(position)
        }
    }

    override fun getItemCount(): Int = 5

    interface OnClickListener {
        fun onClickListener(characterId: Int)
    }
}


