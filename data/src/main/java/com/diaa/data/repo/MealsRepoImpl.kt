package com.diaa.data.repo

import com.diaa.data.remote.ApiService
import com.diaa.domain.entity.CategoryResponse
import com.diaa.domain.repo.MealsRepo

class MealsRepoImpl(private val apiService: ApiService) : MealsRepo {
    override fun getMealsFromRemote(): CategoryResponse = apiService.getMeals()
}