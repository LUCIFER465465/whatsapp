package com.example.whatsapp

import android.os.Parcel
import android.os.Parcelable
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import java.lang.reflect.Array

class FragPageAdapter(fm: FragmentManager,fragments:Array<Fragment>,item: Array<String>) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        TODO("Not yet implemented")
    }

    override fun getItem(position: Int): Fragment {
        TODO("Not yet implemented")
    }

}

