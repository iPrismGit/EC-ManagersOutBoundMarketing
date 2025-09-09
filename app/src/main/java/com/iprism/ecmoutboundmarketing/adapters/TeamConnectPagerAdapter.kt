package com.iprism.ecmoutboundmarketing.adapters

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.iprism.ecmoutboundmarketing.fragments.InBoundTeamFragment
import com.iprism.ecmoutboundmarketing.fragments.MarketingTeamFragment


class TeamConnectPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity)  {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> MarketingTeamFragment()
            1 -> InBoundTeamFragment()
            else -> MarketingTeamFragment()
        }
    }
}