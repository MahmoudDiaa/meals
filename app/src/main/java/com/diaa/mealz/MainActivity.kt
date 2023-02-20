package com.diaa.mealz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.diaa.mealz.databinding.ActivityMainBinding
import com.diaa.mealz.databinding.CategoryItemBinding
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val viewModel: MealsViewModel by viewModels()
    private val binding by lazy {

        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        viewModel.getMeals()

        val adapter = MealsAdapter()
        lifecycleScope.launchWhenCreated {

            viewModel.categories.collect {

                adapter.submitList(it?.categories)
                binding.categoryRv.adapter = adapter

            }
        }
    }
}