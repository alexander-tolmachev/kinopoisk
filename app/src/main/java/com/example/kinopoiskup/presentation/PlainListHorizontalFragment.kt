package com.example.kinopoiskup.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.kinopoiskup.R
import com.example.kinopoiskup.databinding.FragmentResultsRecyclerItemsBinding
import com.example.kinopoiskup.entity.QueryItem
import com.example.kinopoiskup.entity.RecyclerItem
import com.example.kinopoiskup.listadapter.PagedListNetworkAdapterHorizontal
import com.example.kinopoiskup.listadapter.PagedListStaffAdapter
import com.example.kinopoiskup.listadapter.PlainListAdapterHorizontal
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

@AndroidEntryPoint
class PlainListHorizontalFragment : Fragment() {

    private var _binding: FragmentResultsRecyclerItemsBinding? = null
    private val binding get() = _binding!!

    private val viewModel: MainViewModel by activityViewModels()
    private lateinit var pagedAdapter: PagedListStaffAdapter

    private var displayJob: Job? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentResultsRecyclerItemsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        pagedAdapter = PagedListStaffAdapter { a, b, c, d -> onClick(a, b, c, d) }
        binding.resultsList.adapter = pagedAdapter

        val bundleItem: QueryItem? = arguments?.getParcelable("query") as? QueryItem
        var query = bundleItem?.query

        if (query == 2) query = 1 // ACTOR=true
        else query = 0 // ACTOR=false

        subscribeStaffList(query)
    }

    private fun subscribeStaffList(query: Int) {
        // Make sure we cancel the previous job before creating a new one
        displayJob?.cancel()
        displayJob =  viewLifecycleOwner.lifecycleScope.launch {
            viewModel.pagedStaffFlow(query).collectLatest { pagingData ->
                pagedAdapter.submitData(pagingData)       }
        }
    }


    fun onClick(item: Int, position: Int, type: Int, params: RecyclerItem?) {
        viewModel.actorId = item
        findNavController().navigate(R.id.action_nav_stafflist_to_actor_details)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
