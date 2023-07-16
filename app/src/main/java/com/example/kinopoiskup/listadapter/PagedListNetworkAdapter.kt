package com.example.kinopoiskup.listadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kinopoiskup.R
import com.example.kinopoiskup.databinding.LoadStateBinding
import com.example.kinopoiskup.databinding.MovieItemBinding
import com.example.kinopoiskup.entity.MoviesFilms

class PagedListNetworkAdapter(
    private val onClick: (MoviesFilms) -> Unit
) : PagingDataAdapter<MoviesFilms, MovieViewHolder>(MoviesFilmsDiffUtilCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            MovieItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }


    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val item = getItem(position) //вместо data.getOrNull(position)

        with(holder.binding) {
            title.text = item?.nameRu ?: ""
            genres.text = item?.genres?.joinToString(", ") { it.genre.toString() }

            var filmId: Int = -1
            if (item!!.kinopoiskId != null) {
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


            poster.foreground =
                ResourcesCompat.getDrawable(share.resources, R.drawable.style_item_selector, null)
            icon.visibility = View.INVISIBLE
            if (item.bitmask != null) {
            if (item.bitmask!! and 0x4000000000000000 > 0) {

                poster.foreground =
                    ResourcesCompat.getDrawable(share.resources, R.drawable.border_shadow, null)

                icon.visibility = View.VISIBLE
            }
        }


            item.let {
                Glide
                    .with(poster.context)
                    .load(it?.posterUrl)
                    .into(poster)
            }


        }
        holder.binding.root.setOnClickListener {
            if (item != null) {
                onClick(item)
            }
        }
    }
}

class MoviesFilmsDiffUtilCallback: DiffUtil.ItemCallback<MoviesFilms>() {

    override fun areItemsTheSame(oldItem: MoviesFilms, newItem: MoviesFilms): Boolean =
        oldItem.filmId==newItem.filmId

    override fun areContentsTheSame(oldItem: MoviesFilms, newItem: MoviesFilms): Boolean =
        oldItem == newItem
}

class PagerLoadStateAdapter : LoadStateAdapter<LoadStateViewHolder>() {
    override fun onBindViewHolder(holder: LoadStateViewHolder, loadState: LoadState) = Unit

    override fun onCreateViewHolder(parent: ViewGroup, loadState: LoadState): LoadStateViewHolder {
        val binding = LoadStateBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LoadStateViewHolder(binding)
    }
}

class LoadStateViewHolder(binding: LoadStateBinding) : RecyclerView.ViewHolder(binding.root)

