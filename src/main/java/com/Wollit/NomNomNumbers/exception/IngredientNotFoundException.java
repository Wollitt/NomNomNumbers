package com.Wollit.NomNomNumbers.exception;

public class IngredientNotFoundException extends RuntimeException {

    public IngredientNotFoundException(Long ingredientId) {
        super("Ingredient not found with id: " + ingredientId);
    }
}
