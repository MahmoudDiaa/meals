package com.diaa.domain.usecase

import com.diaa.domain.repo.MealsRepo

class GetMeals(private val mealsRepo:MealsRepo) {

    suspend operator fun  invoke() = mealsRepo.getMealsFromRemote()

    fun s(w:Array<Int>){
        w.fo

    }
}