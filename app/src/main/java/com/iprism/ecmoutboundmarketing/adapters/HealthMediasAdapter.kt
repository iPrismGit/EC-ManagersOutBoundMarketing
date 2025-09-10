package com.iprism.ecmoutboundmarketing.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.iprism.ecmoutboundmarketing.databinding.HealthMediaItemBinding

class HealthMediasAdapter() : RecyclerView.Adapter<HealthMediasAdapter.HealthMediaViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HealthMediasAdapter.HealthMediaViewHolder {
        var binding = HealthMediaItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HealthMediaViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: HealthMediasAdapter.HealthMediaViewHolder,
        position: Int
    ) {

    }

    override fun getItemCount(): Int {
        return 8
    }

    class HealthMediaViewHolder(var binding: HealthMediaItemBinding) : RecyclerView.ViewHolder(binding.root)
}