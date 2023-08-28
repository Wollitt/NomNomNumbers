package com.Wollit.NomNomNumbers.controller;

import com.Wollit.NomNomNumbers.dto.AddIngredientDto;
import com.Wollit.NomNomNumbers.dto.MessageResponseDto;
import com.Wollit.NomNomNumbers.model.Ingredient;
import com.Wollit.NomNomNumbers.service.IngredientService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@AllArgsConstructor
@RequestMapping("api/ingredient")
public class IngredientController {

    private IngredientService ingredientService;

    @GetMapping()
    public ResponseEntity<?> findAllIngredients() {

        List<Ingredient> ingredients = ingredientService.findAllIngredients();

        return ResponseEntity.ok(new MessageResponseDto(
                "All ingredient were successfully retrieved",
                ingredients));
    }

    @PostMapping()
    public ResponseEntity<?> addIngredient(@Valid @RequestBody AddIngredientDto dto) {
        Ingredient newIngredient = ingredientService.addIngredient(dto);

        return ResponseEntity.ok(new MessageResponseDto(
                "Ingredient was successfully added",
                newIngredient
        ));
    }
}
