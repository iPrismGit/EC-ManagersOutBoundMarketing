package com.iprism.ecmoutboundmarketing.activities

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.iprism.ecmoutboundmarketing.databinding.ActivityEventDetailsBinding
import com.iprism.ecmoutboundmarketing.utils.ToastUtils

class EventDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEventDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityEventDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        handleBack()
        handleCancelBtn()
        handleCompleteBtn()
    }

    private fun handleCompleteBtn() {
        binding.completeBtn.setOnClickListener { view ->
            ToastUtils.showSuccessCustomToast(this, "Event Completed Successfully!")
            binding.buttonsLo.visibility = View.GONE
            binding.completedBtn.visibility = View.VISIBLE
            binding.cancelledBtn.visibility = View.GONE
        }
    }

    private fun handleCancelBtn() {
        binding.cancelBtn.setOnClickListener { view ->
            ToastUtils.showSuccessCustomToast(this, "Event Cancelled Successfully!")
            binding.buttonsLo.visibility = View.GONE
            binding.completedBtn.visibility = View.GONE
            binding.cancelledBtn.visibility = View.VISIBLE
        }
    }

    private fun handleBack() {
        binding.backImg.setOnClickListener { view ->
            finish()
        }
    }

}