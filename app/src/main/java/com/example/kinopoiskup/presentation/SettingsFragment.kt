package com.example.kinopoiskup.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.kinopoiskup.R
import com.example.kinopoiskup.databinding.FragmentSettingsBinding
import com.google.android.material.slider.RangeSlider
import dagger.hilt.android.AndroidEntryPoint
import java.math.RoundingMode



@AndroidEntryPoint
class SettingsFragment : Fragment() {


    private var _binding: FragmentSettingsBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSettingsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvCountry.setOnClickListener {
            findNavController().navigate(R.id.action_settings_to_countries)
        }
        binding.tvCountry.setOnLongClickListener {
            binding.tvCountry.text = "не выбрано"
            viewModel.countrySelectedString = null
            viewModel.countrySelected = null
            viewModel.saveStringPreference("", 0)
            true
        }
        binding.tvGenre.setOnClickListener {
            findNavController().navigate(R.id.action_settings_to_genres)
        }
        binding.tvGenre.setOnLongClickListener {
            binding.tvGenre.text = "не выбрано"
            viewModel.genreSelectedString = null
            viewModel.genreSelected = null
            viewModel.saveStringPreference("", 1)
            true
        }
        binding.tvYear.setOnClickListener {
            findNavController().navigate(R.id.action_settings_to_years)
        }
        binding.tvYear.setOnLongClickListener {
            binding.tvYear.text = "не выбрано"
            viewModel.yearFirst = null
            viewModel.yearLast = null
            viewModel.saveStringPreference("", 2)
            viewModel.saveStringPreference("", 3)
            true
        }

        binding.toggle.setOnCheckedChangeListener { _, isChecked ->
            viewModel.saveShowCompleted(isChecked)
        }

        viewModel.preferences.observe(viewLifecycleOwner) { flow ->

            val isChecked = flow.showCompleted
            binding.toggle.isChecked = isChecked
            viewModel.hideSeenFilms = isChecked

            val country = flow.countrySelected
            if (country.isEmpty()) {
                binding.tvCountry.text = "не выбрано"
                viewModel.countrySelectedString = null
                viewModel.countrySelected = null
            }
            else {
                binding.tvCountry.text = country
                viewModel.countrySelectedString = country
                val idx = viewModel.countries.find { it.country.equals(country) }
                if (idx != null) viewModel.countrySelected = idx.index
            }

            val genre = flow.genreSelected
            if (genre.isEmpty()) {
                binding.tvGenre.text = "не выбрано"
                viewModel.genreSelectedString = null
                viewModel.genreSelected = null
            }
            else {
                binding.tvGenre.text = genre
                viewModel.genreSelectedString = genre
                val idx = viewModel.genres.find { it.genre.equals(genre) }
                if (idx != null) viewModel.genreSelected = idx.index
            }

            val yearFrom = flow.yearFirst
            val yearTo = flow.yearLast

            val str = StringBuilder().append(yearFrom).append(" - ").append(yearTo)
            if (yearFrom != "" || yearTo != "") binding.tvYear.text = str
            else binding.tvYear.text = "не выбрано"
            if (yearFrom.isEmpty()) viewModel.yearFirst = null
            else viewModel.yearFirst = yearFrom
            if (yearTo.isEmpty()) viewModel.yearLast = null
            else viewModel.yearLast = yearTo

            val range: MutableList<Float> = mutableListOf()
            val rangeFrom = flow.rangeFrom
            val rangeTo = flow.rangeTo
            viewModel.rangeFrom = rangeFrom
            viewModel.rangeTo = rangeTo
            val string = StringBuilder().append(rangeFrom).append(" - ")
                .append(rangeTo)

            if (rangeFrom == 1 && rangeTo == 10) binding.tvRating.text = "любой"
            else binding.tvRating.text = string
            binding.seekBar.thumbRadius = 16
            range.add(rangeFrom.toFloat())
            range.add(rangeTo.toFloat())
            binding.seekBar.values = range

            val typeSelector = flow.typeSelector
            val orderSelector = flow.orderSelector
            viewModel.typeSelector = typeSelector
            viewModel.orderSelector = orderSelector
            when (typeSelector) {
                0 -> binding.buttonGroupChain.check(R.id.button_clear)
                1 -> binding.buttonGroupChain.check(R.id.button_read)
                2 -> binding.buttonGroupChain.check(R.id.button_options)
            }
            when (orderSelector) {
                0 -> binding.buttonGroupChain2.check(R.id.button_options2)
                1 -> binding.buttonGroupChain2.check(R.id.button_clear2)
                2 -> binding.buttonGroupChain2.check(R.id.button_read2)
            }

        }


        binding.buttonGroupChain.addOnButtonCheckedListener { group, _, isChecked ->
            when (group.checkedButtonId) {
                R.id.button_clear -> if (isChecked) {
                    viewModel.saveIntPreference(0, 1)
                }

                R.id.button_read -> if (isChecked) {
                    viewModel.saveIntPreference(1, 1)
                }

                R.id.button_options -> if (isChecked) {
                    viewModel.saveIntPreference(2, 1)
                }
            }
        }

        binding.buttonGroupChain2.addOnButtonCheckedListener { group, _, isChecked ->
            when (group.checkedButtonId) {
                R.id.button_clear2 -> if (isChecked) {
                    viewModel.saveIntPreference(1, 0)
                }

                R.id.button_read2 -> if (isChecked) {
                    viewModel.saveIntPreference(2, 0)
                }

                R.id.button_options2 -> if (isChecked) {
                    viewModel.saveIntPreference(0, 0)
                }
            }

        }

        binding.seekBar.setCustomThumbDrawable(R.drawable.custom_thumb)

        binding.seekBar.addOnSliderTouchListener(object : RangeSlider.OnSliderTouchListener {
            override fun onStartTrackingTouch(slider: RangeSlider) {
            }

            override fun onStopTrackingTouch(slider: RangeSlider) {
                val values = binding.seekBar.values
                val roundedFrom =
                    values[0].toBigDecimal().setScale(1, RoundingMode.HALF_UP).toDouble()
                val roundedTo =
                    values[1].toBigDecimal().setScale(1, RoundingMode.HALF_UP).toDouble()

                viewModel.saveIntPreference(roundedFrom.toInt(), 4)
                viewModel.saveIntPreference(roundedTo.toInt(), 5)
            }
        })

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}