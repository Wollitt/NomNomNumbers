package com.Wollit.NomNomNumbers.service;

import com.Wollit.NomNomNumbers.dto.AddIngredientDto;
import com.Wollit.NomNomNumbers.model.Ingredient;

import java.util.List;

public interface IngredientService {

    List<Ingredient> findAllIngredients();

    Ingredient addIngredient(AddIngredientDto ingredient);
}
