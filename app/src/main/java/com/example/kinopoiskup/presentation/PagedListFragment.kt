package com.example.kinopoiskup.presentation

import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.paging.LoadState
import com.example.kinopoiskup.R
import com.example.kinopoiskup.databinding.FragmentPagedListBinding
import com.example.kinopoiskup.entity.ListItem
import com.example.kinopoiskup.entity.MoviesFilms
import com.example.kinopoiskup.entity.QueryItem
import com.example.kinopoiskup.listadapter.PagedListNetworkAdapter
import com.example.kinopoiskup.listadapter.PagerLoadStateAdapter
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach


class PagedListFragment : Fragment() {

    private var _binding: FragmentPagedListBinding? = null
    private val binding get() = _binding!!

    private val viewModel: MainViewModel by activityViewModels()

    private val pagedAdapter =
        PagedListNetworkAdapter { a -> onItemClick(a) } // 1-создаем адаптер

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPagedListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundleItem: QueryItem? = arguments?.getParcelable("query") as? QueryItem


        if (bundleItem?.param5 != null)
            (activity as AppCompatActivity).supportActionBar?.title = bundleItem.param5

        binding.paginatedList.adapter =
            pagedAdapter.withLoadStateFooter(PagerLoadStateAdapter())

        binding.swipeRefresh.setOnRefreshListener {
            pagedAdapter.refresh()
        }

        pagedAdapter.loadStateFlow.onEach {
            binding.swipeRefresh.isRefreshing = it.refresh == LoadState.Loading
        }.launchIn(viewLifecycleOwner.lifecycleScope)


        bundleItem?.let {
            viewModel.pagedNetworkFlow(it).onEach { pagingData ->
                pagedAdapter.submitData(pagingData)
            }.launchIn(viewLifecycleOwner.lifecycleScope)
        }


    }

    private fun onItemClick(item: MoviesFilms) {
        var movieId = 0
        if (item.filmId != null) movieId = item.filmId!!
        else if (item.kinopoiskId != null) movieId = item.kinopoiskId!!
        if (viewModel.movieId != movieId)  viewModel.isForward = true
        viewModel.movieId = movieId
        findNavController().navigate(R.id.nav_pagedlist_to_full)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
