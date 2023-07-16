package com.example.kinopoiskup.presentation


import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.paging.LoadState
import com.example.kinopoiskup.R
import com.example.kinopoiskup.R.drawable
import com.example.kinopoiskup.databinding.FragmentSearchBinding
import com.example.kinopoiskup.entity.QueryItem
import com.example.kinopoiskup.listadapter.PagedListNetworkAdapterHorizontal
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.*
import java.util.*


@AndroidEntryPoint
class SearchFragment : Fragment() {

    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!

    private val viewModel: MainViewModel by activityViewModels()

    val pattern = Regex("[^-a-zA-Z \\u0410-\\u044f\\u0401\\u0451]")

    private var adapterCount = -1

    private var queryParams: MutableMap<String, String> = mutableMapOf()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSearchBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as AppCompatActivity).supportActionBar?.hide()

        val pagedAdapter =
            PagedListNetworkAdapterHorizontal { a, b, c -> onClick(a, b, c) }
        binding.tvText.visibility = View.GONE

        viewLifecycleOwner.lifecycleScope
            .launchWhenStarted {
                viewModel.isLoading.collect { state ->
                    if (state) {
                        binding.progress.visibility = View.VISIBLE
                    } else {
                        binding.progress.visibility = View.GONE
                    }
                }
            }

        binding.podsList.adapter = pagedAdapter

        pagedAdapter.loadStateFlow.onEach {

            if (it.refresh is LoadState.NotLoading) {
                binding.progress.visibility = View.GONE
                adapterCount = pagedAdapter.itemCount
                if (adapterCount > 0) {
                    binding.tvText.visibility = View.GONE
                    binding.podsList.visibility = View.VISIBLE
                }
                else {
                    binding.tvText.visibility = View.VISIBLE
                    binding.podsList.visibility = View.GONE
                }
            }
        }.launchIn(viewLifecycleOwner.lifecycleScope)


        binding.editText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                val result = pattern.containsMatchIn(s)
                if (result == true) {
                    val char = s.get(s.lastIndex)
                    binding.editText.error = "$char not valid character!"
                }
            }
        })


        binding.editText.setOnEditorActionListener { v, actionId, event ->
            return@setOnEditorActionListener false
        }

        binding.layout.setEndIconDrawable(drawable.ic_baseline_tune_24)
        binding.layout.setEndIconActivated(true)
        binding.layout.setEndIconOnClickListener {
            findNavController().navigate(R.id.action_nav_search_to_navigation_graphsettings)
        }

        binding.layout.setStartIconOnClickListener {
            if (binding.editText.text!!.length < 2) {
                Toast.makeText(
                    requireContext(),
                    "Напечатайте что нибудь",
                    Toast.LENGTH_LONG
                ).show()
            }

        }



        binding.editText.textChanges()
            .filter {
                it.toString().toRegex().matches(it!!)
            }
            .filterNot {
                it.isNullOrBlank()
                pattern.containsMatchIn(it.toString())
            }
            .debounce(300)
            .onEach {

                val bundleItem = QueryItem()
                bundleItem.query = 5
                queryParams["keyword"] = it.toString()
                queryParams["countries"] = ""
                if (viewModel.countrySelected != null) {
                    queryParams["countries"] = viewModel.countrySelected.toString()
                }
                queryParams["genres"] = ""
                if (viewModel.genreSelected != null) {
                    queryParams["genres"] = viewModel.genreSelected.toString()
                }
                queryParams["yearFrom"] = ""
                if (viewModel.yearFirst != null) {
                    queryParams["yearFrom"] = viewModel.yearFirst.toString()
                }
                queryParams["yearTo"] = ""
                if (viewModel.yearLast != null) {
                    queryParams["yearTo"] = viewModel.yearLast.toString()
                }
                queryParams["ratingFrom"] = ""
                if (viewModel.rangeFrom != null) {
                    queryParams["ratingFrom"] = viewModel.rangeFrom.toString()
                }
                queryParams["ratingTo"] = ""
                if (viewModel.rangeTo != null) {
                    queryParams["ratingTo"] = viewModel.rangeTo.toString()
                }
                queryParams["type"] = ""
                if (viewModel.typeSelector != null) {
                    if (viewModel.typeSelector != 0) {
                        queryParams["type"] = viewModel.filmType[viewModel.typeSelector!!]
                    }
                }
                queryParams["order"] = ""
                if (viewModel.orderSelector != null) {
                    if (viewModel.orderSelector != 0) {
                        queryParams["order"] = viewModel.sortOrder[viewModel.orderSelector!!]
                    }
                }

                bundleItem.param3 = queryParams
                pagedAdapter.loadStateFlow.onEach {
                    if (it.refresh is LoadState.Error) {
                        binding.progress.visibility = View.GONE
                        if (viewModel.isNetworkErrorShow == true) {
                            val dialog = ErrorDialog()
                            dialog.show(childFragmentManager, "showErrorDialog")
                            viewModel.isNetworkErrorShow = false
                        }
                    }
                    if (it.refresh is LoadState.Loading) {
                        binding.progress.visibility = View.VISIBLE
                    }
                }.launchIn(viewLifecycleOwner.lifecycleScope)


                viewModel.pagedNetworkFlow(bundleItem).onEach { pagingData ->
                    pagedAdapter.submitData(pagingData)
                }.launchIn(viewLifecycleOwner.lifecycleScope)

            }
            .launchIn(lifecycleScope)
    }


    fun EditText.textChanges(): Flow<CharSequence?> {
        return callbackFlow {

            val listener = doOnTextChanged { text, _, _, _ ->
                if (text!=null && text.length > 1) trySend(text)
            }
            awaitClose { removeTextChangedListener(listener) }
        }
    }


    fun onClick(item: Int, position: Int, type: Int) {
        if (viewModel.movieId != item)  viewModel.isForward = true
        viewModel.movieId = item
        viewModel.moviePosition = position
        findNavController().navigate(R.id.action_nav_search_to_full)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding.podsList.adapter = null
        _binding = null

    }

}