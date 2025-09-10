package com.iprism.ecmoutboundmarketing.activities

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.iprism.ecmoutboundmarketing.adapters.CategoryDoctorsAdapter
import com.iprism.ecmoutboundmarketing.databinding.ActivityIbmsingleApartMentHealthAdmisorsBinding
import com.iprism.ecmoutboundmarketing.interfaces.OnSingleItemClickListener
import com.iprism.ecmoutboundmarketing.utils.ToastUtils

class IBMSingleApartMentHealthAdmisorsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIbmsingleApartMentHealthAdmisorsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityIbmsingleApartMentHealthAdmisorsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        handleBackIv()
        setupAdvisorsAdapter()
    }

    private fun handleBackIv() {
        binding.backImg.setOnClickListener(View.OnClickListener {
            finish()
        })
    }

    private fun setupAdvisorsAdapter() {
        var advisorsAdapter = CategoryDoctorsAdapter(this)
        var linearLayoutManager = LinearLayoutManager(this)
        binding.doctorsRv.adapter = advisorsAdapter
        binding.doctorsRv.layoutManager = linearLayoutManager
        advisorsAdapter.setupListener(object : OnSingleItemClickListener {
            override fun onCallNowClick(doctorId: String, mobile: String) {
                ToastUtils.showSuccessCustomToast(this@IBMSingleApartMentHealthAdmisorsActivity, "Calling to the Health Advisor!")
            }

            override fun onSmsClick(doctorId: String, mobile: String) {
                ToastUtils.showSuccessCustomToast(this@IBMSingleApartMentHealthAdmisorsActivity, "Messaging to the Health Advisor!")
            }

            override fun onWhatsappClick(doctorId: String, mobile: String) {
                ToastUtils.showSuccessCustomToast(this@IBMSingleApartMentHealthAdmisorsActivity, "Navigate to the Whatsapp")
            }

        })
    }
}