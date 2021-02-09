package com.mwalagho.ferdinand.runningapp.adapters

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.mwalagho.ferdinand.runningapp.db.Run

class RunAdapter : RecyclerView.Adapter<RunAdapter.RunViewHolder>() {

    //A nested class marked as inner can access the members of its outer class
    inner class  RunViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    val difCallbacl = object : DiffUtil.ItemCallback<Run>{
        override fun areItemsTheSame(oldItem: Run, newItem: Run): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Run, newItem: Run): Boolean {

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RunViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RunViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}
