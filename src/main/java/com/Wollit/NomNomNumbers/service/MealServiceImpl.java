package com.Wollit.NomNomNumbers.service;

import com.Wollit.NomNomNumbers.dto.AddMealDto;
import com.Wollit.NomNomNumbers.dto.MealInfoDto;
import com.Wollit.NomNomNumbers.exception.IngredientNotFoundException;
import com.Wollit.NomNomNumbers.mapper.MealMapper;
import com.Wollit.NomNomNumbers.model.Ingredient;
import com.Wollit.NomNomNumbers.model.Meal;
import com.Wollit.NomNomNumbers.repositorie.IngredientRepository;
import com.Wollit.NomNomNumbers.repositorie.MealRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MealServiceImpl implements MealService {

    private MealRepository mealRepository;
    private MealMapper mealMapper;
    private IngredientRepository ingredientRepository;


    @Override
    public List<MealInfoDto> findAllMeals() {
        return mealRepository.findAll()
                .stream()
                .map(this::mapMealToMealInfoDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public Meal addMeal(AddMealDto dto) {

        Meal newMeal = new Meal();
        newMeal.setName(dto.getMealName());

        dto.getIngredientAmounts().forEach(entry -> {
            Ingredient ingredient = ingredientRepository.findById(entry.getIngredientId())
                    .orElseThrow(() -> new IngredientNotFoundException(entry.getIngredientId()));

            newMeal.getIngredientAmount().put(ingredient, entry.getAmount());
        });

        return mealRepository.save(newMeal);
    }

    private MealInfoDto mapMealToMealInfoDto(Meal meal) {
        HashMap<String, Float> ingredients = new HashMap<>();

        meal.getIngredientAmount().forEach((ingredient, amount) -> {
            ingredients.put(ingredient.getName(), amount);
        });

        return new MealInfoDto(meal.getName(), ingredients);
    }

}
