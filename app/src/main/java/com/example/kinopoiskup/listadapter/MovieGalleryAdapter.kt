package com.example.kinopoiskup.listadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kinopoiskup.databinding.GalleryItemBinding
import com.example.kinopoiskup.entity.ImageItems
import com.example.kinopoiskup.entity.RecyclerItem

class MovieGalleryAdapter(
    private val onClick: (Int, Int, Int, RecyclerItem?) -> Unit
) : RecyclerView.Adapter<GalleryViewHolder>() {

    private var itemCount = 0
    private var data: List<ImageItems> = emptyList()
    private var photo = RecyclerItem()

    fun setData(data: List<ImageItems>, count: Int) {
        itemCount = count
        if (data.size <= count || count== -1) itemCount = data.size
        this.data = data
        notifyDataSetChanged()
    }


    override fun getItemCount(): Int {
            return itemCount
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolder {
        return GalleryViewHolder(
            GalleryItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: GalleryViewHolder, position: Int) {
        val item = data.getOrNull(position)
        with(holder.binding) {

            item.let {
                Glide
                    .with(poster.context)
                    .load(it?.imageUrl)
                    .into(poster)
            }

        }
        holder.binding.root.setOnClickListener {
            if (item != null) {
                photo.title = item.imageUrl
                onClick(1, position, 4, photo)
        }
    }
}
}

class GalleryViewHolder(val binding: GalleryItemBinding) : RecyclerView.ViewHolder(binding.root) {
}
