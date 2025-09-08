package com.iprism.ecmoutboundmarketing.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import com.iprism.ecmoutboundmarketing.databinding.ActivityMyLeadsBinding

class MyLeadsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMyLeadsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMyLeadsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        handleBack()
        handleCashLo()
        handleHealthInsuranceLo()
        handleOthersLo()
    }

    private fun handleOthersLo() {
        binding.othersLo.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, MyLeadsOthersActivity::class.java))
        })
    }

    private fun handleHealthInsuranceLo() {
        binding.healthInsuranceLo.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, MyLeadsHealthInsuranceActivity::class.java))
        })
    }

    private fun handleCashLo() {
        binding.cashLo.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, MyLeadsCashActivity::class.java))
        })
    }

    private fun handleBack() {
        binding.backImg.setOnClickListener(View.OnClickListener {
            finish()
        })
    }

}