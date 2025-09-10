package com.iprism.ecmoutboundmarketing.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.iprism.ecmoutboundmarketing.databinding.SurgeryPackageItemBinding

class SurgicalPackagesAdapter(var context: Context) : Adapter<SurgicalPackagesAdapter.SurgicalPackageViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SurgicalPackageViewHolder {
        var binding = SurgeryPackageItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SurgicalPackageViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: SurgicalPackageViewHolder,
        position: Int
    ) {

    }

    override fun getItemCount(): Int {
        return 3
    }

    class SurgicalPackageViewHolder(var binding: SurgeryPackageItemBinding) : ViewHolder(binding.root)
}