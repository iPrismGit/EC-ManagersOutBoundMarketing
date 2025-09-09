package com.iprism.ecmoutboundmarketing.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.iprism.ecmoutboundmarketing.databinding.EventItemBinding
import com.iprism.ecmoutboundmarketing.interfaces.OnEventClickListener

class DailyReportsAdapter() : RecyclerView.Adapter<DailyReportsAdapter.DailyReportViewHolder>() {

    private lateinit var listener: OnEventClickListener

    fun setupListener(listener: OnEventClickListener){
        this.listener = listener
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DailyReportsAdapter.DailyReportViewHolder {
        var binding = EventItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DailyReportViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: DailyReportsAdapter.DailyReportViewHolder,
        position: Int
    ) {
        holder.binding.organiserNameTxt.text = "Name: Hospital Management"
        holder.binding.root.setOnClickListener { view ->
            listener.onItemClick("")
        }
    }

    override fun getItemCount(): Int {
        return 3
    }

    class DailyReportViewHolder(var binding: EventItemBinding): RecyclerView.ViewHolder(binding.root)
}