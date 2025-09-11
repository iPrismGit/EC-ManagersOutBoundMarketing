package com.iprism.ecmoutboundmarketing.activities

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.iprism.ecmoutboundmarketing.adapters.DigitalBrandingTemplatesAdapter
import com.iprism.ecmoutboundmarketing.databinding.ActivityAddDeigitalBrandingBinding
import com.iprism.ecmoutboundmarketing.interfaces.OnWhiteBoardClickListener
import com.iprism.ecmoutboundmarketing.utils.ToastUtils

class AddDeigitalBrandingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddDeigitalBrandingBinding
    private var tag = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityAddDeigitalBrandingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        tag = intent.getStringExtra("tag").toString()
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.nameTxt.text = tag
        handleBack()
        setupTemplatesAdapter()
    }

    private fun setupTemplatesAdapter() {
        var templatesAdapter = DigitalBrandingTemplatesAdapter()
        var linearLayoutManager = GridLayoutManager(this, 2)
        binding.brandingsRv.adapter = templatesAdapter
        binding.brandingsRv.layoutManager = linearLayoutManager
        templatesAdapter.setupListener(object : OnWhiteBoardClickListener{
            override fun onItemClick(boardId: String) {
                ToastUtils.showSuccessCustomToast(this@AddDeigitalBrandingActivity, "Digital Branding Promo Added Successfully!")
            }

        })
    }

    private fun handleBack() {
        binding.backImg.setOnClickListener { view ->
            finish()
        }
    }
}