package com.example.kinopoiskup.listadapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager.VERTICAL
import com.example.kinopoiskup.R
import com.example.kinopoiskup.databinding.RecyclerItemBinding
import com.example.kinopoiskup.entity.RecyclerItem



class MovieFragmentAdapterFull(
    private val onClickCollection: () -> Unit,
    private val onClickContinue: (RecyclerItem?) -> Unit,
    private val onClick: (Int, Int, Int, RecyclerItem?) -> Unit
) : RecyclerView.Adapter<MovieFragmentViewHolder>() {

    private var values: List<RecyclerItem> = emptyList()

    fun setData(data: List<RecyclerItem>) {
        this.values = data
        notifyDataSetChanged()
    }

    fun clear() {
        val size: Int = values.size
        values = emptyList()
        notifyItemRangeRemoved(0, size)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemViewType(position: Int): Int {
        return position
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


        val item = values[position]
        with(holder.binding) {
            when (item.type) {
                0 -> {
                    text.text = item.title

                    if (item.param2!! > 0) {
                        textRight.text = holder.binding.root.context.resources.getString(R.string.count, item.param2)
                    }
                    val movieAdapter = MovieGalleryAdapter { a, b, c, d -> onClick(a, b, c, d) }
                    podsList.adapter = movieAdapter
                    movieAdapter.setData(item.imagelist!!, 20)
                }
                1 -> {
                    text.text = item.title
                    if (item.list!!.size > 20) {
                        textRight.text = "Еще"
                    }

                    val movieAdapter = MovieAdapter { a, b, c, d -> onClick(a, b, c, d) }
                    movieAdapter.hasStableIds()
                    podsList.adapter = movieAdapter
                    movieAdapter.setData(item.list!!, 20, 1, item)
                }
                2 -> {
                    text.text = item.title
                    if (item.stafflist!!.size > 20) {
                        textRight.text = holder.binding.root.context.resources.getString(R.string.count, item.stafflist!!.size)
                    }
                    val movieAdapter = MovieGridAdapter { a, b, c, d -> onClick(a, b, c, d) }

                    val gridLayoutManager = GridLayoutManager(holder.itemView.context, 4)
                    gridLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
                    podsList.layoutManager = gridLayoutManager
                    podsList.addItemDecoration(
                        DividerItemDecoration(
                            holder.itemView.context,
                            DividerItemDecoration.HORIZONTAL
                        )
                    )
                    podsList.layoutManager!!.scrollToPosition(item.position)
                    podsList.adapter = movieAdapter
                    movieAdapter.setData(item.stafflist!!, 20)
                }
                3 -> {
                    text.text = item.title
                    if (item.stafflist!!.size > 20) {
                        textRight.text = holder.binding.root.context.resources.getString(R.string.count, item.stafflist!!.size)
                    }
                    val movieAdapter = MovieGridAdapter { a, b, c, d -> onClick(a, b, c, d) }

                    val gridLayoutManager = GridLayoutManager(holder.itemView.context, 2)
                    gridLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
                    podsList.layoutManager = gridLayoutManager
                    podsList.addItemDecoration(
                        DividerItemDecoration(
                            holder.itemView.context,
                            DividerItemDecoration.HORIZONTAL
                        )
                    )
                    podsList.layoutManager!!.scrollToPosition(item.position)
                    podsList.adapter = movieAdapter
                    movieAdapter.setData(item.stafflist!!, 6)
                }
                4 -> {
                    text.text = item.title
                    if (item.list!!.size > 20) {
                        textRight.text = holder.binding.root.context.resources.getString(R.string.count, item.list!!.size)
                    }
                    if (item.list!!.isEmpty())  text.visibility = View.GONE
                    else text.visibility = View.VISIBLE

                    val movieAdapter = MovieAdapter { a, b, c, d -> onClick(a, b, c, d) }
                    podsList.adapter = movieAdapter
                    item.position = 62 // просмотренные
                    movieAdapter.setData(item.list!!, 20, 0, item)
                }
                5 -> {
                    text.text = item.title
                    if (item.list!!.size > 20) {
                        textRight.text = holder.binding.root.context.resources.getString(R.string.count, item.list!!.size)
                    }
                    if (item.list!!.isEmpty())  text.visibility = View.GONE
                    else text.visibility = View.VISIBLE

                    val movieAdapter = MovieAdapter { a, b, c, d -> onClick(a, b, c, d) }
                    podsList.adapter = movieAdapter
                    item.position = 0
                    movieAdapter.setData(item.list!!, 20, 0, item)
                }

                6 -> {
                    text.text = item.title
                    button.visibility = View.VISIBLE
                    textLeft.visibility = View.VISIBLE
                    val movieAdapter = ItemCollectionAdapter { a, b, c, d -> onClick(a, b, c, d) }

                    val gridLayoutManager = GridLayoutManager(holder.itemView.context, 2)
                    gridLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
                    podsList.layoutManager = gridLayoutManager

                    podsList.layoutManager!!.scrollToPosition(item.position)
                    podsList.adapter = movieAdapter
                    movieAdapter.setData(item.collections!!, 15) // TODO was 15
                }

            }
            textRight.setOnClickListener {
                onClickContinue(item)
            }
            button.setOnClickListener {
                onClickCollection()
            }
        }
    }

}

//class MovieFragmentViewHolder(val binding: RecyclerItemBinding) :
//    RecyclerView.ViewHolder(binding.root) {
//}
