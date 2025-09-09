package com.iprism.ecmoutboundmarketing.activities

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.iprism.ecmoutboundmarketing.databinding.ActivityCreateMyLeadsBinding
import com.iprism.ecmoutboundmarketing.utils.DateTimeUtils
import com.iprism.ecmoutboundmarketing.utils.ToastUtils


class CreateMyLeadsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCreateMyLeadsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityCreateMyLeadsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        handleDOBLo()
        handleSubmitLo()
        handleBack()
    }

    private fun handleBack() {
        binding.backImg.setOnClickListener(View.OnClickListener {
            finish()
        })
    }

    private fun handleSubmitLo() {
        binding.submitBtn.setOnClickListener(View.OnClickListener {
            ToastUtils.showSuccessCustomToast(this, "Added My Leads Successfully!")
            finish()
        })
    }

    private fun handleDOBLo() {
        binding.dobLo.setOnClickListener(View.OnClickListener {
            DateTimeUtils.getDate(binding.dateOfBirthTxt, true)
        })
    }

}