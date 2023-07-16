package com.example.kinopoiskup.listadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kinopoiskup.databinding.MovieItemHorizontalBinding
import com.example.kinopoiskup.entity.FilmStaffDTO
import com.example.kinopoiskup.entity.MoviesFilms
import com.example.kinopoiskup.entity.RecyclerItem
import kotlinx.coroutines.sync.Mutex


class PlainListAdapterHorizontal(
    private val onClick: (Int, Int, Int, RecyclerItem?) -> Unit
) : RecyclerView.Adapter<HorizontalViewHolderStaff>() {

    private var itemCount = 0
    private var data: List<FilmStaffDTO> = emptyList()

    fun setData(data: List<FilmStaffDTO>, count: Int) {
        itemCount = count
        if (data.size <= count || count == -1) itemCount = data.size
        this.data = data
        notifyDataSetChanged()
    }


    override fun getItemCount(): Int = itemCount

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalViewHolderStaff {
        return HorizontalViewHolderStaff(
            MovieItemHorizontalBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )
    }


        override fun onBindViewHolder(holder: HorizontalViewHolderStaff, position: Int) {
        val item = data.getOrNull(position)

        with(holder.binding) {

            button.visibility = View.GONE
            icon.visibility = View.GONE

            if (item!!.nameRu != null && item.nameRu!!.isNotEmpty()) line1.text = item.nameRu
            else line1.text = item.nameEn

            if (item.professionText != "Актеры" && item.professionText != "Продюсеры")  {
                var str = item.professionText
                if (item.description != null && item.description!!.length > 4) {
                    str = buildString {
                        append(item.professionText)
                        append(" ")
                        append(item.description)
                    }
                }
                line2.text = str
            }
            else {
                if (item.description != null)  line2.text = item.description
            }

                   item.let {
                Glide
                    .with(poster.context)
                    .load(it.posterUrl)
                    .into(poster)
            }
            root.setOnClickListener {
                if (item.professionText == "Актеры")
                    onClick(item.staffId!!, position, 3, null)
                else
                    onClick(item.staffId!!, position, 1, null)
            }


        }
    }
}


class HorizontalViewHolderStaff(val binding: MovieItemHorizontalBinding) : RecyclerView.ViewHolder(binding.root) {
}
