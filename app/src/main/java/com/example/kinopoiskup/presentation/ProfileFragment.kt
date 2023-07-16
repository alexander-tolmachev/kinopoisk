package com.example.kinopoiskup.presentation


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.kinopoiskup.R
import com.example.kinopoiskup.databinding.FragmentProfileBinding
import com.example.kinopoiskup.entity.CollectionEntity
import com.example.kinopoiskup.entity.QueryItem
import com.example.kinopoiskup.entity.RecyclerItem
import com.example.kinopoiskup.listadapter.MovieFragmentAdapterFull
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class ProfileFragment : Fragment() {

    private lateinit var movieAdapter: MovieFragmentAdapterFull
    private val collection = CollectionEntity()

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewModel by activityViewModels()


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
                    viewModel.addNewCollection(collection)
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
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        movieAdapter = MovieFragmentAdapterFull({ -> onClickCollection() },
            { a -> onClickContinue(a) },
            { a, b, c, d -> onClick(a, b, c, d) })
        binding.podsList.adapter = movieAdapter
        viewLifecycleOwner.lifecycleScope.launchWhenStarted {
            viewModel.error.collect { message ->
                if (viewModel.isNetworkErrorShow == true) {
                    val dialog = ErrorDialog()
                    dialog.show(childFragmentManager, "showErrorDialog")
                    viewModel.isNetworkErrorShow = false
                }
            }
        }
    }

    private fun subscribeUi() {
        viewModel.showProfile.observe(viewLifecycleOwner) { item ->
            item.forEach { _ ->
                movieAdapter.setData(item)
            }
        }
    }

    fun onClickContinue(params: RecyclerItem?) {
        val bundle = Bundle()
        val parcelable =
            QueryItem(0, params?.param1, params?.param2, params?.param3, params?.list)
        bundle.putParcelable("query", parcelable)
        findNavController().navigate(R.id.action_nav_locations_to_navigation_plainlist, bundle)
    }

    fun onClickCollection() {
        val dialog = SaveCollectionDialog()
        dialog.show(childFragmentManager, "SaveCollectionDialog")
    }

    fun onClick(item: Int, position: Int, type: Int, params: RecyclerItem?) {
        if (type in 1..6) {
            if (position == 1) {
                if (viewModel.movieId != item)  viewModel.isForward = true
                viewModel.movieId = item
                findNavController().navigate(R.id.action_nav_locations_to_film)
            }
            else if (position == 0) {
                if (viewModel.actorId != item)  viewModel.isStaffForward = true
                viewModel.actorId = item
                findNavController().navigate(R.id.action_nav_locations_to_actor)
            }
        }
        else if (type == 9) { // удалить подборку

            if (item ==0) viewModel.deleteFilmsByCategory()
            else if (item > 0) viewModel.deleteCollection(item)
            viewModel.loadProfileData()

        } else if (type == 8) { // показать коллекцию с номером item

            viewModel.loadProfileCollection(item)
                val bundle = Bundle()
                val parcelable =
                    QueryItem()
                bundle.putParcelable("query", parcelable)
                findNavController().navigate(R.id.action_nav_locations_to_navigation_plainlist, bundle)

        } else if (type == 7) { // удалить коллекцию с номером item
            viewModel.deleteCollection(item)
        }
    }


    override fun onStart() {
        super.onStart()
        subscribeUi()
        viewModel.loadProfileData()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}