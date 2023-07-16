package com.example.kinopoiskup.presentation


import android.animation.ObjectAnimator
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.text.InputFilter
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.activity.OnBackPressedCallback
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.toBitmap
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import coil.ImageLoader
import coil.request.ImageRequest
import com.example.kinopoiskup.R
import com.example.kinopoiskup.databinding.FragmentMovieDetailsBinding
import com.example.kinopoiskup.entity.FilmEntity
import com.example.kinopoiskup.entity.FilmInfoDTO
import com.example.kinopoiskup.entity.QueryItem
import com.example.kinopoiskup.entity.RecyclerItem
import com.example.kinopoiskup.listadapter.MovieFragmentAdapterFull
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest


@AndroidEntryPoint
class MovieDetailsFragment : Fragment() {

    private var _binding: FragmentMovieDetailsBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewModel by activityViewModels()

    private var isExpanded = false
    private lateinit var movieAdapter: MovieFragmentAdapterFull

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMovieDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.progress.visibility = View.VISIBLE

        movieAdapter = MovieFragmentAdapterFull(
            { -> onClickCollection() },
            { a -> onClickContinue(a) },
            { a, b, c, d -> onClick(a, b, c, d) })
        binding.resultsList.adapter = movieAdapter

        if (viewModel.isForward == true) {
            viewModel.showFilmInfo.value = null // clear previous poster
            viewModel.showGalleryFull.value = null // clear previous data
        }
        viewModel.isForward=false

        viewModel.showFilmInfo.observe(viewLifecycleOwner) { item ->
            if (item != null) showFilmInfo(item)
        }


        binding.sbutton.setOnClickListener {
            var name: String? = null
            if (viewModel.filmInfo.nameRu != null) name = viewModel.filmInfo.nameRu
            else if (viewModel.filmInfo.nameEn != null) name = viewModel.filmInfo.nameEn
            else if (viewModel.filmInfo.nameOriginal != null) name = viewModel.filmInfo.nameOriginal
            val bundle = Bundle()
            bundle.putString("item_title", name)
            findNavController().navigate(R.id.navigation_viewpager, bundle)
        }

        binding.posterClick.setOnClickListener {
            showPhoto(viewModel.filmInfo.posterUrl)
        }

        binding.button1.setOnClickListener {
            var bitmask = 0L // isViewed
            if (viewModel.filmInfo.bitmask == null) {
                viewModel.filmInfo.bitmask = 0L
            }

            if (viewModel.filmInfo.bitmask!! and 0x2000000000000000 == 0L) { // was not viewed get viewed
                bitmask = viewModel.filmInfo.bitmask!! or 0x2000000000000000
                binding.button1.setImageDrawable(
                    ContextCompat.getDrawable(
                        requireContext(),
                        R.drawable.ic_baseline_favorite_border_24_blue
                    )
                )
            } else {
                bitmask = viewModel.filmInfo.bitmask!! and 0x5fffffffffffffff
                binding.button1.setImageDrawable(
                    ContextCompat.getDrawable(
                        requireContext(),
                        R.drawable.ic_baseline_favorite_border_24
                    )
                )
            }
            viewModel.filmInfo.bitmask = bitmask
            viewModel.updateFilmBitmask(
                viewModel.filmInfo.kinopoiskId!!,
                viewModel.filmInfo.bitmask!!
            )
            if (viewModel.filmInfo.bitmask!! and 0x2000000000000000 == 0L) viewModel.updateCollectionCount(
                "Любимые",
                -1
            )
            else viewModel.updateCollectionCount("Любимые", 1)
        }

        binding.button2.setOnClickListener {
            var bitmask = 0L // isViewed
            if (viewModel.filmInfo.bitmask == null) {
                viewModel.filmInfo.bitmask = 0L
            }

            if (viewModel.filmInfo.bitmask!! and 0x1000000000000000 == 0L) { // was not viewed get viewed
                bitmask = viewModel.filmInfo.bitmask!! or 0x1000000000000000
                binding.button2.setImageDrawable(
                    ContextCompat.getDrawable(
                        requireContext(),
                        R.drawable.ic_baseline_bookmark_border_24_blue
                    )
                )
            } else {
                bitmask = viewModel.filmInfo.bitmask!! and 0x6fffffffffffffff
                binding.button2.setImageDrawable(
                    ContextCompat.getDrawable(
                        requireContext(),
                        R.drawable.ic_baseline_bookmark_border_24
                    )
                )
            }
            viewModel.filmInfo.bitmask = bitmask
            viewModel.updateFilmBitmask(
                viewModel.filmInfo.kinopoiskId!!,
                viewModel.filmInfo.bitmask!!
            )
            if (viewModel.filmInfo.bitmask!! and 0x1000000000000000 == 0L) viewModel.updateCollectionCount(
                "Хочу посмотреть",
                -1
            )
            else viewModel.updateCollectionCount("Хочу посмотреть", 1)
        }

