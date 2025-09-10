package com.iprism.ecmoutboundmarketing.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.iprism.ecmoutboundmarketing.adapters.ToDoListAdapter
import com.iprism.ecmoutboundmarketing.databinding.ActivityToDoListsBinding
import com.iprism.ecmoutboundmarketing.interfaces.OnEventClickListener

class ToDoListsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityToDoListsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityToDoListsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        handleBack()
        handleAddPlanBtn()
        setupTodoListsAdapter()
    }

    private fun setupTodoListsAdapter() {
        var todoListAdapter = ToDoListAdapter()
        var linearLayoutManager = LinearLayoutManager(this)
        binding.toDoListRv.adapter = todoListAdapter
        binding.toDoListRv.layoutManager = linearLayoutManager
        todoListAdapter.setupListener(object : OnEventClickListener {
            override fun onItemClick(eventId: String) {
                var intent = Intent(this@ToDoListsActivity, AddTodoListActivity::class.java)
                intent.putExtra("tag", "Old")
                startActivity(intent)
            }

        })
    }

    private fun handleAddPlanBtn() {
        binding.addPlanBtn.setOnClickListener { view ->
            var intent = Intent(this, AddTodoListActivity::class.java)
            intent.putExtra("tag", "New")
            startActivity(intent)
        }

    }

    private fun handleBack() {
        binding.backImg.setOnClickListener { view ->
            finish()
        }
    }
}