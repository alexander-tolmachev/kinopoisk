package com.example.kinopoiskup.listadapter

import android.app.ActionBar.LayoutParams
import android.content.Context
import android.graphics.Color
import android.util.Log
import android.util.SparseBooleanArray
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.selection.ItemDetailsLookup
import androidx.recyclerview.selection.ItemKeyProvider
import androidx.recyclerview.selection.SelectionTracker
import androidx.recyclerview.widget.RecyclerView
import com.example.kinopoiskup.R
import com.example.kinopoiskup.databinding.ItemSimpleBinding
import com.example.kinopoiskup.presentation.MainViewModel


class SimpleAdapter(
    private val onClick: (String, Int) -> Unit
) : RecyclerView.Adapter<SimpleAdapter.SimpleViewHolder>() {

    var values: MutableList<String> = mutableListOf()

    var tracker: SelectionTracker<String>? = null


    fun setData(data: List<String>) {
        this.values = data.toMutableList()
        notifyDataSetChanged()
    }


    override fun getItemCount(): Int = values.size

    override fun getItemId(position: Int): Long = position.toLong()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleViewHolder {
        val itemView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_simple, parent, false)
        return SimpleViewHolder(itemView)
    }

 override fun onBindViewHolder(holder: SimpleViewHolder, position: Int) {
     val item = values[position]
     holder.itemView.setOnClickListener {
         onClick(item, position)
     }

     tracker?.let {
         holder.bind(item, it.isSelected(item), position) // TODO String
     }

 }

    inner class SimpleViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private var text: TextView = view.findViewById(R.id.textLine)


        fun getItemDetails(): ItemDetailsLookup.ItemDetails<String> =
            object : ItemDetailsLookup.ItemDetails<String>() {
                override fun getPosition(): Int = bindingAdapterPosition
                override fun getSelectionKey(): String = values[bindingAdapterPosition]
                override fun inSelectionHotspot(e: MotionEvent): Boolean {
                    return true
                }
            }

       fun bind(value: String, isActivated: Boolean = false, position: Int) {
           if (value.contains("[0-9]".toRegex()))
           text.layoutParams.width = LayoutParams.WRAP_CONTENT
           else text.layoutParams.width = LayoutParams.MATCH_PARENT
           text.text = value
           itemView.isActivated = isActivated

       }
    }
}


class MyItemKeyProvider(private val adapter: SimpleAdapter) :
ItemKeyProvider<String>(SCOPE_MAPPED) {

    override fun getKey(position: Int): String {
    return adapter.values[position]
    }

    override fun getPosition(key: String): Int {
        return  adapter.values.indexOfFirst { it == key }
    }

}

class LocalSelectionPredicate(val context: Context, val adapter: SimpleAdapter, val viewModel: MainViewModel): SelectionTracker.SelectionPredicate<String>() {
    override fun canSelectMultiple(): Boolean {
        return false //true
    }

    override fun canSetStateForKey(key: String, nextState: Boolean): Boolean {
        val item = adapter.values.find { it == key }

        if (item!!.toLong() > (viewModel.yearLast?.toLong() ?: 2023L)) {
            Toast.makeText(context,"Выберите год младше окончания периода",Toast.LENGTH_SHORT).show()
            return false
        }

        return true
    }

    override fun canSetStateAtPosition(position: Int, nextState: Boolean): Boolean {
        val item = adapter.values[position]
        return true //item is ViewItem.NumberItem
    }

}

class LocalSelectionPredicate2(val context: Context, val adapter: SimpleAdapter, val viewModel: MainViewModel): SelectionTracker.SelectionPredicate<String>() {
    override fun canSelectMultiple(): Boolean {
        return false //true
    }

    override fun canSetStateForKey(key: String, nextState: Boolean): Boolean {
        val item = adapter.values.find { it == key }
        if (item!!.toLong() < (viewModel.yearFirst?.toLong() ?: 1955L)) {
            Toast.makeText(context,"Выберите год старше начала периода",Toast.LENGTH_SHORT).show()
            return false
        }
        return true
    }

    override fun canSetStateAtPosition(position: Int, nextState: Boolean): Boolean {
        val item = adapter.values[position]
        return true
    }

}
