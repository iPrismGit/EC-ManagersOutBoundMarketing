package com.iprism.ecmoutboundmarketing.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.iprism.ecmoutboundmarketing.databinding.ActivityAddDailyReportBinding
import com.iprism.ecmoutboundmarketing.utils.ToastUtils

class AddDailyReportActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddDailyReportBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityAddDailyReportBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        handleBack()
        handleSubmitBtn()
        handleHistoryImg()
    }

    private fun handleHistoryImg() {
        binding.historyImg.setOnClickListener { view ->
            startActivity(Intent(this, DailyReportsActivity::class.java))
        }
    }

    private fun handleSubmitBtn() {
        binding.submitBtn.setOnClickListener { view ->
            ToastUtils.showSuccessCustomToast(this, "Report Submitted Successfully!")
            finish()
        }
    }

    private fun handleBack() {
        binding.backImg.setOnClickListener { view ->
            finish()
        }
    }

}