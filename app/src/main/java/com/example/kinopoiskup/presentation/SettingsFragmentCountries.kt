package com.example.kinopoiskup.presentation


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.selection.SelectionPredicates
import androidx.recyclerview.selection.SelectionTracker
import androidx.recyclerview.selection.StorageStrategy
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.kinopoiskup.R
import com.example.kinopoiskup.databinding.FragmentSettingsCountriesBinding
import com.example.kinopoiskup.listadapter.MyItemDetailsLookup
import com.example.kinopoiskup.listadapter.MyItemKeyProvider
import com.example.kinopoiskup.listadapter.SimpleAdapter
import kotlinx.coroutines.delay



class SettingsFragmentCountries : Fragment() {

    private lateinit var searchAdapter: SimpleAdapter
    private val viewModel: MainViewModel by activityViewModels()

    private var _binding: FragmentSettingsCountriesBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSettingsCountriesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        searchAdapter = SimpleAdapter { a, b -> onClick(a, b) }
        searchAdapter.setHasStableIds(true)
        binding.countriesList.adapter = searchAdapter

        binding.countriesList.addItemDecoration(
            DividerItemDecoration(
                requireContext(),
                DividerItemDecoration.VERTICAL
            )
        )

        val tracker = SelectionTracker.Builder(
            "countriesSelection",
            binding.countriesList,
            MyItemKeyProvider(searchAdapter),
            MyItemDetailsLookup(binding.countriesList),
            StorageStrategy.createStringStorage()
        ).withSelectionPredicate(
            SelectionPredicates.createSelectSingleAnything()
        ).build()
        searchAdapter.tracker = tracker

        tracker.addObserver(
            object : SelectionTracker.SelectionObserver<String>() {
                override fun onSelectionChanged() {
                    super.onSelectionChanged()
                    val item: String? = tracker.selection.firstOrNull()
                    viewModel.cancelDelay()
                    viewModel.runDelay()
                    if (item != null) viewModel.saveStringPreference(item, 0)
                }
            })


        viewLifecycleOwner.lifecycleScope.launchWhenStarted {
            viewModel.ready.collect { _ ->
                findNavController().navigate(R.id.action_countries_to_settings)
            }
        }
    }

    override fun onStart() {
        super.onStart()
        searchAdapter.setData(viewModel.countries.map { it.country!! }.sorted())
    }

    fun onClick(item: String, position: Int) {
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}