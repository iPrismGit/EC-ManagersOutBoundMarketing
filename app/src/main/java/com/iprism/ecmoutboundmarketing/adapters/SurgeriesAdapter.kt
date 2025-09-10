package com.iprism.ecmoutboundmarketing.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.iprism.ecmoutboundmarketing.databinding.WhiteBoardFeedBackItemBinding
import com.iprism.ecmoutboundmarketing.interfaces.OnWhiteBoardClickListener

class SurgeriesAdapter(var context: Context) : RecyclerView.Adapter<SurgeriesAdapter.SurgeryViewHolder>() {

    private lateinit var listener: OnWhiteBoardClickListener

    fun setupListener(listener: OnWhiteBoardClickListener){
        this.listener = listener
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SurgeryViewHolder {
        var binding = WhiteBoardFeedBackItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SurgeryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SurgeryViewHolder, position: Int) {
        holder.bindings.nameTxt.text = "Orthopedics"
        holder.bindings.root.setOnClickListener(View.OnClickListener {
            listener.onItemClick("")
        })
    }

    override fun getItemCount(): Int {
       return 10
    }

    class SurgeryViewHolder(var bindings: WhiteBoardFeedBackItemBinding) : ViewHolder(bindings.root)
}