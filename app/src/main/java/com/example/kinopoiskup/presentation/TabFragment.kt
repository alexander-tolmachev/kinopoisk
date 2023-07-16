package com.example.kinopoiskup.presentation


import android.graphics.Color
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.text.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kinopoiskup.R
import com.example.kinopoiskup.databinding.FragmentTabBinding
import com.example.kinopoiskup.entity.MoviesFilms
import com.example.kinopoiskup.listadapter.MovieAdapterFull
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


const val ARG_ITEM_ACTOR = "actor_name"


@AndroidEntryPoint
class TabFragment : Fragment() {

    private var title: String? = null
    private var tabSelected = 0
    private var firstPos = 0
    private var lastPos = 0
    private var tabSwitched = true
    var positions = mutableMapOf<Int,Int>()

    private var _binding: FragmentTabBinding? = null
    private val binding get() = _binding!!

    private val viewModel: MainViewModel by activityViewModels()
    private lateinit var listAdapter: MovieAdapterFull
    private lateinit var linearLayoutManager: LinearLayoutManager

    private var professions = mutableMapOf<String, Int>()
    private var translations = mapOf(
        "ACTOR" to "Актер",
        "EDITOR" to "Монтажер",
        "DIRECTOR" to "Режиссер",
        "VOICE_DIRECTOR" to "Режиссер озвучки",
        "PRODUCER" to "Продюсер",
        "HIMSELF" to "Играет сам себя",
        "HERSELF" to "Играет сама себя",
        "HRONO_TITR_MALE" to "Актер дубляжа",
        "HRONO_TITR_FEMALE" to "Актриса дубляжа",
        "WRITER" to "Сценарист",
        "OPERATOR" to "Оператор",
        "COMPOSER" to "Композитор",
        "VOICE_FEMALE" to "Озвучка",
        "VOICE_MALE" to "Озвучка"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            title = it.getString(ARG_ITEM_ACTOR)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTabBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvHeader.text = title
        positions.clear()

        professions.clear()
        populateProfessions(professions)
        var cnt = 0
        professions.forEach { i ->
            var string = i.key
            if (translations.containsKey(string)) string = translations.getValue(string)
            val text = string
            val newLine = text.replaceFirstChar(Char::titlecase)

            val s = SpannableStringBuilder()
                .bold { append(newLine) }
                .append("  ")
                .bold { color(Color.GRAY) { append(i.value.toString()) } }

            binding.tabs.addTab(binding.tabs.newTab().setText(s)) //(newLine))
            positions[cnt] = 0
            cnt++
           }

        listAdapter = MovieAdapterFull { a, b, c -> onClick(a, b, c) }
        binding.filmography.adapter = listAdapter

        linearLayoutManager =
            binding.filmography.layoutManager as LinearLayoutManager
        binding.filmography.setOnScrollChangeListener { v, i, i2, i3, i4 ->

            firstPos = linearLayoutManager.findFirstVisibleItemPosition()
            lastPos = linearLayoutManager.findLastVisibleItemPosition()

            viewModel.tryToRefreshItemsList(firstPos, lastPos, tabSelected)

            if (tabSwitched) {
                linearLayoutManager.scrollToPosition(positions[tabSelected]!!)
                tabSwitched = false
            }
        }


        observeRecyclerItem()

        viewModel.staffInfoFilmsLocal = emptyList<MoviesFilms>().toMutableList()
        viewModel.staffInfoFilmsLocal = viewModel.staffInfoFilms.filter {
            professions.keys.elementAt(0) == it.profession
        }.toMutableList()
        firstPos = linearLayoutManager.findFirstVisibleItemPosition() //0
        lastPos = linearLayoutManager.findLastVisibleItemPosition()
        viewModel.tryToRefreshItemsList(firstPos, lastPos, tabSelected) // TODO

        listAdapter.submitList(viewModel.staffInfoFilmsLocal)

        val tabListener = object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                val tabPosition = tab?.position
                if (tabPosition != null) {
                    tabSelected = tabPosition
                    viewModel.staffInfoFilmsLocal = emptyList<MoviesFilms>().toMutableList()
                    viewModel.staffInfoFilmsLocal = viewModel.staffInfoFilms.filter {
                        professions.keys.elementAt(tabPosition) == it.profession
                    }.toMutableList()

                    firstPos = linearLayoutManager.findFirstVisibleItemPosition() //positions[tabPosition]!! // TODO
                    lastPos = linearLayoutManager.findLastVisibleItemPosition()

                    viewModel.tryToRefreshItemsList(firstPos, lastPos, tabSelected)

                    listAdapter.submitList(viewModel.staffInfoFilmsLocal)
                    tabSwitched=true
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                val pos = linearLayoutManager.findFirstVisibleItemPosition()
                positions[tabSelected] = pos
                tabSwitched=true
            }
            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        }
        binding.tabs.addOnTabSelectedListener(tabListener)
    }


    private fun observeRecyclerItem() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.film.collect {

                val firstPos = linearLayoutManager.findFirstVisibleItemPosition()
                val lastPos = linearLayoutManager.findLastVisibleItemPosition()

                if (it.first == tabSelected && it.second >= firstPos && it.second <= lastPos) listAdapter.notifyItemChanged(
                    it.second
                )
            }
        }
    }

    private fun populateProfessions(professions: MutableMap<String, Int>) {

        viewModel.staffInfoFilms.forEach {
            if (professions.containsKey(it.profession)) professions.computeIfPresent(it.profession!!) { _, v -> v + 1 }
            else professions[it.profession!!] = 1
        }

    }

    fun onClick(item: Int, position: Int, type: Int) {

        if (viewModel.movieId != item)  viewModel.isForward = true
        viewModel.movieId = item
        viewModel.moviePosition = position
        findNavController().navigate(R.id.navigation_moviedetails) // TODO - грузится ок но ошибка
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {

        @JvmStatic
        fun newInstance(itemTitle: String): TabFragment =
            TabFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_ITEM_ACTOR, itemTitle)
                }
            }
    }
}