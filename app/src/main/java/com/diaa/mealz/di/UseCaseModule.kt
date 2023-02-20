package com.diaa.mealz.di

import com.diaa.domain.repo.MealsRepo
import com.diaa.domain.usecase.GetMeals
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    fun provideUseCase(mealsRepo: MealsRepo): GetMeals = GetMeals(mealsRepo)
}