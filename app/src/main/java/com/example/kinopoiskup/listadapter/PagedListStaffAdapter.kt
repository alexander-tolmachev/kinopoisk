package com.example.kinopoiskup.listadapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kinopoiskup.R
import com.example.kinopoiskup.databinding.MovieItemHorizontalBinding
import com.example.kinopoiskup.entity.FilmStaffDTO
import com.example.kinopoiskup.entity.MoviesFilms
import com.example.kinopoiskup.entity.RecyclerItem
import com.example.kinopoiskup.entity.StaffEntity

class PagedListStaffAdapter(
    private val onClick: (Int, Int, Int, RecyclerItem?) -> Unit
) : PagingDataAdapter<StaffEntity, StaffViewHolderHorizontal>(DIFF_CALLBACK) {

    companion object {
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<StaffEntity>() {
            override fun areItemsTheSame(
                oldItem: StaffEntity,
                newItem: StaffEntity
            ): Boolean =
                oldItem.staffId == newItem.staffId

            override fun areContentsTheSame(
                oldItem: StaffEntity,
                newItem: StaffEntity
            ): Boolean =
                oldItem == newItem
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StaffViewHolderHorizontal {
        return StaffViewHolderHorizontal(
            MovieItemHorizontalBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }


    override fun onBindViewHolder(holder: StaffViewHolderHorizontal, position: Int) {
        val item = getItem(position)

        holder.binding.apply {
            if (item != null) {

                button.visibility = View.GONE
                icon.visibility = View.GONE

                if (item.nameRu != null && item.nameRu!!.isNotEmpty()) line1.text = item.nameRu
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
                        onClick(item.staffId, position, 3, null)
                    else
                        onClick(item.staffId, position, 1, null)
                }

            }
        }
    }

}


class StaffViewHolderHorizontal(val binding: MovieItemHorizontalBinding) : RecyclerView.ViewHolder(binding.root) {
}
