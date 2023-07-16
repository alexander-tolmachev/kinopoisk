package com.example.kinopoiskup.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.kinopoiskup.R
import com.example.kinopoiskup.databinding.FragmentPagedListBinding
import com.example.kinopoiskup.entity.QueryItem
import com.example.kinopoiskup.listadapter.ListAdapterFull

class PlainListFragment : Fragment() {

    private var _binding: FragmentPagedListBinding? = null
    private val binding get() = _binding!!
    private var checkRun = false

    private val viewModel: MainViewModel by activityViewModels()
    private lateinit var listAdapter: ListAdapterFull

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


        listAdapter = ListAdapterFull { a, b, c -> onClick(a, b, c) }
        binding.paginatedList.adapter = listAdapter

        if (bundleItem != null) {
            if (bundleItem.param4 != null) {
                listAdapter.submitList(bundleItem.param4)
                checkRun = true
            }
        }
        }


    fun onClick(item: Int, position: Int, type: Int) {
        if (viewModel.movieId != item)  viewModel.isForward = true
        viewModel.movieId = item
        findNavController().navigate(R.id.nav_plainlist_to_full)
    }

    private fun subscribeUi() {
        viewModel.showSearchResults.observe(viewLifecycleOwner) { item ->
            if (!checkRun)  listAdapter.submitList(item)
        }
    }

    override fun onStart() {
        super.onStart()
        subscribeUi()
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
