package com.iprism.ecmoutboundmarketing.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.iprism.ecmoutboundmarketing.adapters.MyHealthAdvisorsAdapter
import com.iprism.ecmoutboundmarketing.databinding.ActivityMyHealthAdvisorsBinding
import com.iprism.ecmoutboundmarketing.interfaces.OnDoctorItemClickListener

class MyHealthAdvisorsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMyHealthAdvisorsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMyHealthAdvisorsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        handleBack()
        setupMyHealthAdvisorsAdapter()
    }

    private fun setupMyHealthAdvisorsAdapter() {
        var myHealthAdvisorsAdapter = MyHealthAdvisorsAdapter(this)
        var linearLayoutManager = GridLayoutManager(this, 4)
        binding.myHealthAdvisorsRv.adapter = myHealthAdvisorsAdapter
        binding.myHealthAdvisorsRv.layoutManager = linearLayoutManager
        myHealthAdvisorsAdapter.setupListener(object : OnDoctorItemClickListener {
            override fun onItemClick(categoryId: String, doctorId: String) {
                var intent = Intent(this@MyHealthAdvisorsActivity, MyHealthAdvisorApartmentsActivity::class.java)
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