package com.iprism.ecmoutboundmarketing.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.core.content.ContextCompat
import com.iprism.ecmoutboundmarketing.adapters.MyLeadsCashPagerAdapter
import com.iprism.ecmoutboundmarketing.databinding.ActivityMyLeadsCashBinding

class MyLeadsCashActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMyLeadsCashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMyLeadsCashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter = MyLeadsCashPagerAdapter(this)
        binding.viewPager.isUserInputEnabled = false
        binding.viewPager.adapter = adapter
        binding.viewPager.setCurrentItem(0, false)
        handleBack()
        handleCashLo()
        handleEmiLo()
    }

    private fun handleCashLo() {
        binding.cashLo.setOnClickListener(View.OnClickListener {
            setupButtonsStyling(binding.cashLo, binding.emiLo)
            binding.viewPager.setCurrentItem(0, false)
        })
    }

    private fun handleEmiLo() {
        binding.emiLo.setOnClickListener(View.OnClickListener {
            setupButtonsStyling(binding.emiLo, binding.cashLo)
            binding.viewPager.setCurrentItem(1, false)
        })
    }

    private fun setupButtonsStyling(textView: TextView, textView1: TextView){
        textView.setTextColor(ContextCompat.getColor(this, R.color.white))
        textView.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
        textView1.setTextColor(ContextCompat.getColor(this, R.color.black))
        textView1.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
    }

    private fun handleBack() {
        binding.backImg.setOnClickListener(View.OnClickListener {
            finish()
        })
    }

}