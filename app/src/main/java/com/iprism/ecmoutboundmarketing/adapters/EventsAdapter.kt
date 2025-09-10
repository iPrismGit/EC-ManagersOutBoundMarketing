package com.iprism.ecmoutboundmarketing.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.iprism.ecmoutboundmarketing.databinding.EventItemBinding

import com.iprism.ecmoutboundmarketing.interfaces.OnEventClickListener

class EventsAdapter(): RecyclerView.Adapter<EventsAdapter.EventViewHolder>() {

    private lateinit var listener: OnEventClickListener

    fun setupListener(listener: OnEventClickListener){
        this.listener = listener
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): EventsAdapter.EventViewHolder {
        var binding = EventItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return EventViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EventsAdapter.EventViewHolder, position: Int) {
        holder.binding.root.setOnClickListener { view ->
            listener.onItemClick("")
        }
    }

    override fun getItemCount(): Int {
        return 2
    }

    class EventViewHolder(var binding: EventItemBinding) : RecyclerView.ViewHolder(binding.root)

}