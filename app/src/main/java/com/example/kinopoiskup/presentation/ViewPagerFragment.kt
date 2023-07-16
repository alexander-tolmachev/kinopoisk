package com.example.kinopoiskup.presentation


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.viewpager2.widget.ViewPager2
import com.example.kinopoiskup.R
import com.example.kinopoiskup.databinding.FragmentViewPagerBinding
import com.example.kinopoiskup.listadapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint

const val ARG_ITEM_TITLE = "item_title"

@AndroidEntryPoint
class ViewPagerFragment : Fragment() {

    private var title: String? = null

    private var _binding: FragmentViewPagerBinding? = null
    private val binding get() = _binding!!

    private var viewPager: ViewPager2? = null
    private val viewModel: MainViewModel by activityViewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            title = it.getString(ARG_ITEM_TITLE)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentViewPagerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as AppCompatActivity).supportActionBar?.title = title

        viewPager = binding.myPager2
        viewPager!!.adapter = createCardAdapter()

        val tabLayout = binding.tabs

        TabLayoutMediator(
            tabLayout, viewPager!!
        ) { tab, position ->
            val v: View =
                LayoutInflater.from(requireContext()).inflate(R.layout.item_tab_viewpager, null, false)
            val tv = v.findViewById<TextView>(R.id.textView_tabTitle)
            tv.text = getString(R.string.tab_text, position+1)
            val frameLayout = FrameLayout(requireContext())
            frameLayout.addView(v)
            tab.customView = v
        }.attach()

    }

    private fun createCardAdapter(): ViewPagerAdapter {
        return ViewPagerAdapter(this, viewModel.showSerial)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }



    companion object {

        @JvmStatic
        fun newInstance(itemTitle: String): ViewPagerFragment =
            ViewPagerFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_ITEM_TITLE, itemTitle)
                }
            }
    }
}