package com.example.kinopoiskup.presentation

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.selection.SelectionPredicates
import androidx.recyclerview.selection.SelectionTracker
import androidx.recyclerview.selection.StorageStrategy
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.kinopoiskup.R
import com.example.kinopoiskup.databinding.FragmentSettingsGenresBinding
import com.example.kinopoiskup.listadapter.MyItemDetailsLookup
import com.example.kinopoiskup.listadapter.MyItemKeyProvider
import com.example.kinopoiskup.listadapter.SimpleAdapter


class SettingsFragmentGenres : Fragment() {

    private lateinit var searchAdapter: SimpleAdapter
    private val viewModel: MainViewModel by activityViewModels()
    val pattern = Regex("[^-a-zA-Z \\u0410-\\u044f\\u0401\\u0451]")

    private var _binding: FragmentSettingsGenresBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSettingsGenresBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        searchAdapter = SimpleAdapter { a, b -> onClick(a, b) }
        binding.genresList.adapter = searchAdapter

        binding.genresList.addItemDecoration(
            DividerItemDecoration(
                requireContext(),
                DividerItemDecoration.VERTICAL
            )
        )

        val tracker = SelectionTracker.Builder(
            "genresSelection",
            binding.genresList,
            MyItemKeyProvider(searchAdapter),
            MyItemDetailsLookup(binding.genresList),
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
                    if (item != null) viewModel.saveStringPreference(item, 1)
                }
            })


        viewLifecycleOwner.lifecycleScope.launchWhenStarted {
            viewModel.ready.collect { _ ->
                findNavController().navigate(R.id.action_genres_to_settings)
            }
        }

        binding.searchGenres.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int) {}

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                val result = pattern.containsMatchIn(s)
                if (result == true) {
                    val char = s.get(s.lastIndex)
                    binding.searchGenres.error = "$char not valid character!"
                } else {
                    val question = binding.searchGenres.text.toString()
                    val data: List<String> = viewModel.genres.filter { it.genre!!.indexOf(question, ignoreCase = true) == 0 }.map { it.genre!! }.sorted()

                    searchAdapter.setData(data)
                }
            }
        })


    }

    override fun onStart() {
        super.onStart()
         searchAdapter.setData(viewModel.genres.map { it.genre!! }.sorted())
    }

    fun onClick(item: String, position: Int) {
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}