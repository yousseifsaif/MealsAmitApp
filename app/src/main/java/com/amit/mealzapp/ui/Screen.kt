package com.amit.mealzapp.ui

sealed class Screen(val route: String) {
    data object MealsScreen : Screen("mealsScreen")
    data object MealsDetailsScreen : Screen("mealsDetailsScreen")
}