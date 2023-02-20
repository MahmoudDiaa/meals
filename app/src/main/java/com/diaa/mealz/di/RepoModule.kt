package com.diaa.mealz.di

import com.diaa.data.remote.ApiService
import com.diaa.data.repo.MealsRepoImpl
import com.diaa.domain.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class )
object RepoModule {

    @Provides
    fun provideRepo(apiService: ApiService):MealsRepo= MealsRepoImpl(apiService )
}