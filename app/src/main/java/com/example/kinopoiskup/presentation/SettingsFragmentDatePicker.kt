package com.example.kinopoiskup.presentation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.selection.SelectionTracker
import androidx.recyclerview.selection.StorageStrategy
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kinopoiskup.R
import com.example.kinopoiskup.databinding.FragmentSettingsDatePickerBinding
import com.example.kinopoiskup.listadapter.*


class SettingsFragmentDatePicker : Fragment() {


    private lateinit var searchAdapter: SimpleAdapter
    private lateinit var searchAdapter2: SimpleAdapter
    private val viewModel: MainViewModel by activityViewModels()

    private var _binding: com.example.kinopoiskup.databinding.FragmentSettingsDatePickerBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSettingsDatePickerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        searchAdapter = SimpleAdapter  { a, b -> onClick(a, b) }
        searchAdapter.setHasStableIds(true)
        binding.yearsList.adapter = searchAdapter
        val gridLayoutManager = GridLayoutManager(context, 4)
        gridLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        binding.yearsList.layoutManager = gridLayoutManager


        val tracker = SelectionTracker.Builder(
            "yearsSelectionFrom",
            binding.yearsList,
            MyItemKeyProvider(searchAdapter),
            MyItemDetailsLookup(binding.yearsList),
            StorageStrategy.createStringStorage()
        ).withSelectionPredicate(
            LocalSelectionPredicate(requireContext(), searchAdapter, viewModel)
        ).build()
        searchAdapter.tracker = tracker



        searchAdapter2 = SimpleAdapter { a, b -> onClick2(a, b) }
        searchAdapter2.setHasStableIds(true)
        val gridLayoutManager2 = GridLayoutManager(context, 4)
        gridLayoutManager2.orientation = LinearLayoutManager.HORIZONTAL
        binding.yearsList2.adapter = searchAdapter2
        binding.yearsList2.layoutManager = gridLayoutManager2

        val tracker2 = SelectionTracker.Builder(
            "yearsSelectionTo",
            binding.yearsList2,
            MyItemKeyProvider(searchAdapter2),
            MyItemDetailsLookup(binding.yearsList2),
            StorageStrategy.createStringStorage()
        ).withSelectionPredicate(
            LocalSelectionPredicate2(requireContext(),searchAdapter2, viewModel)
        ).build()
        searchAdapter2.tracker = tracker2

        binding.yearsList.setOnScrollChangeListener { v, i, i2, i3, i4 ->
            val firstPos = gridLayoutManager.findFirstVisibleItemPosition()
            val lastPos = gridLayoutManager.findLastCompletelyVisibleItemPosition()
            val str = StringBuilder().append(viewModel.years[firstPos]).append(" - ").append(viewModel.years[lastPos])
            binding.tvTitle.text = str
        }
        binding.yearsList2.setOnScrollChangeListener { v, i, i2, i3, i4 ->
            val firstPos = gridLayoutManager2.findFirstVisibleItemPosition()
            val lastPos = gridLayoutManager2.findLastCompletelyVisibleItemPosition()
            val str = StringBuilder().append(viewModel.years[firstPos]).append(" - ").append(viewModel.years[lastPos])
            binding.tvTitle2.text = str
        }
        binding.imageL1.setOnClickListener {
            var firstPos = gridLayoutManager.findFirstVisibleItemPosition()
            firstPos -= 16
            if (firstPos < 0) {
                firstPos = 0
            }
            gridLayoutManager.scrollToPosition(firstPos)
        }
        binding.imageR1.setOnClickListener {
            var localLastPos = gridLayoutManager.findLastCompletelyVisibleItemPosition()
            localLastPos += 16
            if (localLastPos > viewModel.years.size) {
                localLastPos = viewModel.years.size-4
            }
            gridLayoutManager.scrollToPosition(localLastPos)
        }
        binding.imageL2.setOnClickListener {
            var firstPos = gridLayoutManager2.findFirstVisibleItemPosition()
            firstPos -= 16
            if (firstPos < 0) {
                firstPos = 0
            }
            gridLayoutManager2.scrollToPosition(firstPos)
        }
        binding.imageR2.setOnClickListener {
            var localLastPos = gridLayoutManager2.findLastCompletelyVisibleItemPosition()
            localLastPos += 16
            if (localLastPos > viewModel.years.size) {
                localLastPos = viewModel.years.size-4
            }
            gridLayoutManager2.scrollToPosition(localLastPos)
        }
        tracker.addObserver(
            object : SelectionTracker.SelectionObserver<String>() {
                override fun onSelectionChanged() {
                    super.onSelectionChanged()
                    val item: String? = tracker.selection.firstOrNull()
                    if (item != null) viewModel.saveStringPreference(item, 2)
                }
            })

        tracker2.addObserver(
            object : SelectionTracker.SelectionObserver<String>() {
                override fun onSelectionChanged() {
                    super.onSelectionChanged()
                    val item: String? = tracker2.selection.firstOrNull()
                    if (item != null) viewModel.saveStringPreference(item, 3)
                }
            })

        binding.button.setOnClickListener {
        findNavController().navigate(R.id.action_years_to_settings)
    }
    }

    override fun onStart() {
        super.onStart()
        searchAdapter.setData(viewModel.years)
        binding.tvTitle.text = "1955 - 1966"
        searchAdapter2.setData(viewModel.years)
        binding.tvTitle2.text = "1955 - 1966"
    }

    fun onClick(item: String, position: Int) {
        val str = StringBuilder().append("Искать в период с ").append(item).append(" года")
        binding.tvHeader.text = str
    }
    fun onClick2(item: String, position: Int) {
        val str = StringBuilder().append("Искать в период до ").append(item).append(" года")
        binding.tvHeader2.text = str
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}