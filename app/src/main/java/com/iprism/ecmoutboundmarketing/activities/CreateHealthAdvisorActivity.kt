package com.iprism.ecmoutboundmarketing.activities

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.iprism.ecmoutboundmarketing.R
import com.iprism.ecmoutboundmarketing.databinding.ActivityCreateEmployeesBinding
import com.iprism.ecmoutboundmarketing.databinding.ActivityCreateHealthAdvisorBinding
import com.iprism.ecmoutboundmarketing.utils.ToastUtils

class CreateHealthAdvisorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCreateHealthAdvisorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityCreateHealthAdvisorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        handleBack()
        handleSubmitBtn()
    }

    private fun handleSubmitBtn() {
        binding.submitBtn.setOnClickListener { view ->
            ToastUtils.showSuccessCustomToast(this, "Health Advisor Added Successfully!")
            finish()
        }
    }

    private fun handleBack() {
        binding.backImg.setOnClickListener { view ->
            finish()
        }
    }
}