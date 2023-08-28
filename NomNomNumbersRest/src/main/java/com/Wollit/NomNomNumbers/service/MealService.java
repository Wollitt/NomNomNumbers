package com.Wollit.NomNomNumbers.service;

import com.Wollit.NomNomNumbers.dto.AddMealDto;
import com.Wollit.NomNomNumbers.dto.MealInfoDto;
import com.Wollit.NomNomNumbers.model.Meal;

import java.util.List;

public interface MealService {

    List<MealInfoDto> findAllMeals();

    Meal addMeal(AddMealDto dto);
}
