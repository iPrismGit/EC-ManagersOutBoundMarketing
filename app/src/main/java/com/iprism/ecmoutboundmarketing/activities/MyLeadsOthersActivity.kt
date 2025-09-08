package com.iprism.ecmoutboundmarketing.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.core.content.ContextCompat
import com.iprism.ecmoutboundmarketing.R
import com.iprism.ecmoutboundmarketing.adapters.MyLeadsOthersPagerAdapter
import com.iprism.ecmoutboundmarketing.databinding.ActivityMyLeadsOthersBinding

class MyLeadsOthersActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMyLeadsOthersBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMyLeadsOthersBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter = MyLeadsOthersPagerAdapter(this)
        binding.viewPager.isUserInputEnabled = false
        binding.viewPager.adapter = adapter
        binding.viewPager.setCurrentItem(0, false)
        handleBack()
        handleStateLo()
        handleCentralLo()
        handleArogyabadrathaLo()
        handleArogyaSreeLo()
        handleAyushmanBavaLo()
        handleOthersLo()
    }

    private fun handleOthersLo() {
        binding.othersLo.setOnClickListener(View.OnClickListener {
            setupButtonsStyling(binding.othersLo, binding.centralGovtLo, binding.arogyaBadrathaLo, binding.arogyaSreeLo, binding.ayushmanbhavaLo, binding.stateGovtLo)
            binding.viewPager.setCurrentItem(5, false)
        })
    }

    private fun handleAyushmanBavaLo() {
        binding.ayushmanbhavaLo.setOnClickListener(View.OnClickListener {
            setupButtonsStyling(binding.ayushmanbhavaLo, binding.centralGovtLo, binding.arogyaBadrathaLo, binding.arogyaSreeLo, binding.stateGovtLo, binding.othersLo)
            binding.viewPager.setCurrentItem(4, false)
        })
    }

    private fun handleArogyaSreeLo() {
        binding.arogyaSreeLo.setOnClickListener(View.OnClickListener {
            setupButtonsStyling(binding.arogyaSreeLo, binding.centralGovtLo, binding.arogyaBadrathaLo, binding.stateGovtLo, binding.ayushmanbhavaLo, binding.othersLo)
            binding.viewPager.setCurrentItem(3, false)
        })
    }

    private fun handleArogyabadrathaLo() {
        binding.arogyaBadrathaLo.setOnClickListener(View.OnClickListener {
            setupButtonsStyling(binding.arogyaBadrathaLo, binding.centralGovtLo, binding.stateGovtLo, binding.arogyaSreeLo, binding.ayushmanbhavaLo, binding.othersLo)
            binding.viewPager.setCurrentItem(2, false)
        })
    }

    private fun handleCentralLo() {
           binding.centralGovtLo.setOnClickListener(View.OnClickListener {
            setupButtonsStyling(binding.centralGovtLo, binding.stateGovtLo, binding.arogyaBadrathaLo, binding.arogyaSreeLo, binding.ayushmanbhavaLo, binding.othersLo)
            binding.viewPager.setCurrentItem(1, false)
        })
    }

    private fun handleStateLo() {
        binding.stateGovtLo.setOnClickListener(View.OnClickListener {
            setupButtonsStyling(binding.stateGovtLo, binding.centralGovtLo, binding.arogyaBadrathaLo, binding.arogyaSreeLo, binding.ayushmanbhavaLo, binding.othersLo)
            binding.viewPager.setCurrentItem(0, false)
        })
    }

    private fun handleBack() {
        binding.backImg.setOnClickListener(View.OnClickListener {
            finish()
        })
    }

    private fun setupButtonsStyling(textView: TextView, textView1: TextView, textView2: TextView, textView3: TextView, textView4: TextView, textView5: TextView){
        textView.setTextColor(ContextCompat.getColor(this, R.color.white))
        textView.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
        textView1.setTextColor(ContextCompat.getColor(this, R.color.black))
        textView1.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
        textView2.setTextColor(ContextCompat.getColor(this, R.color.black))
        textView2.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
        textView3.setTextColor(ContextCompat.getColor(this, R.color.black))
        textView3.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
        textView4.setTextColor(ContextCompat.getColor(this, R.color.black))
        textView4.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
        textView5.setTextColor(ContextCompat.getColor(this, R.color.black))
        textView5.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
    }
}