package com.iprism.ecmoutboundmarketing.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.iprism.ecmoutboundmarketing.interfaces.OnSingleItemClickListener
import com.iprism.ecmoutboundmarketing.R
import com.iprism.ecmoutboundmarketing.databinding.PersonItemBinding

class MyLeadCashAdapter(var context: Context) : Adapter<MyLeadCashAdapter.MyLeadCashViewHolder>() {

    private lateinit var listener : OnSingleItemClickListener
    val bounce = AnimationUtils.loadAnimation(context, R.anim.bounce)

    fun setupListener(listener: OnSingleItemClickListener){
        this.listener = listener
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyLeadCashViewHolder {
        var binding = PersonItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyLeadCashViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyLeadCashViewHolder, position: Int) {
        holder.binding.clinicNameTxt.visibility = View.GONE
        holder.binding.nameTxt.text = "Mahesh Peetha"
        holder.binding.qualificationTxt.text = "Employee"
        holder.binding.callNowLo.setOnClickListener(View.OnClickListener {
            listener.onCallNowClick("", "")
            it.startAnimation(bounce)
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

    class MyLeadCashViewHolder(var binding: PersonItemBinding) : ViewHolder(binding.root)
}