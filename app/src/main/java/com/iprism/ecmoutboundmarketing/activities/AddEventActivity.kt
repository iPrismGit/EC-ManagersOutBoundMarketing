package com.iprism.ecmoutboundmarketing.activities

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.iprism.ecmoutboundmarketing.databinding.ActivityAddEventBinding
import com.iprism.ecmoutboundmarketing.utils.ToastUtils

class AddEventActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddEventBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityAddEventBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        handeBack()
        handleAddBtn()
    }

    private fun handleAddBtn() {
        binding.addEventBtn.setOnClickListener { view ->
            ToastUtils.showSuccessCustomToast(this, "Event Added Successfully!")
            finish()
        }
    }

    private fun handeBack() {
        binding.backImg.setOnClickListener { view ->
            finish()
        }
    }

}