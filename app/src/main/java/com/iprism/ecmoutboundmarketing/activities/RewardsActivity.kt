package com.iprism.ecmoutboundmarketing.activities

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.iprism.ecmoutboundmarketing.adapters.RewardsAdapter
import com.iprism.ecmoutboundmarketing.databinding.ActivityRewardsBinding

class RewardsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRewardsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityRewardsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
       handleBack()
        setupRewardsAdapter()
    }

    private fun setupRewardsAdapter() {
        var rewardsAdapter = RewardsAdapter(this)
        var linearLayoutManager = GridLayoutManager(this, 2)
        binding.rewardsRv.adapter = rewardsAdapter
        binding.rewardsRv.layoutManager = linearLayoutManager
    }

    private fun handleBack() {
        binding.backImg.setOnClickListener(View.OnClickListener {
            finish()
        })
    }
}