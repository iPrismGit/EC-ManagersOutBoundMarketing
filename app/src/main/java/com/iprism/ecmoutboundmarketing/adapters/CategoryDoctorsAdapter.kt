package com.iprism.ecmoutboundmarketing.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.iprism.ecmoutboundmarketing.R
import com.iprism.ecmoutboundmarketing.databinding.PersonItemBinding
import com.iprism.ecmoutboundmarketing.interfaces.OnSingleItemClickListener

class CategoryDoctorsAdapter(var context: Context): Adapter<CategoryDoctorsAdapter.CategoryDoctorViewHolder> () {

    private lateinit var listener: OnSingleItemClickListener
    val bounce = AnimationUtils.loadAnimation(context, R.anim.bounce)

    fun setupListener(listener: OnSingleItemClickListener){
        this.listener = listener
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CategoryDoctorsAdapter.CategoryDoctorViewHolder {
        var binding = PersonItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CategoryDoctorViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CategoryDoctorsAdapter.CategoryDoctorViewHolder, position: Int) {
        holder.binding.clinicNameTxt.visibility = View.GONE
        holder.binding.clinicNameTxt.visibility = View.VISIBLE
        holder.binding.callNowLo.setOnClickListener(View.OnClickListener {
            it.startAnimation(bounce)
            listener.onCallNowClick("", "")
        })
        holder.binding.smsLo.setOnClickListener(View.OnClickListener {
            it.startAnimation(bounce)
            listener.onSmsClick("", "")
        })
        holder.binding.whatsAppLo.setOnClickListener(View.OnClickListener {
            it.startAnimation(bounce)
            listener.onWhatsappClick("", "")
        })
    }

    override fun getItemCount(): Int {
        return 4
    }

    class CategoryDoctorViewHolder(var binding: PersonItemBinding) : ViewHolder(binding.root)

}