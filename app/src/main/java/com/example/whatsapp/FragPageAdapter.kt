package com.example.whatsapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class FragPageAdapter(fm: FragmentManager, fragment: kotlin.Array<Fragment>, item: kotlin.Array<String>) : FragmentPagerAdapter(fm) {

    var item  = item
    var fragment = fragment
    override fun getCount(): Int {
        return fragment.size

    }

    override fun getItem(position: Int): Fragment {
        return fragment.get(position)

    }

    override fun getPageTitle(position: Int): CharSequence? {
        return item.get(position)
    }

}



