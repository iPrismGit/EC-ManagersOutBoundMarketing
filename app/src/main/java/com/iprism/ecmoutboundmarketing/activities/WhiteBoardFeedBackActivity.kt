package com.iprism.ecmoutboundmarketing.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.recyclerview.widget.LinearLayoutManager
import com.iprism.ecmoutboundmarketing.adapters.WhiteBoardsAdapter
import com.iprism.ecmoutboundmarketing.databinding.ActivityWhiteBoardFeedBackBinding
import com.iprism.ecmoutboundmarketing.interfaces.OnWhiteBoardClickListener

class WhiteBoardFeedBackActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWhiteBoardFeedBackBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityWhiteBoardFeedBackBinding.inflate(layoutInflater)
        setContentView(binding.root)
        handleBack()
        setupWhiteBoardsAdapter()
    }

    private fun setupWhiteBoardsAdapter() {
        var whiteBoardsAdapter = WhiteBoardsAdapter(this)
        var linearLayoutManager = LinearLayoutManager(this)
        binding.whiteboardsRv.adapter = whiteBoardsAdapter
        binding.whiteboardsRv.layoutManager = linearLayoutManager
        whiteBoardsAdapter.setupListener(object : OnWhiteBoardClickListener {
            override fun onItemClick(boardId: String) {
                var intent = Intent(this@WhiteBoardFeedBackActivity, FeedBackActivity::class.java)
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