package com.iprism.ecmoutboundmarketing.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.iprism.ecmoutboundmarketing.databinding.DoctorItemBinding
import com.iprism.ecmoutboundmarketing.interfaces.OnDoctorItemClickListener

class MyHealthAdvisorsAdapter(var context: Context) : Adapter<MyHealthAdvisorsAdapter.MyHealthAdvisorViewHolder>() {

    private lateinit var listener: OnDoctorItemClickListener

    fun setupListener(listener: OnDoctorItemClickListener){
        this.listener = listener
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyHealthAdvisorViewHolder {
        var binding = DoctorItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyHealthAdvisorViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: MyHealthAdvisorViewHolder,
        position: Int
    ) {
        holder.binding.categoryName.text = "Health Advisor\nApartments"
        holder.binding.root.setOnClickListener(View.OnClickListener {
            listener.onItemClick("", "")
        })
    }

    override fun getItemCount(): Int {
        return 10
    }

    class MyHealthAdvisorViewHolder(var binding: DoctorItemBinding) : ViewHolder(binding.root)
}