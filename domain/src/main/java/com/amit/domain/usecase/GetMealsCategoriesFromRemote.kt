package com.amit.domain.usecase

import com.amit.domain.repo.meals.MealsRepo

class GetMealsCategoriesFromRemote(private val mealsRepo: MealsRepo) {
    operator suspend fun invoke() = mealsRepo.getMealsCategoriesFromRemote()

}