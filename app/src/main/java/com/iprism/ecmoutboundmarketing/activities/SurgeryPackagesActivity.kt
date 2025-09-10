package com.iprism.ecmoutboundmarketing.activities

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.iprism.ecmoutboundmarketing.adapters.SurgicalPackagesAdapter
import com.iprism.ecmoutboundmarketing.databinding.ActivitySurgeryPackagesBinding

class SurgeryPackagesActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySurgeryPackagesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySurgeryPackagesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        handleBack()
        setPackagesAdapter()
    }

    private fun setPackagesAdapter() {
        var packagesAdapter = SurgicalPackagesAdapter(this)
        var linearLayoutManager = LinearLayoutManager(this)
        binding.surgicalPackagesRv.adapter = packagesAdapter
        binding.surgicalPackagesRv.layoutManager = linearLayoutManager
    }

    private fun handleBack() {
        binding.backImg.setOnClickListener(View.OnClickListener {
            finish()
        })
    }

}