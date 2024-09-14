package com.amit.data.remote

import com.amit.domain.entity.meals.MealsResponse
import retrofit2.http.GET

interface MealApi {
    @GET("categories.php")
    suspend fun getMealsCategories():MealsResponse
}