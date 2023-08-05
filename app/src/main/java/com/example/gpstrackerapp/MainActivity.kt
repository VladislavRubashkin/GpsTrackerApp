package com.example.gpstrackerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gpstrackerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    // TODO#1 - branches: architecture -> mainMenu -> navigationComponent -> и тд
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}