        binding.button3.setOnClickListener {
            var bitmask = 0L // isViewed
            if (viewModel.filmInfo.bitmask == null) {
                viewModel.filmInfo.bitmask = 0L
            }

            if (viewModel.filmInfo.bitmask!! and 0x4000000000000000 == 0L) { // was not viewed get viewed
                bitmask = viewModel.filmInfo.bitmask!! or 0x4000000000000000
                binding.button3.setImageDrawable(
                    ContextCompat.getDrawable(
                        requireContext(),
                        R.drawable.ic_baseline_visibility_off_24_blue
                    )
                )

            } else {
                bitmask = viewModel.filmInfo.bitmask!! and 0x3fffffffffffffff
                binding.button3.setImageDrawable(
                    ContextCompat.getDrawable(
                        requireContext(),
                        R.drawable.ic_baseline_visibility_off_24
                    )
                )
            }

            viewModel.filmInfo.bitmask = bitmask
            viewModel.updateFilmBitmask(
                viewModel.filmInfo.kinopoiskId!!,
                viewModel.filmInfo.bitmask!!
            )

        }
        binding.button4.setOnClickListener {
            val uri = "https://www.kinopoisk.ru/film/" + viewModel.filmInfo.kinopoiskId.toString()
            val share = Intent(Intent.ACTION_SEND)
            share.type = "text/plain"
            share.putExtra(Intent.EXTRA_TEXT, uri)
            startActivity(Intent.createChooser(share, "Поделиться фильмом"))
        }

        binding.button5.setOnClickListener {

            val modalbottomSheetFragment = BottomSheetFragment()
            modalbottomSheetFragment.show(
                childFragmentManager,
                "ModalBottomSheetDialog"
            )
        }

