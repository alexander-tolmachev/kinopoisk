package com.example.kinopoiskup.listadapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.content.res.ResourcesCompat
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kinopoiskup.R
import com.example.kinopoiskup.databinding.MovieItemHorizontalBinding
import com.example.kinopoiskup.entity.MoviesFilms


class PagedListNetworkAdapterHorizontal(
    private val onClick: (Int, Int, Int) -> Unit
) : PagingDataAdapter<MoviesFilms, MovieViewHolderHorizontal>(MoviesFilmsDiffUtilCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolderHorizontal {
        return MovieViewHolderHorizontal(
            MovieItemHorizontalBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }


    override fun onBindViewHolder(holder: MovieViewHolderHorizontal, position: Int) {
        val item = getItem(position) //вместо data.getOrNull(position)

        holder.binding.apply {
            if (item != null) {

                var rating: Double? = null
                if (item.ratingKinopoisk != null) rating = item.ratingKinopoisk
                else if (item.ratingImdb != null) rating = item.ratingImdb
                else if (item.rating != null && !item.rating!!.contains("%"))  rating = item.rating!!.toDouble()

                if (rating != null) {
                    button.text = rating.toString()
                    button.bringToFront()
                }

                    poster.foreground =
                        ResourcesCompat.getDrawable(share.resources, R.drawable.style_item_selector, null)
                    icon.visibility = View.INVISIBLE

                    if (item.bitmask != null) {
                    if (item.bitmask!! and 0x4000000000000000 > 0) {
                        //Log.d("HeccjNehbcnj", "поиск ${item.bitmask}")
                        poster.foreground =
                            ResourcesCompat.getDrawable(share.resources, R.drawable.border_shadow, null)
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
                if (item.year != null) line2.text = item.year.toString()

                line2.text = StringBuilder().append(item.year.toString())
                    .append(", ")
                    .append(item.genres.joinToString(", ") { it.genre.toString() })


            }
            item.let {
                Glide
                    .with(poster.context)
                    .load(it?.posterUrlPreview)
                    .into(poster)
            }
            root.setOnClickListener {
                if (item != null) {
                    onClick(item.kinopoiskId!!, position, 2)
                }
            }
        }
    }

}


class MovieViewHolderHorizontal(val binding: MovieItemHorizontalBinding) : RecyclerView.ViewHolder(binding.root) {
}
