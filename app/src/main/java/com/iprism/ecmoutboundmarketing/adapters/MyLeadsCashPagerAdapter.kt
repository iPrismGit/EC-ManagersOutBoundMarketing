package com.iprism.ecmoutboundmarketing.adapters

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.iprism.ecmoutboundmarketing.fragments.MyLeadCashFragment
import com.iprism.ecmoutboundmarketing.fragments.MyLeadEmiFragment


class MyLeadsCashPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity)  {

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> MyLeadCashFragment()
            1 -> MyLeadEmiFragment()
            else -> MyLeadCashFragment()
        }
    }

}