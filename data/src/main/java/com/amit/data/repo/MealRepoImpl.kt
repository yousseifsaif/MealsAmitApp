package com.amit.data.repo

import com.amit.data.remote.MealApi
import com.amit.domain.entity.meals.MealsResponse
import com.amit.domain.repo.meals.MealsRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MealRepoImpl(private val mealApi:MealApi):MealsRepo {
    override suspend fun getMealsCategoriesFromRemote(): MealsResponse =
        withContext(Dispatchers.IO){
            return@withContext mealApi.getMealsCategories()
        }


}