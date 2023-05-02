package com.example.whatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.Fragment.Calls_Fragment
import com.example.Fragment.Chats_Fragment
import com.example.Fragment.Status_Fragment
import com.example.whatsapp.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    var item = arrayOf("Status","Chats","Calls")
    var fragment = arrayOf(Chats_Fragment(), Status_Fragment(), Calls_Fragment())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.vipager.adapter = FragPageAdapter(supportFragmentManager,fragment,item)
        binding.Tablay.setupWithViewPager(binding.vipager)


    }
}