package com.example.kinopoiskup.listadapter


import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kinopoiskup.databinding.ItemRvEpisodeBinding
import com.example.kinopoiskup.entity.Episodes
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*


class MovieSimpleVerticalAdapter : RecyclerView.Adapter<SimpleListViewHolder>() {

    private var values: List<Episodes> = emptyList()

    fun setData(data: List<Episodes>) {
        this.values = data
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = values.size


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleListViewHolder {

        return SimpleListViewHolder(
            ItemRvEpisodeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: SimpleListViewHolder, position: Int) {
        val item = values.getOrNull(position)

        var text = "no name"
        with(holder.binding) {

            if (item != null) {

                //Log.d("HeccjNehbcnj","recycler item: $item")
                if (item.nameRu != null)
                    text = item.nameRu!!
                else if (item.nameEn != null)
                    text = item.nameEn!!

                line1.text =
                    StringBuilder().append(item.episodeNumber.toString())
                        .append(" серия. ")
                        .append(text)


                val sourceFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
                val desiredFormat = SimpleDateFormat("d MMMM yyyy", Locale.getDefault())

                val date: Date = sourceFormat.parse(item.releaseDate!!)!!
                line3.text = desiredFormat.format(date.getTime())


                line4.text = ""
                if (item.synopsis != null)
                    line4.text =
                    StringBuilder().append(". ")
                        .append(item.synopsis)
            }

        }
    }

}

class SimpleListViewHolder(val binding: ItemRvEpisodeBinding) :
    RecyclerView.ViewHolder(binding.root) {
}
