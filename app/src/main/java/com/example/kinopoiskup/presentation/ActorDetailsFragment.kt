package com.example.kinopoiskup.presentation


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.kinopoiskup.R
import com.example.kinopoiskup.databinding.FragmentActorDetailsBinding
import com.example.kinopoiskup.entity.FilmEntity
import com.example.kinopoiskup.entity.RecyclerItem
import com.example.kinopoiskup.entity.StaffDTO
import com.example.kinopoiskup.listadapter.MovieFragmentAdapter
import dagger.hilt.android.AndroidEntryPoint



@AndroidEntryPoint
class ActorDetailsFragment : Fragment() {

    private var actorLogo: String? = null
    private var actorName: String? = null

    private var _binding: FragmentActorDetailsBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewModel by activityViewModels()

    private val movieAdapter = MovieFragmentAdapter ({ a -> onClickContinue(a) },{ a, b, c, d -> onClick(a, b, c, d) })


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentActorDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.bestFilms.adapter = movieAdapter

        if (viewModel.isStaffForward == true) {
            viewModel.staffInfoShow.value = null // clear previous poster
            viewModel.showGalleryStaff.value = null // clear previous data
        }
        viewModel.isStaffForward = false

        viewModel.staffInfoShow.observe(viewLifecycleOwner) { item ->
            if (item != null) {
                actorLogo = item.posterUrl
                if (item.nameRu != null)
                    actorName = item.nameRu
                else if (item.nameEn != null)
                    actorName = item.nameEn
                showActorInfo(item)
            }
        }


        binding.sbutton.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("actor_name", actorName)
          findNavController().navigate(R.id.navigation_tab_fragment, bundle)
        }

        binding.logo.setOnClickListener {
            showPhoto(actorLogo)
        }

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
    }

    fun showPhoto(photoUri: String?) {
        val myIntent = Intent(requireActivity(), FullscreenActivity::class.java)
        myIntent.putExtra("key", photoUri)
        startActivity(myIntent)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding.bestFilms.adapter = null
        _binding = null

    }


    fun onClick(item: Int, position: Int, type: Int, params: RecyclerItem?) {
        if (viewModel.movieId != item)  viewModel.isForward = true
        viewModel.movieId = item
        viewModel.moviePosition = position
        findNavController().navigate(R.id.nav_staffinfo_to_full)
    }

    fun onClickContinue(params: RecyclerItem?) {
    }

    override fun onStart() {
        super.onStart()
        subscribeUi()
        viewModel.loadStaffInfoById()
    }


    private fun subscribeUi() {
        viewModel.showGalleryStaff.observe(viewLifecycleOwner) { item ->
            item?.let { movieAdapter.setData(it) }
        }
    }


    fun showActorInfo(item: StaffDTO) {
        item.let {
            Glide
                .with(binding.logo.context)
                .load(item.posterUrl)
                .into(binding.logo)
        }

        if (item.nameRu != null)
            binding.namerus.text = item.nameRu
        if (item.nameEn != null)
            binding.nameorig.text = item.nameEn
        if (item.profession != null) {
            binding.profession.text = item.profession
        }
        binding.sinfo.text = resources.getQuantityString(
            R.plurals.films, viewModel.actorFilms, viewModel.actorFilms)

        val filmEntity = FilmEntity()
        filmEntity.kinopoiskId = item.personId
        filmEntity.category = 0 // 1 - film, 0 - actor
        filmEntity.bitmask = 0
        filmEntity.timestamp = System.currentTimeMillis()
        filmEntity.genre = item.profession
        if (item.nameRu != null)
            filmEntity.name = item.nameRu
        else filmEntity.name = item.nameEn
        filmEntity.rating = null
        filmEntity.poster = item.posterUrl
        viewModel.addMovieDatabase(filmEntity)
    }

}