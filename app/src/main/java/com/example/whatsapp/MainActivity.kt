package com.example.whatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.whatsapp.databinding.ActivityMainBinding

lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Tablay.addTab(binding.Tablay.newTab().setText("Chats"))
        binding.Tablay.addTab(binding.Tablay.newTab().setText("Status"))
        binding.Tablay.addTab(binding.Tablay.newTab().setText("Calls"))
    }
}