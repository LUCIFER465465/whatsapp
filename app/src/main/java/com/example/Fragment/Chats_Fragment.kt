package com.example.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.whatsapp.R
import com.example.whatsapp.R.drawable.City1
import com.example.whatsapp.R.drawable.City2
import com.example.whatsapp.R.drawable.City3
import com.example.whatsapp.R.drawable.City4
import com.example.whatsapp.R.drawable.City5
import com.example.whatsapp.R.drawable.City6
import com.example.whatsapp.R.drawable.City7
import com.example.whatsapp.R.drawable.City8

class Chats_Fragment : Fragment() {

    var  image = arrayOf(City1,City2,City3,City4,City5,City6,City7,City8)
    var name = arrayOf( d)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_chats_, container, false)
    }

}