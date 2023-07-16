package com.example.kinopoiskup.listadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kinopoiskup.databinding.GalleryItemBinding
import com.example.kinopoiskup.entity.ImageItems


class PagedAdapterGallery(
    private val onClick: (Int, String?) -> Unit
) : PagingDataAdapter<ImageItems, PagedAdapterGallery.GalleryViewHolder>(DIFF_CALLBACK) {

    companion object {
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<ImageItems>() {
            override fun areItemsTheSame(
                oldItem: ImageItems,
                newItem: ImageItems
            ): Boolean =
                oldItem.imageUrl == newItem.imageUrl

            override fun areContentsTheSame(
                oldItem: ImageItems,
                newItem: ImageItems
            ): Boolean =
                oldItem == newItem
        }
    }

    inner class GalleryViewHolder(val binding: GalleryItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolder {
        return GalleryViewHolder(
            GalleryItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: GalleryViewHolder, position: Int) {
        val item = getItem(position)

        holder.binding.apply {
            item?.let {
                Glide
                    .with(poster.context)
                    .load(it.imageUrl)
                    .into(poster)
            }

            root.setOnClickListener {
                if (item != null) {
                    onClick(1, item.imageUrl)
                }
            }

        }
    }
}