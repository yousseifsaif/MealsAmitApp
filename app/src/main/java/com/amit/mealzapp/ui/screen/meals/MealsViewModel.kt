package com.amit.mealzapp.ui.screen.meals

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import coil.network.HttpException
import com.amit.domain.entity.meals.MealsResponse
import com.amit.domain.usecase.GetMealsCategoriesFromRemote
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject


private const val TAG = "MealsViewModel"
@HiltViewModel
class MealsViewModel @Inject constructor(private val getMealsCategoriesFromRemote: GetMealsCategoriesFromRemote) : ViewModel() {

    private val _categories = MutableStateFlow<MealsResponse>(MealsResponse(emptyList()))
    val category = _categories.asStateFlow()

    init {
        getMeals()
    }

    private fun getMeals(){
        viewModelScope.launch {
            try {
                val data = getMealsCategoriesFromRemote()
                _categories.update { data }
            }catch (ex : Exception){
                if(ex is HttpException){
                    Log.d(TAG, "getMeals: ${ex.message}")
                }else{
                    Log.d(TAG, "getMeals: ${ex.message}")
                }

            }
        }

    }
}