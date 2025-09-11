package com.iprism.ecmoutboundmarketing.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.iprism.ecmoutboundmarketing.databinding.RewardItemBinding

class RewardsAdapter(var context: Context) : Adapter<RewardsAdapter.RewardViewHolder> (){

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RewardsAdapter.RewardViewHolder {
        var binding = RewardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RewardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RewardsAdapter.RewardViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 8
    }

    class RewardViewHolder(var binding : RewardItemBinding) : ViewHolder(binding.root)
}