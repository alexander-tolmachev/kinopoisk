package com.example.kinopoiskup.listadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kinopoiskup.R
import com.example.kinopoiskup.databinding.MovieItemHorizontalBinding
import com.example.kinopoiskup.entity.MoviesFilms

class MovieAdapterFull(
    private val onClick: (Int, Int, Int) -> Unit
) : ListAdapter<MoviesFilms, MovieAdapterFull.HorizontalViewHolder>(DIFF_CALLBACK) {

    companion object {
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<MoviesFilms>() {
            override fun areItemsTheSame(
                oldItem: MoviesFilms,
                newItem: MoviesFilms
            ): Boolean =
                oldItem.kinopoiskId == newItem.kinopoiskId

            override fun areContentsTheSame(
                oldItem: MoviesFilms,
                newItem: MoviesFilms
            ): Boolean =
                oldItem == newItem
        }
    }

    inner class HorizontalViewHolder(val binding: MovieItemHorizontalBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalViewHolder {
        return HorizontalViewHolder(
            MovieItemHorizontalBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: HorizontalViewHolder, position: Int) {
        val item = getItem(position)

        holder.binding.apply {


            if (item != null) {

                var rating: Double? = null
                if (item.ratingKinopoisk != null) rating = item.ratingKinopoisk
                else if (item.ratingImdb != null) rating = item.ratingImdb
                else if (item.rating != null && !item.rating!!.contains("%"))  rating = item.rating!!.toDouble()

                if (rating == null) button.visibility = View.INVISIBLE

                if (rating != null) {
                    button.visibility = View.VISIBLE
                    button.text = rating.toString()
                    button.bringToFront()
                }

                poster.foreground = ResourcesCompat.getDrawable(
                    share.resources,
                    R.drawable.style_item_selector,
                    null)

                icon.visibility = View.INVISIBLE
                if (item.bitmask != null) {
                    if (item.bitmask!! and 0x4000000000000000 > 0) {
                        poster.foreground = ResourcesCompat.getDrawable(
                            share.resources,
                            R.drawable.border_shadow,
                            null
                        )
                        icon.visibility = View.VISIBLE
                    }
                }

            line1.text = ""
            if (item.nameRu != null)
                line1.text = item.nameRu
            else if (item.nameOriginal != null)
                line1.text = item.nameOriginal
            else if (item.nameEn != null)
                line1.text = item.nameEn

            line2.text = ""
                var year = ""
            if (item.year != null) {
                year = StringBuilder().append(item.year.toString()).append(", ").toString()
            }
            line2.text = StringBuilder().append(year)
                .append(item.genres.joinToString(", ") { it.genre.toString() })
            }
            item.let {
                Glide
                    .with(poster.context)
                    .load(it?.posterUrlPreview)
                    .into(poster)
            }

        }
        holder.binding.root.setOnClickListener {
            if (item?.kinopoiskId != null) {
                onClick(item.kinopoiskId!!, position, 2)
            }
            else if (item?.filmId != null) {
                onClick(item.filmId!!, position, 3)
            }
        }
    }
}





