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
import com.example.kinopoiskup.databinding.MovieItemBinding
import com.example.kinopoiskup.entity.MoviesFilms


class ListAdapterFull(
    private val onClick: (Int, Int, Int) -> Unit
) : ListAdapter<MoviesFilms, ListAdapterFull.HorizontalViewHolder>(DIFF_CALLBACK) {

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

    inner class HorizontalViewHolder(val binding: MovieItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalViewHolder {
        return HorizontalViewHolder(
            MovieItemBinding.inflate(
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

                var filmId: Int = -1
                if (item.kinopoiskId != null) {
                    filmId = item.kinopoiskId!!
                } else if (item.filmId != null) {
                    filmId = item.filmId!!
                }
                var rating: Double? = null
                if (item.ratingKinopoisk != null) rating = item.ratingKinopoisk
                else if (item.ratingImdb != null) rating = item.ratingImdb
                else if (item.rating != null && !item.rating!!.contains("%"))  rating = item.rating!!.toDouble()

                if (rating == null) button.visibility = View.INVISIBLE
                else button.text = rating.toString()

                title.text = item.nameRu ?: ""
                genres.text = item.genres.joinToString(", ") { it.genre.toString() }


                poster.foreground = ResourcesCompat.getDrawable(
                    share.resources,
                    R.drawable.style_item_selector,
                    null
                )

                icon.visibility = View.INVISIBLE
                if (item.bitmask != null) {
                if (item.bitmask!! and 0x4000000000000000 > 0) {
                    poster.foreground =
                        ResourcesCompat.getDrawable(share.resources, R.drawable.border_shadow, null)
                    icon.visibility = View.VISIBLE
                }
                }
                share.setOnClickListener {
                    onClick(filmId, position, 2)
                }
              }

            item.let {
                Glide
                    .with(poster.context)
                    .load(it?.posterUrlPreview)
                    .into(poster)
            }

        }
    }

}