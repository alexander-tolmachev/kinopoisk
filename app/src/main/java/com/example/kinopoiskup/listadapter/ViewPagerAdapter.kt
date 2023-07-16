package com.example.kinopoiskup.listadapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.kinopoiskup.entity.ListItem
import com.example.kinopoiskup.entity.SeasonItems
import com.example.kinopoiskup.presentation.FragmentSlide

class ViewPagerAdapter(Fa: Fragment, list: List<SeasonItems>) : FragmentStateAdapter(Fa) {


    val itemsList = list
    val pageNumber = itemsList.size

    override fun getItemCount(): Int = pageNumber


    override fun createFragment(position: Int): Fragment {
        val item = ListItem("test",position,itemsList)
        return FragmentSlide.newInstance(item)
    }
}