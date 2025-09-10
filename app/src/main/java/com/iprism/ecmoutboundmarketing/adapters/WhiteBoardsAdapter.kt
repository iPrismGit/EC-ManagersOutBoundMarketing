package com.iprism.ecmoutboundmarketing.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.iprism.ecmoutboundmarketing.databinding.WhiteBoardFeedBackItemBinding
import com.iprism.ecmoutboundmarketing.interfaces.OnWhiteBoardClickListener

class WhiteBoardsAdapter(var context: Context) : Adapter<WhiteBoardsAdapter.WhiteBoardViewHolder>() {

    private lateinit var listener: OnWhiteBoardClickListener

    fun setupListener(listener: OnWhiteBoardClickListener){
        this.listener = listener
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): WhiteBoardsAdapter.WhiteBoardViewHolder {
        var binding = WhiteBoardFeedBackItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return WhiteBoardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: WhiteBoardsAdapter.WhiteBoardViewHolder, position: Int) {
        holder.binding.root.setOnClickListener(View.OnClickListener {
            listener.onItemClick("")
        })
    }

    override fun getItemCount(): Int {
        return 15
    }

    class WhiteBoardViewHolder(var binding: WhiteBoardFeedBackItemBinding) : ViewHolder(binding.root)

}