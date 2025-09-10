package com.iprism.ecmoutboundmarketing.activities

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.iprism.ecmoutboundmarketing.databinding.ActivityAddTodoListBinding
import com.iprism.ecmoutboundmarketing.utils.DateTimeUtils
import com.iprism.ecmoutboundmarketing.utils.ToastUtils

class AddTodoListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddTodoListBinding
    private var tag = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityAddTodoListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        tag = intent.getStringExtra("tag").toString()
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        if (tag.equals("New", true)) {
            binding.confirmBtn.visibility = View.VISIBLE
        } else {
            binding.confirmBtn.visibility = View.GONE
        }
        handleBack()
        handleConfirmBtn()
        handleAddDateTxt()
        handleAddTimeTxt()
    }

    private fun handleAddTimeTxt() {
        binding.timeTxt.setOnClickListener { view ->
            DateTimeUtils.getTime(binding.timeTxt)
        }
    }

    private fun handleAddDateTxt() {
        binding.dateTxt.setOnClickListener { view ->
            DateTimeUtils.getDate(binding.dateTxt, false)
        }
    }

    private fun handleConfirmBtn() {
        binding.confirmBtn.setOnClickListener { view ->
            ToastUtils.showSuccessCustomToast(this, "To Do List Added Successfully!")
        }
    }

    private fun handleBack() {
        binding.backImg.setOnClickListener { view ->
            finish()
        }
    }

}