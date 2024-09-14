package com.example.mealsapp.di




import com.amit.data.remote.MealApi
import com.amit.data.repo.MealRepoImpl
import com.amit.domain.repo.meals.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun providedMealsRepo(
        mealsApi: MealApi,
    ): MealsRepo {
        return MealRepoImpl(mealsApi)
    }
}