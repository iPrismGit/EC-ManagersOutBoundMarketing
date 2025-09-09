package com.iprism.ecmoutboundmarketing.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.iprism.ecmoutboundmarketing.databinding.ActivityAddUsersBinding

class AddUsersActivity : AppCompatActivity() {

    private lateinit var binding : ActivityAddUsersBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityAddUsersBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        handleBack()
        handleMyLeadsLo()
        handleBankEmployeeLo()
        handleCompanyEmployeeLo()
        handleHealthAdvisorLo()
    }

    private fun handleHealthAdvisorLo() {
        binding.healthAdvisorsLo.setOnClickListener { view ->
            startActivity(Intent(this, CreateHealthAdvisorActivity::class.java))
        }
    }

    private fun handleCompanyEmployeeLo() {
        binding.companyEmployeesLo.setOnClickListener { view ->
            var intent = Intent(this, CreateEmployeesActivity::class.java)
            intent.putExtra("tag", "Company Employee ")
            startActivity(intent)
        }
    }

    private fun handleBankEmployeeLo() {
        binding.bankEmployeesLo.setOnClickListener { view ->
            var intent = Intent(this, CreateEmployeesActivity::class.java)
            intent.putExtra("tag", "Bank Employee ")
            startActivity(intent)
        }
    }

    private fun handleMyLeadsLo() {
        binding.myLeadsLo.setOnClickListener { view ->
            startActivity(Intent(this, CreateMyLeadsActivity::class.java))
        }
    }

    private fun handleBack() {
        binding.backImg.setOnClickListener(View.OnClickListener {
            finish()
        })
    }

}