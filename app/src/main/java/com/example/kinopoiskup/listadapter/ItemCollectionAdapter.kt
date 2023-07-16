package com.example.kinopoiskup.listadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.kinopoiskup.R
import com.example.kinopoiskup.databinding.ItemCardViewBinding
import com.example.kinopoiskup.entity.CollectionEntity
import com.example.kinopoiskup.entity.RecyclerItem

class ItemCollectionAdapter(
    private val onClick: (Int, Int, Int, RecyclerItem?) -> Unit // параметр функционального типа
) : RecyclerView.Adapter<CollectionViewHolder>() {

    private var itemCount = 0
    private var data: List<CollectionEntity> = emptyList()

    fun setData(data: List<CollectionEntity>, count: Int) {
        itemCount = count
        if (data.size < count || count == -1) itemCount = data.size
        this.data = data
        notifyDataSetChanged()
    }


    override fun getItemCount(): Int = data.size  // TODO - count not used?


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectionViewHolder {
        return CollectionViewHolder(
            ItemCardViewBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: CollectionViewHolder, position: Int) {
        val item = data.getOrNull(position) // values[position]
        with(holder.binding) {


            if (item != null) {
                tvCollection.text = item.name
                button.text = item.count.toString()
                if (item.idx == 61) {
                    icon.setImageDrawable(
                        ResourcesCompat.getDrawable(root.resources,
                            R.drawable.ic_baseline_favorite_border_24, null)
                    )
                    imageView.visibility = View.GONE
                }
                else if (item.idx == 60) {
                    icon.setImageDrawable(
                        ResourcesCompat.getDrawable(root.resources,
                            R.drawable.ic_baseline_bookmark_border_24, null)
                    )
                    imageView.visibility = View.GONE
                }
            }

        }
        holder.binding.imageView.setOnClickListener {
            if (item?.idx != null) {
                onClick(item.idx!!, position, 7, null) // returns collection number to be deleted
            }
        }
        holder.binding.root.setOnClickListener {
            if (item?.idx != null) {
                onClick(item.idx!!, item.count, 8, null) // TODO returns collection number and count (instead position)
            }
        }
    }
}


class CollectionViewHolder(val binding: ItemCardViewBinding) :
    RecyclerView.ViewHolder(binding.root) {
}
