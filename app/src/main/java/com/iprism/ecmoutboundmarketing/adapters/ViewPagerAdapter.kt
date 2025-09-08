package com.iprism.ecmoutboundmarketing.adapters

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

import com.iprism.ecmoutboundmarketing.fragments.AddUsersFragment
import com.iprism.ecmoutboundmarketing.fragments.HomeFragment
import com.iprism.ecmoutboundmarketing.fragments.ProfileFragment

class ViewPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment()
            1 -> AddUsersFragment()
            2 -> ProfileFragment()
            else -> HomeFragment()
        }
    }

}