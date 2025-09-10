package com.iprism.ecmoutboundmarketing.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.iprism.ecmoutboundmarketing.adapters.SurgeriesAdapter
import com.iprism.ecmoutboundmarketing.databinding.ActivitySurgeriesBinding
import com.iprism.ecmoutboundmarketing.interfaces.OnWhiteBoardClickListener

class SurgeriesActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySurgeriesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySurgeriesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        handleBack()
        setupSurgeriesAdapter()
    }

    private fun setupSurgeriesAdapter() {
        var surgeriesAdapter = SurgeriesAdapter(this)
        var linearLayoutManager = LinearLayoutManager(this)
        binding.surgeriesRv.adapter = surgeriesAdapter
        binding.surgeriesRv.layoutManager = linearLayoutManager
        surgeriesAdapter.setupListener(object : OnWhiteBoardClickListener {
            override fun onItemClick(boardId: String) {
                val intent = Intent(this@SurgeriesActivity, SurgeryPackagesActivity::class.java)
                startActivity(intent)
            }

        })
    }

    private fun handleBack() {
        binding.backImg.setOnClickListener(View.OnClickListener {
            finish()
        })
    }

}