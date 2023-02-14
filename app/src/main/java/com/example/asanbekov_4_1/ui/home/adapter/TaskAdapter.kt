package com.example.asanbekov_4_1.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.asanbekov_4_1.databinding.ItemTaskBinding
import com.example.asanbekov_4_1.model.Task


class TaskAdapter : Adapter<TaskAdapter.TaskViewHolder>() {
    private val data = arrayListOf<Task>()

    fun addTask(task : Task ){
        data.add(0,task)
        notifyItemChanged(0)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
         return TaskViewHolder(ItemTaskBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.count()
    }
    inner  class  TaskViewHolder(private val binding:ItemTaskBinding):ViewHolder(binding.root) {
        fun bind(task: Task) {
             binding.title.text=task.title
             binding.description.text=task.description
        }
    }
}