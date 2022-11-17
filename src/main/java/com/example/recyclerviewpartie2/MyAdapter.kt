package com.example.recyclerviewpartie2

import android.location.GnssAntennaInfo
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import java.util.ArrayList

class MyAdapter(private val govList :ArrayList<Gouvernerats>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    private lateinit var mListener : onItemClickListener
    interface onItemClickListener{
        fun onItemClick(position: Int)
    }
    fun setOnItemClickListener(listener:onItemClickListener){
        mListener=listener
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent,false)
        return MyViewHolder(itemView,mListener)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = govList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.tvHeading.text=currentItem.heading
    }

    override fun getItemCount(): Int {
        return govList.size
    }

    fun deleteItem(i : Int){
        govList.removeAt(i)
        notifyDataSetChanged()
    }

    class MyViewHolder(itemView :View , listener :onItemClickListener ) : RecyclerView.ViewHolder(itemView) {


        val titleImage : ImageView = itemView.findViewById(R.id.title_image)
        val tvHeading:TextView = itemView.findViewById(R.id.TvHeading)

        init{
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
            }
        }
    }

