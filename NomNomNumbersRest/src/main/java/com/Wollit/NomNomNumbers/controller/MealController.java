package com.Wollit.NomNomNumbers.controller;

import com.Wollit.NomNomNumbers.dto.AddMealDto;
import com.Wollit.NomNomNumbers.dto.MealInfoDto;
import com.Wollit.NomNomNumbers.dto.MessageResponseDto;
import com.Wollit.NomNomNumbers.model.Meal;
import com.Wollit.NomNomNumbers.service.MealService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@AllArgsConstructor
@RequestMapping("api/meal")
public class MealController {

    private MealService mealService;

    @GetMapping()
    public ResponseEntity<?> findAllMeals() {

        List<MealInfoDto> meals = mealService.findAllMeals();

        return ResponseEntity.ok(new MessageResponseDto(
                "All meals were successfully retrieved",
                meals
        ));
    }

    @PostMapping()
    public ResponseEntity<?> addMeal(@Valid @RequestBody AddMealDto dto) {
        Meal newMeal = mealService.addMeal(dto);

        return ResponseEntity.ok(new MessageResponseDto(
                "Meal was successfully created",
                newMeal
        ));
    }

}
