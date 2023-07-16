package com.example.kinopoiskup.presentation

import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.RecyclerView
import com.example.kinopoiskup.R
import com.example.kinopoiskup.databinding.FragmentSlideBinding
import com.example.kinopoiskup.entity.Episodes
import com.example.kinopoiskup.entity.ListItem
import com.example.kinopoiskup.entity.RecyclerItem
import com.example.kinopoiskup.entity.SeasonItems
import com.example.kinopoiskup.listadapter.MovieFragmentAdapterFull
import com.example.kinopoiskup.listadapter.MovieSimpleVerticalAdapter
import kotlinx.parcelize.Parcelize


private const val ARG_PARAM1 = "param1"

class FragmentSlide : Fragment() {

    private var position = 0
    private var title = ""

    private var _binding: FragmentSlideBinding? = null
    private val binding get() = _binding!!


    private lateinit var listAdapter: MovieSimpleVerticalAdapter
    private lateinit var list: List<SeasonItems>

    //used to create argument for Fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            val item: ListItem? =  it.getParcelable(ARG_PARAM1)
            list = item!!.itemsList
            position = item.position
            title = item.title
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSlideBinding.inflate(inflater, container, false)
        return binding.root
    }


        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

        listAdapter = MovieSimpleVerticalAdapter()
        binding.episodes.adapter = listAdapter
        listAdapter.setData(list[position].episodes)

        binding.tvSummary.text = getString(R.string.tab_header,position+1,list[position].episodes.size)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    companion object {
        @JvmStatic
        fun newInstance(param1: Parcelable) =
            FragmentSlide().apply {
                arguments = Bundle().apply {
                    putParcelable(ARG_PARAM1, param1)
                }
            }
    }

}