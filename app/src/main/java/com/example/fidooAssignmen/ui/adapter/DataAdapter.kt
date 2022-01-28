package com.example.fidooAssignmen.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fidooAssignmen.data.Data
import com.example.fidooAssignmen.databinding.ItemLayoutBinding

class DataAdapter(val context: Context,private val dataList : List<Data>) : RecyclerView.Adapter<DataViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val itemLayoutBinding = ItemLayoutBinding.inflate(LayoutInflater.from(context),parent,false)
        return DataViewHolder(itemLayoutBinding)
    }
    override fun onBindViewHolder(holder: DataViewHolder, pos: Int) {
        val data = dataList[pos]

        holder.itemLayoutBinding.tvPageNo.text = "Id :- "+data.id
        holder.itemLayoutBinding.tvdisc.text = "Title:- "+data.title
        holder.itemLayoutBinding.tvTitle.text = data.body
    }
    override fun getItemCount(): Int {
        return dataList.size
    }
}

class DataViewHolder(val itemLayoutBinding: ItemLayoutBinding) : RecyclerView.ViewHolder(itemLayoutBinding.root)