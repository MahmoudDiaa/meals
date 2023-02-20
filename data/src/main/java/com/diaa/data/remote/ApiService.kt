package com.diaa.data.remote

import com.diaa.domain.entity.CategoryResponse
import retrofit2.http.GET

interface ApiService {
    @GET("categories.php")
   suspend fun getMeals(): CategoryResponse

}