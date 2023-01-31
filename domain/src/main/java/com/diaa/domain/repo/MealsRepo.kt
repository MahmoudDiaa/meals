package com.diaa.domain.repo

import com.diaa.domain.entity.CategoryResponse

interface MealsRepo {

    fun getMealsFromRemote():CategoryResponse
}