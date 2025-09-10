package com.iprism.ecmoutboundmarketing.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.iprism.ecmoutboundmarketing.adapters.MyHealthAdvisorApartmentsAdapter
import com.iprism.ecmoutboundmarketing.databinding.ActivityMyHealthAdvisorApartmentsBinding
import com.iprism.ecmoutboundmarketing.interfaces.OnDoctorItemClickListener

class MyHealthAdvisorApartmentsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMyHealthAdvisorApartmentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMyHealthAdvisorApartmentsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        setupMyHealthAdvisorApartmentsAdapter()
        handleBack()
    }

    private fun setupMyHealthAdvisorApartmentsAdapter() {
        var myHealthAdvisorApartmentsAdapter = MyHealthAdvisorApartmentsAdapter(this)
        var linearLayoutManager = GridLayoutManager(this, 4)
        binding.myHealthAdvisorsRv.adapter = myHealthAdvisorApartmentsAdapter
        binding.myHealthAdvisorsRv.layoutManager = linearLayoutManager
        myHealthAdvisorApartmentsAdapter.setupListener(object : OnDoctorItemClickListener {
            override fun onItemClick(categoryId: String, doctorId: String) {
                var intent = Intent(this@MyHealthAdvisorApartmentsActivity, IBMSingleApartMentHealthAdmisorsActivity::class.java)
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