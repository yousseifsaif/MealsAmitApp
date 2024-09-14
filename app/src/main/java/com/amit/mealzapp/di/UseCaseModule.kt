package com.amit.mealzapp.di


import com.amit.domain.repo.meals.MealsRepo
import com.amit.domain.usecase.GetMealsCategoriesFromRemote
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideGetMealsCategoriesFromRemoteUseCase(mealsRepo: MealsRepo): GetMealsCategoriesFromRemote {
        return GetMealsCategoriesFromRemote(mealsRepo)
    }


}