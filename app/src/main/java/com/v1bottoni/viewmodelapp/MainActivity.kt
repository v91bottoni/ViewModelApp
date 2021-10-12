package com.v1bottoni.viewmodelapp

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.v1bottoni.viewmodelapp.databinding.ActivityMainBinding
import com.v1bottoni.viewmodelapp.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonPlus.setOnClickListener {
            viewModel.addScore()
        }
        binding.buttonMinus.setOnClickListener {
            viewModel.removeScore()
        }

        viewModel.score.observe(this, {
            binding.textView.text = it.toString()
        })
    }
}