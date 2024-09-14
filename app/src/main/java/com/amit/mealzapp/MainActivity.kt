package com.amit.mealzapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.amit.mealzapp.ui.Screen
import com.amit.mealzapp.ui.screen.mealdetails.MealsDetailsScreen
import com.amit.mealzapp.ui.theme.MealzAppTheme
import com.amit.mealzapp.ui.screen.meals.MealsScreen
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MealzAppTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    MealsScreen()
                }
            }
        }
    }
    @Composable
    fun MealsApp(){
        val navHostController = rememberNavController()

        NavHost(navController = navHostController, startDestination = Screen.MealsScreen) {
            composable(Screen.MealsScreen.route){ MealsScreen(navHostController) }
            composable(Screen.MealsDetailsScreen.route){ MealsDetailsScreen(navHostController) }

        }
}



