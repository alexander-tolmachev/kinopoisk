package com.example.kinopoiskup.listadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kinopoiskup.databinding.RecyclerItemBinding
import com.example.kinopoiskup.entity.RecyclerItem

class MovieFragmentAdapter(
    private val onClickContinue: (RecyclerItem?) -> Unit,
    private val onClick: (Int, Int, Int, RecyclerItem?) -> Unit
) : RecyclerView.Adapter<MovieFragmentViewHolder>() {


    private var values: List<RecyclerItem> = emptyList()

    fun setData(data: List<RecyclerItem>) {
        this.values = data
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = values.size


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieFragmentViewHolder {

        return MovieFragmentViewHolder(
            RecyclerItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MovieFragmentViewHolder, position: Int) {
        val item = values.getOrNull(position)

        with(holder.binding) {
            if (item != null) {
                text.text = item.title
                textRight.text = item.mark
            }
            if (item != null) {

                val movieAdapter = MovieAdapter { a, b, c, d -> onClick(a, b, c, d) }
                podsList.adapter = movieAdapter

                movieAdapter.setData(item.list!!, 20, 1, item)


            }
            textRight.setOnClickListener {
                onClickContinue(item)
            }
        }

    }

}

class MovieFragmentViewHolder(val binding: RecyclerItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
}
