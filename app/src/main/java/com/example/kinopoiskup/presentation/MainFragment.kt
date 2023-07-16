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
import com.example.kinopoiskup.R
import com.example.kinopoiskup.databinding.FragmentMainBinding
import com.example.kinopoiskup.entity.QueryItem
import com.example.kinopoiskup.entity.RecyclerItem
import com.example.kinopoiskup.listadapter.MovieFragmentAdapter
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    private val viewModel: MainViewModel by activityViewModels()
    private val movieAdapter = MovieFragmentAdapter ({ a -> onClickContinue(a) }, { a, b, c, d -> onClick(a, b, c, d) })

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.itemsList.adapter = movieAdapter

        viewLifecycleOwner.lifecycleScope
            .launchWhenStarted {
                viewModel.isLoading.collect { state ->  // подписка на получение состояния из viewmodel
                    if (state) {
                        binding.progress.visibility = View.VISIBLE
                        binding.text.visibility = View.VISIBLE
                        binding.image.visibility = View.VISIBLE
                        binding.itemsList.visibility = View.GONE
                        (activity as AppCompatActivity).supportActionBar?.hide()
                    } else {
                        binding.progress.visibility = View.GONE
                        binding.text.visibility = View.GONE
                        binding.image.visibility = View.GONE
                        binding.itemsList.visibility = View.VISIBLE
                        (activity as AppCompatActivity).supportActionBar?.show()
                    }
                }
            }



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
        viewModel.showGallery.observe(viewLifecycleOwner) { item ->
                movieAdapter.setData(item)
        }
    }

    fun onClick(item: Int, position: Int, type: Int, params: RecyclerItem?) {
        if (type == 0) {
            val bundle = Bundle()
            val parcelable = QueryItem(item, params?.param1, params?.param2, params?.param3, params?.list, params!!.title)
            bundle.putParcelable("query", parcelable)
            if (item < 5) {
                findNavController().navigate(R.id.navigation_pagedlist, bundle)
            }
            else { // call not paged List adapter
                findNavController().navigate(R.id.navigation_plainlist, bundle)
            }
        }
        else if (type == 2) {
            if (viewModel.movieId != item)  viewModel.isForward = true
            viewModel.movieId = item
            viewModel.moviePosition = position
         findNavController().navigate(R.id.nav_list_to_full)

        }
    }

    fun onClickContinue(params: RecyclerItem?) {
        val bundle = Bundle()
        val parcelable = QueryItem(params?.line, params?.param1, params?.param2, params?.param3, params?.list, params!!.title)
        bundle.putParcelable("query", parcelable)
        if (params.line!! < 5) {
            findNavController().navigate(R.id.navigation_pagedlist, bundle)
        }
        else { // call not paged List adapter
            findNavController().navigate(R.id.navigation_plainlist, bundle)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding.itemsList.adapter = null
        _binding = null

    }

    override fun onStart() {
        super.onStart()
        subscribeUi()
    }


}