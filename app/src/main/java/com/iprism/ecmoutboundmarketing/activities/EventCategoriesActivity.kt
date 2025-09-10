package com.iprism.ecmoutboundmarketing.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.iprism.ecmoutboundmarketing.databinding.ActivityEventCategoriesBinding

class EventCategoriesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEventCategoriesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityEventCategoriesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        handleAddEventBtn()
        handleOthresLo()
        handleCMEProgramLo()
        handleHealthTalksLo()
        handleMedicalCamps()
        handlekioskCampsLo()
        handleBack()
    }

    private fun handleAddEventBtn() {
        binding.addEventBtn.setOnClickListener { view ->
            startActivity(Intent(this, AddEventActivity::class.java))
        }
    }

    private fun handleOthresLo() {
        binding.othersTxt.setOnClickListener { view ->
            var tag = binding.othersTxt.text.toString().trim()
            var intent = Intent(this, EventsActivity::class.java)
            intent.putExtra("tag", tag)
            startActivity(intent)
        }
    }

    private fun handleCMEProgramLo() {
        binding.cmeProgramTxt.setOnClickListener { view ->
            var tag = binding.cmeProgramTxt.text.toString().trim()
            var intent = Intent(this, EventsActivity::class.java)
            intent.putExtra("tag", tag)
            startActivity(intent)
        }
    }

    private fun handleHealthTalksLo() {
        binding.healthTalkTxt.setOnClickListener { view ->
            var tag = binding.healthTalkTxt.text.toString().trim()
            var intent = Intent(this, EventsActivity::class.java)
            intent.putExtra("tag", tag)
            startActivity(intent)
        }
    }

    private fun handlekioskCampsLo() {
        binding.kioskCampTxt.setOnClickListener { view ->
            var tag = binding.kioskCampTxt.text.toString().trim()
            var intent = Intent(this, EventsActivity::class.java)
            intent.putExtra("tag", tag)
            startActivity(intent)
        }
    }

    private fun handleMedicalCamps() {
        binding.medicalCampTxt.setOnClickListener { view ->
            var tag = binding.medicalCampTxt.text.toString().trim()
            var intent = Intent(this, EventsActivity::class.java)
            intent.putExtra("tag", tag)
            startActivity(intent)
        }
    }

    private fun handleBack() {
        binding.backImg.setOnClickListener { view ->
            finish()
        }
    }

}