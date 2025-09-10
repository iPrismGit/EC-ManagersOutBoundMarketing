package com.iprism.ecmoutboundmarketing.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import com.iprism.ecmoutboundmarketing.databinding.ActivityFeedBackBinding
import com.iprism.ecmoutboundmarketing.utils.ToastUtils

class FeedBackActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFeedBackBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFeedBackBinding.inflate(layoutInflater)
        setContentView(binding.root)
        enableEdgeToEdge()
        handleBack()
        handleSubmitBtn()
    }

    private fun handleSubmitBtn() {
        binding.submitBtn.setOnClickListener(View.OnClickListener {
            ToastUtils.showSuccessCustomToast(this, "Feedback Report Sent Successfully!")
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        })
    }

    private fun handleBack() {
        binding.backImg.setOnClickListener(View.OnClickListener {
            finish()
        })
    }

}