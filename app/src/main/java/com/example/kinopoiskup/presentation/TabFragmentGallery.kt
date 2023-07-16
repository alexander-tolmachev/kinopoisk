package com.example.kinopoiskup.presentation

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.text.bold
import androidx.core.text.color
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.kinopoiskup.databinding.FragmentTabGalleryBinding
import com.example.kinopoiskup.entity.QueryItem
import com.example.kinopoiskup.entity.RecyclerItem
import com.example.kinopoiskup.imageprocessing.CustomTabLayout
import com.example.kinopoiskup.listadapter.*
import com.google.android.material.tabs.TabLayout
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import java.util.*

@AndroidEntryPoint
class TabFragmentGallery : Fragment() {


    private var _binding: FragmentTabGalleryBinding? = null
    private val binding get() = _binding!!

    private val viewModel: MainViewModel by activityViewModels()
    private lateinit var listAdapter: MovieGalleryAdapter
    private lateinit var pagedAdapter: PagedAdapterGallery


    private var translations = mapOf(
        "STILL" to "кадры",
        "SHOOTING" to "изображения со съемок",
        "POSTER" to "постеры",
        "FAN_ART" to "фан-арты",
        "PROMO" to "промо",
        "CONCEPT" to "концепт-арты",
        "WALLPAPER" to "обои",
        "COVER" to "обложки",
        "SCREENSHOT" to "скриншоты"
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTabGalleryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        pagedAdapter = PagedAdapterGallery { a, b -> onItemClick(a, b) } // 1-создаем адаптер

        viewModel.picMap.forEach { i ->
            var string = i.key
            if (translations.containsKey(string)) string = translations.getValue(string)
            val text = string
            val newLine = text.replaceFirstChar(Char::titlecase)

            val s = SpannableStringBuilder()
                .bold { append(newLine) }
                .append("  ")
                .bold { color(Color.GRAY) { append(i.value.toString()) } }

            binding.tabs.addTab(binding.tabs.newTab().setText(s))
        }

        listAdapter = MovieGalleryAdapter() { a, b, c, d -> onClick(a, b, c, d) }
        val staggeredLayoutManager =
            StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        binding.filmography.layoutManager = staggeredLayoutManager

        if (viewModel.picMap.values.elementAt(0) > 20) {
            binding.filmography.adapter = pagedAdapter

            val bundleItem = QueryItem()
            bundleItem.param1 = viewModel.movieId
            bundleItem.param5 = viewModel.picMap.keys.elementAt(0)

            bundleItem.let {
                viewModel.pagedNetworkFlowGallery(it).onEach { pagingData ->
                    pagedAdapter.submitData(pagingData)
                }.launchIn(viewLifecycleOwner.lifecycleScope)
            }

        } else {
            binding.filmography.adapter = listAdapter
            listAdapter.setData(viewModel.picResults[0], -1)
        }

        val tabListener = object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                val tabPosition = tab?.position
                if (tabPosition != null) {

                    if (viewModel.picMap.values.elementAt(tabPosition) > 20) {
                        binding.filmography.adapter = pagedAdapter

                        val bundleItem = QueryItem()
                        bundleItem.param1 = viewModel.movieId
                        bundleItem.param5 = viewModel.picMap.keys.elementAt(tabPosition)

                        bundleItem.let {
                            viewModel.pagedNetworkFlowGallery(it).onEach { pagingData ->
                                pagedAdapter.submitData(pagingData)
                            }.launchIn(viewLifecycleOwner.lifecycleScope)
                        }

                    } else {
                        binding.filmography.adapter = listAdapter
                        listAdapter.setData(viewModel.picResults[tabPosition], -1)
                    }

                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabReselected(tab: TabLayout.Tab?) {}
        }
        binding.tabs.addOnTabSelectedListener(tabListener)
    }


    fun onClick(item: Int, position: Int, type: Int, params: RecyclerItem?) {

        if (params != null) {
            showPhoto(params.title)
        }
    }

    fun onItemClick(item: Int, image: String?) {

        if (image != null) {
            showPhoto(image)
        }

    }

    fun showPhoto(photoUri: String?) {
        val myIntent = Intent(requireActivity(), FullscreenActivity::class.java)
        myIntent.putExtra("key", photoUri)
        startActivity(myIntent)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}