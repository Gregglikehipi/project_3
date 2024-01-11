package com.example.project_3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BlockAdapter(private val blockList: List<BlockInfo>) :
    RecyclerView.Adapter<BlockAdapter.BlockViewHolder>() {

    inner class BlockViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val blockTextView: TextView = itemView.findViewById(R.id.blockTextView)
        val infoTextView: TextView = itemView.findViewById(R.id.infoTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlockViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_block, parent, false)
        return BlockViewHolder(view)
    }

    override fun onBindViewHolder(holder: BlockViewHolder, position: Int) {
        val blockInfo = blockList[position]
        holder.blockTextView.text = blockInfo.day
        holder.infoTextView.text = blockInfo.lessons
    }

    override fun getItemCount(): Int {
        return blockList.size
    }
}