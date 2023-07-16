package com.example.kinopoiskup.listadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.kinopoiskup.R
import com.example.kinopoiskup.databinding.CollectionItemHorizontalBinding
import com.example.kinopoiskup.entity.CollectionEntity

class MainAdapter(
    private val onClick: (CollectionEntity, Long, Long?) -> Unit,
    private val filmBitmask: Long?
) : PagingDataAdapter<CollectionEntity, MainAdapter.MainViewHolder>(DIFF_CALLBACK) {

    private var bitmask = filmBitmask

    companion object {
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<CollectionEntity>() {
            override fun areItemsTheSame(
                oldItem: CollectionEntity,
                newItem: CollectionEntity
            ): Boolean =
                oldItem.name == newItem.name

            override fun areContentsTheSame(
                oldItem: CollectionEntity,
                newItem: CollectionEntity
            ): Boolean =
                oldItem == newItem
        }
    }

    inner class MainViewHolder(val binding: CollectionItemHorizontalBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(
            CollectionItemHorizontalBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val item = getItem(position)

        holder.binding.apply {
            if (item != null) {
                name.text = item.name
                count.text = item.count.toString()

                var target: Long = 1L
                target = target shl item.idx!!


                if (bitmask != null) {

                    if (bitmask!! and target > 0) {
                        checkbox.isChecked = true
                        checkbox.setCheckMarkDrawable(R.drawable.ic_baseline_check_box_24)
                    }
                    if (bitmask!! and target == 0L) {
                        checkbox.isChecked = false
                        checkbox.setCheckMarkDrawable(R.drawable.ic_baseline_unchecked_24)
                    }
                }


                checkbox.setOnClickListener {

                    if (checkbox.isChecked == false) {
                        checkbox.isChecked = true
                        item.count++
                        count.text = item.count.toString()
                        checkbox.setCheckMarkDrawable(R.drawable.ic_baseline_check_box_24)

                        onClick(item, target, bitmask)

                    } else {
                        checkbox.isChecked = false
                        if (item.count > 0) item.count--
                        count.text = item.count.toString() // update
                        checkbox.setCheckMarkDrawable(R.drawable.ic_baseline_unchecked_24)
                        target = target.inv() // set mask to reset bit position AND

                        onClick(item, target, bitmask)
                    }

                    }
                }
            }
    }

}