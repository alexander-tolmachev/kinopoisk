package com.example.kinopoiskup.listadapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.content.res.ResourcesCompat.getDrawable
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kinopoiskup.R
import com.example.kinopoiskup.databinding.MovieItemBinding
import com.example.kinopoiskup.entity.MoviesFilms

import com.example.kinopoiskup.entity.RecyclerItem


class MovieAdapter(
    private val onClick: (Int, Int, Int, RecyclerItem?) -> Unit // параметр функционального типа
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var itemCount = 0
    private var dataType = 0
    private var dataLine = 0
    private var category = 0
    private var queryParams: RecyclerItem? = null

    private var data: List<MoviesFilms> = emptyList()
    private val transCat = RecyclerItem()

    fun setData(data: List<MoviesFilms>, count: Int, type: Int, params: RecyclerItem?) {
        itemCount = count
        dataType = type
        queryParams = params
        if (params != null) {
          if (params.line != null)  dataLine = params.line!!
          category = params.position
        }

        this.data = data
        notifyDataSetChanged()

    }


    override fun getItemViewType(position: Int): Int {
        if (position < itemCount) return R.layout.movie_item
        else return R.layout.button_layout
    }


    override fun getItemCount(): Int {
        return if (data.isEmpty()) 0
        else if (data.size < itemCount) return data.size
        else return itemCount + 1
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            R.layout.movie_item -> {
                val view =
                    LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
                ThumbnailViewHolder(view)
            }
            R.layout.button_layout -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.button_layout, parent, false)
                PlaceholderViewHolder(view)
            }
            else -> throw IllegalArgumentException("unknown view type $viewType")
        }
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when (getItemViewType(position)) {
            R.layout.movie_item -> (holder as ThumbnailViewHolder).bind(data[position], position)
            R.layout.button_layout -> (holder as PlaceholderViewHolder).bind(
                data[position - 1],
                position
            )
        }
    }

    inner class ThumbnailViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title: TextView
        var genres: TextView
        var poster: ImageView
        var itemV: FrameLayout
        var icon: ImageView
        var button: TextView

        init {
            itemV = view.findViewById<View>(R.id.share) as FrameLayout
            title = view.findViewById<View>(R.id.title) as TextView
            genres = view.findViewById<View>(R.id.genres) as TextView
            poster = view.findViewById<View>(R.id.poster) as ImageView
            icon = view.findViewById<View>(R.id.icon) as ImageView
            button = view.findViewById<View>(R.id.button) as TextView
        }

        fun bind(item: MoviesFilms, position: Int) {

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

            if (item.nameRu == null && item.nameEn == null) title.text = item.nameOriginal
            else {
                if (item.nameRu != null && !item.nameRu!!.isEmpty())  title.text = item.nameRu
                else if (item.nameEn != null)   title.text = item.nameEn
            }


            genres.text = item.genres.joinToString(", ") { it.genre.toString() }

            item.let {
                Glide
                    .with(poster.context)
                    .load(it.posterUrlPreview)
                    .into(poster)
            }

            poster.foreground = getDrawable(itemV.resources, R.drawable.style_item_selector, null)
            icon.visibility = View.INVISIBLE
            if (item.bitmask != null) {
            if (item.bitmask!! and 0x4000000000000000 > 0) {
                poster.foreground = getDrawable(itemV.resources, R.drawable.border_shadow, null)
                icon.visibility = View.VISIBLE
            }
            }
            itemV.setOnClickListener {
                if (item.duration == 0 || item.duration == 1) onClick(filmId, item.duration!!, 2, null)
                else onClick(filmId, position, 2, null)
            }
        }
    }

    inner class PlaceholderViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var btn: ImageButton
        var text: TextView
        var text2: TextView

        init {
            btn = view.findViewById<View>(R.id.button) as ImageButton
            text = view.findViewById<View>(R.id.buttonText) as TextView
            text2 = view.findViewById<View>(R.id.buttonText2) as TextView
        }

        fun bind(item: MoviesFilms, position: Int) {
            if (dataType == 0) {
                btn.setImageResource(R.drawable.ic_outline_restore_from_trash_24)
                text.text = "Очистить"
                text2.text = "историю"
                btn.setOnClickListener {

                    onClick(category, 0, 9, null)  // 62 - просмотренные, 0 - было интересно
                }
            } else if (dataType > 0) {
                btn.setImageResource(R.drawable.ic_baseline_arrow_forward_24)
                text.text = "Показать все"
                text2.text = ""

                btn.setOnClickListener {
                    onClick(dataLine, 0, 0, queryParams)
                }
            }
        }
    }
}


class MovieViewHolder(val binding: MovieItemBinding) : RecyclerView.ViewHolder(binding.root) {
}





