package com.iprism.ecmoutboundmarketing.adapters

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.iprism.ecmoutboundmarketing.fragments.MyLeadCentralGovtFragment
import com.iprism.ecmoutboundmarketing.fragments.MyLeadsArogyaBhadrathaFragment
import com.iprism.ecmoutboundmarketing.fragments.MyLeadsArogyaSreeFragment
import com.iprism.ecmoutboundmarketing.fragments.MyLeadsAyushmanbavaFragment
import com.iprism.ecmoutboundmarketing.fragments.MyLeadsOthersFragment
import com.iprism.ecmoutboundmarketing.fragments.MyLeadsStateGovtFragment

class MyLeadsOthersPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return 6
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> MyLeadsStateGovtFragment()
            1 -> MyLeadCentralGovtFragment()
            2 -> MyLeadsArogyaBhadrathaFragment()
            3 -> MyLeadsArogyaSreeFragment()
            4 -> MyLeadsAyushmanbavaFragment()
            5 -> MyLeadsOthersFragment()
            else -> MyLeadsStateGovtFragment()
        }
    }
}