package com.example.kinopoiskup.listadapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kinopoiskup.databinding.GridItemBinding
import com.example.kinopoiskup.entity.FilmStaffDTO
import com.example.kinopoiskup.entity.RecyclerItem

class MovieGridAdapter(
    private val onClick: (Int, Int, Int, RecyclerItem?) -> Unit // параметр функционального типа
) : RecyclerView.Adapter<GridViewHolder>() {

    private var itemCount = 0
    private var data: List<FilmStaffDTO> = emptyList()

    fun setData(data: List<FilmStaffDTO>, count: Int) {
        itemCount = count
        if (data.size <= count || count == -1) itemCount = data.size
        this.data = data
        notifyDataSetChanged()
    }


    override fun getItemCount(): Int = itemCount

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        return GridViewHolder(
            GridItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        val item = data.getOrNull(position)

        with(holder.binding) {

            if (item!!.nameRu != null && item.nameRu!!.isNotEmpty()) name.text = item.nameRu
            else name.text = item.nameEn
            if (item.professionText != "Актеры" && item.professionText != "Продюсеры")  {
                var str = item.professionText
                if (item.description != null && item.description!!.length > 4) {
                    str = buildString {
                        append(item.professionText)
                        append(" ")
                        append(item.description)
                    }
                }
                personage.text = str
            }
            else {
                if (item.description != null)  personage.text = item.description
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


class GridViewHolder(val binding: GridItemBinding) : RecyclerView.ViewHolder(binding.root) {
}
