package com.iprism.ecmoutboundmarketing.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.iprism.ecmoutboundmarketing.adapters.DailyReportsAdapter

import com.iprism.ecmoutboundmarketing.databinding.ActivityDailyReportsBinding
import com.iprism.ecmoutboundmarketing.interfaces.OnEventClickListener

class DailyReportsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDailyReportsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDailyReportsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        handleBack()
        setupDialyReportsAdapter()
    }

    private fun setupDialyReportsAdapter() {
        var reportsAdapter = DailyReportsAdapter()
        var linearLayoutManager = LinearLayoutManager(this)
        binding.dailyReportsRv.adapter = reportsAdapter
        binding.dailyReportsRv.layoutManager = linearLayoutManager
        reportsAdapter.setupListener(object : OnEventClickListener {
            override fun onItemClick(eventId: String) {
                var intent = Intent(this@DailyReportsActivity, DailyReportDetailsActivity::class.java)
                startActivity(intent)
            }

        })
    }

    private fun handleBack() {
        binding.backImg.setOnClickListener { view ->
            finish()
        }
    }
}