package com.example.kinopoiskup.presentation

import android.app.AlertDialog
import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import com.bumptech.glide.Glide
import com.example.kinopoiskup.data.MainPagingSource
import com.example.kinopoiskup.databinding.BottomSheetModalBinding
import com.example.kinopoiskup.entity.CollectionEntity
import com.example.kinopoiskup.listadapter.MainAdapter
import com.example.kinopoiskup.listadapter.MainLoadStateAdapter
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

class BottomSheetFragment : BottomSheetDialogFragment() {

    private var _binding: BottomSheetModalBinding? = null
    private val binding get() = _binding!!
    private val collection = CollectionEntity()

    private val viewModel: MainViewModel by activityViewModels()

    private var displayJob: Job? = null
    private lateinit var adapter: MainAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        childFragmentManager.setFragmentResultListener("requestKey", this) { key, bundle ->
            val result = bundle.getString("bundleKey")
            if (result != null) {
                collection.name = result
                var cnt = 0
                var position = -1
                viewModel.table.forEach {

                    if (it == null && position == -1) position = cnt - 1
                    else cnt = it!!
                }
                if (position == -1) position = cnt - 1
                if (position != -1) {
                    viewModel.table.add(position)
                    collection.idx = position
                    collection.count = 0
                    viewModel.addCollection(collection)
                    adapter.refresh()
                } else {
                    Toast.makeText(
                        requireContext(),
                        "Достигнут лимит 60 коллекций!",
                        Toast.LENGTH_LONG
                    ).show()

                }
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = BottomSheetModalBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = MainAdapter(
            { a, b, c -> onClick(a, b, c) },
            viewModel.filmInfo.bitmask
        ) // (viewModel) TODO
        setUpView()

        binding.collectionList.adapter = adapter.withLoadStateFooter(
            MainLoadStateAdapter()
        )


        binding.button.setOnClickListener {
            val dialog = SaveCollectionDialog()
            dialog.show(childFragmentManager, "SaveCollectionDialog")
        }

        subscribeCollectionList()
    }

    private fun subscribeCollectionList() {
        displayJob?.cancel()
        displayJob = viewLifecycleOwner.lifecycleScope.launch {
            viewModel.pagedCollectionFlow().collectLatest { pagingData ->
                adapter.submitData(pagingData)
            }
        }
    }


    fun onClick(item: CollectionEntity, target: Long, mask: Long?) {
        var bitmask = mask //0L
        if (viewModel.filmInfo.bitmask != null) {
            bitmask = viewModel.filmInfo.bitmask!! or target
        } else {
            bitmask = target
        }
        viewModel.filmInfo.bitmask = bitmask
        viewModel.updateFilmBitmask(viewModel.filmInfo.kinopoiskId!!, viewModel.filmInfo.bitmask!!)
        viewModel.updateCollection(item.name, item.count)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun setUpView() {
        val item = viewModel.filmInfo
        item.let {
            Glide
                .with(binding.poster.context)
                .load(it.posterUrlPreview)
                .into(binding.poster)
        }

        if (item.ratingKinopoisk != null) binding.badge.text = item.ratingKinopoisk.toString()
        else binding.badge.text = item.ratingImdb.toString()
        binding.badge.bringToFront()
        if (item.bitmask != null) {
            if (item.bitmask!! and 0x4000000000000000 > 0) binding.badge.background.setTint(Color.RED)
            else binding.badge.background.setTint(Color.YELLOW)
        }

        binding.line1.text = ""
        if (item.nameRu != null)
            binding.line1.text = item.nameRu
        else if (item.nameOriginal != null)
            binding.line1.text = item.nameOriginal
        else if (item.nameEn != null)
            binding.line1.text = item.nameEn

        binding.line2.text = ""
        if (item.year != null) binding.line2.text = item.year.toString()

        binding.line2.text = StringBuilder().append(item.year.toString())
            .append(", ")
            .append(item.genres.joinToString(", ") { it.genre.toString() })

    }


}