        binding.description.setOnClickListener {
            if (isExpanded == false) {
                expandTextView(binding.description)
                isExpanded = true
            } else {
                collapseTextView(binding.description, 6)
                isExpanded = false
            }

        }
    }




    fun showPhoto(photoUri: String?) {

        val myIntent = Intent(requireActivity(), FullscreenActivity::class.java)
        myIntent.putExtra("key", photoUri)
        startActivity(myIntent)
    }

    private fun expandTextView(tv: TextView) {

        val animation: ObjectAnimator = ObjectAnimator.ofInt(tv, "maxLines", tv.lineCount)
        animation.setDuration(400).start()

    }

    private fun collapseTextView(tv: TextView, numLines: Int) {
        val animation = ObjectAnimator.ofInt(tv, "maxLines", numLines)
        animation.setDuration(400).start()
    }

    fun TextView.limitLength(maxLength: Int) {
        filters = arrayOf(InputFilter.LengthFilter(maxLength))
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding.resultsList.adapter = null
        _binding = null

    }


    fun onClickCollection() {
    }

    fun onClickContinue(params: RecyclerItem?) {

        when (params?.type) {
            0 -> {   // галерея Еще
                findNavController().navigate(R.id.navigation_tab_fragment_gallery)
            }
            2, 3 -> {   // актеры Еще
                val bundle = Bundle()
                val parcelable = QueryItem()
                parcelable.query = params.type
                bundle.putParcelable("query", parcelable)
                findNavController().navigate(R.id.navigation_plainlist_horizontal_fragment, bundle)
            }
        }
    }

    fun onClick(item: Int, position: Int, type: Int, params: RecyclerItem?) {

        when (type) {
            0 -> {   // кнопка Еще
                val bundle = Bundle()
                val parcelable =
                    QueryItem(item, params?.param1, params?.param2, params?.param3, params?.list)
                bundle.putParcelable("query", parcelable)
                if (item < 5) {
                    findNavController().navigate(R.id.navigation_pagedlist, bundle)
                } else {
                    findNavController().navigate(R.id.navigation_plainlist, bundle)
                }
            }
            1, 3 -> { // was 0,1 - артисты показать детали
                if (viewModel.actorId != item)  viewModel.isStaffForward = true
                viewModel.actorId = item
                findNavController().navigate(R.id.navigation_filmstaff)
            }
            2 -> { // type == 2 - фильм показать детали
                if (viewModel.movieId != item)  viewModel.isForward = true
                viewModel.movieId = item
                viewModel.moviePosition = position
                findNavController().navigate(R.id.action_nav_filminfo_to_full)
            }
            else -> { // type == 4 - галерея
                if (params != null) {
                    showPhoto(params.title)
                }
            }
        }
    }


    override fun onStart() {
        super.onStart()
        viewModel.filmInfo = FilmInfoDTO()
        viewModel.filmInfo.bitmask = null
        viewModel.loadFilmById()
    }



    private fun subscribeUiFull() {
        viewModel.showGalleryFull.observe(viewLifecycleOwner) { item ->
            item?.let { movieAdapter.setData(it) }
        }
    }


    fun showFilmInfo(item: FilmInfoDTO) {

        binding.logo.visibility = View.VISIBLE
        if (item.kinopoiskId != null) {

            if (viewModel.filmInfo.bitmask != null) {
                if (viewModel.filmInfo.bitmask!! and 0x4000000000000000 > 0L) binding.button3.setImageDrawable(
                    ContextCompat.getDrawable(
                        requireContext(),
                        R.drawable.ic_baseline_visibility_off_24_blue
                    )
                )
                else binding.button3.setImageDrawable(
                    ContextCompat.getDrawable(
                        requireContext(),
                        R.drawable.ic_baseline_visibility_off_24
                    )
                )
                if (viewModel.filmInfo.bitmask!! and 0x1000000000000000 > 0L) binding.button2.setImageDrawable(
                    ContextCompat.getDrawable(
                        requireContext(),
                        R.drawable.ic_baseline_bookmark_border_24_blue
                    )
                )
                else binding.button2.setImageDrawable(
                    ContextCompat.getDrawable(
                        requireContext(),
                        R.drawable.ic_baseline_bookmark_border_24
                    )
                )
                if (viewModel.filmInfo.bitmask!! and 0x2000000000000000 > 0L) binding.button1.setImageDrawable(
                    ContextCompat.getDrawable(
                        requireContext(),
                        R.drawable.ic_baseline_favorite_border_24_blue
                    )
                )
                else binding.button1.setImageDrawable(
                    ContextCompat.getDrawable(
                        requireContext(),
                        R.drawable.ic_baseline_favorite_border_24
                    )
                )
            }

            val imageRequest = ImageRequest.Builder(binding.poster.context)
                .data(item.posterUrlPreview)
                .placeholder(R.drawable.robot)
                .target { drawable ->
                    val bitmap = drawable.toBitmap() // This is the bitmap 🚨
                    val bitmapResize = bitmap.copy(Bitmap.Config.ARGB_8888, true)
                    val bitmapImage = GraphicsUtils.getResizedBitmap(bitmapResize)
                    binding.poster.setImageBitmap(bitmapImage)
                }
                .build()
            ImageLoader(binding.poster.context).enqueue(imageRequest)

            subscribeUiFull()
            binding.progress.visibility = View.GONE


            binding.line1.text = ""
            if (item.nameRu != null)
                binding.line1.text = item.nameRu
            else if (item.nameOriginal != null)
                binding.line1.text = item.nameOriginal
            else if (item.nameEn != null)
                binding.line1.text = item.nameEn


            val filmEntity = FilmEntity()
            filmEntity.kinopoiskId = item.kinopoiskId
            filmEntity.category = 1 // 1 - film, 0 - actor
            if (item.bitmask == null) filmEntity.bitmask = 0
            else filmEntity.bitmask = item.bitmask
            filmEntity.timestamp = System.currentTimeMillis()
            filmEntity.genre = item.genres.joinToString(", ") { it.genre.toString() }
            filmEntity.name = binding.line1.text.toString()

            var rating: Double? = null
            if (item.ratingKinopoisk != null) rating = item.ratingKinopoisk!!.toDouble()
            else if (item.ratingImdb != null) rating = item.ratingImdb
            filmEntity.rating = rating
            filmEntity.poster = item.posterUrlPreview //  file.path
            viewModel.addMovieDatabase(filmEntity)



            binding.line2.text = ""
            if (item.year != null) binding.line2.text = item.year.toString()

            binding.line2.text = StringBuilder().append(item.year.toString())
                .append(", ")
                .append(item.genres.joinToString(", ") { it.genre.toString() })

            var filmLength = ""
            if (item.serial == true) {
            }
            if (item.filmLength != null) {
                filmLength = ", " + item.filmLength.toString() + " мин"
            }
            var age = ""
            if (item.ratingAgeLimits != null) {
                age = ", " + item.ratingAgeLimits.toString().filter { it.isDigit() } + "+"
            }

            binding.line3.text =
                StringBuilder().append(item.countries.joinToString(", ") { it.country.toString() })
                    .append(filmLength)
                    .append(age)

            if (item.shortDescription != null) binding.shortdescription.text = item.shortDescription
            else binding.shortdescription.visibility = View.GONE
            binding.description.text = item.description

            val seasons: Int
            var series = 0
            if (item.serial == true) {

                binding.sheader.visibility = View.VISIBLE
                binding.sbutton.visibility = View.VISIBLE
                binding.sinfo.visibility = View.VISIBLE
                viewModel.showSerial.forEach {
                    series += it.episodes.size
                }
                seasons = viewModel.showSerial.size

                if (seasons > 0) {
                    binding.sinfo.text =
                        StringBuilder().append(
                            resources.getQuantityString(
                                R.plurals.seasones, seasons, seasons
                            )
                        )
                            .append(", ")
                            .append(
                                resources.getQuantityString(
                                    R.plurals.series, series, series
                                )
                            )
                } else if (series > 0) {
                    binding.sinfo.text = resources.getQuantityString(
                        R.plurals.series, series, series
                    )
                }
                if (seasons == 0 && series == 0) {
                    binding.sheader.visibility = View.GONE
                    binding.sbutton.visibility = View.GONE
                    binding.sinfo.visibility = View.GONE
                }
            }
        }
    }

}