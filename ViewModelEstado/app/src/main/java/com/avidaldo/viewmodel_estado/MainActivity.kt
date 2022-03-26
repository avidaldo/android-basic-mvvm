package com.avidaldo.viewmodel_estado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.avidaldo.viewmodel_estado.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

}