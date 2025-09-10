package com.iprism.ecmoutboundmarketing.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.iprism.ecmoutboundmarketing.databinding.ToDoItemBinding
import com.iprism.ecmoutboundmarketing.interfaces.OnEventClickListener

class ToDoListAdapter() : RecyclerView.Adapter<ToDoListAdapter.TodoListViewHolder>() {

    private lateinit var listener: OnEventClickListener

    fun  setupListener(listener: OnEventClickListener){
        this.listener = listener
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ToDoListAdapter.TodoListViewHolder {
        var binding = ToDoItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TodoListViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ToDoListAdapter.TodoListViewHolder,
        position: Int
    ) {
        holder.binding.viewBtn.setOnClickListener { view ->
            listener.onItemClick("")
        }
    }

    override fun getItemCount(): Int {
        return 4
    }

    class TodoListViewHolder(var binding: ToDoItemBinding) : RecyclerView.ViewHolder(binding.root)

}