package com.amit.domain.repo.meals

import com.amit.domain.entity.meals.MealsResponse

interface MealsRepo {
     suspend fun getMealsCategoriesFromRemote():MealsResponse
}