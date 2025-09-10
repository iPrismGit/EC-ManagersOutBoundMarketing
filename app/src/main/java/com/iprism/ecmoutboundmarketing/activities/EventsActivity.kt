package com.iprism.ecmoutboundmarketing.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.iprism.ecmoutboundmarketing.adapters.EventsAdapter
import com.iprism.ecmoutboundmarketing.databinding.ActivityEventsBinding
import com.iprism.ecmoutboundmarketing.interfaces.OnEventClickListener

class EventsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEventsBinding
    private var tag = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityEventsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        tag = intent.getStringExtra("tag").toString()
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.nameTxt.text = tag
        handleBack()
        setupEventsAdapter()
    }

    private fun setupEventsAdapter() {
        var eventsAdapter = EventsAdapter()
        var linearLayoutManager = LinearLayoutManager(this)
        binding.eventsRv.adapter = eventsAdapter
        binding.eventsRv.layoutManager = linearLayoutManager
        eventsAdapter.setupListener(object : OnEventClickListener {
            override fun onItemClick(eventId: String) {
                var intent = Intent(this@EventsActivity, EventDetailsActivity::class.java)
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