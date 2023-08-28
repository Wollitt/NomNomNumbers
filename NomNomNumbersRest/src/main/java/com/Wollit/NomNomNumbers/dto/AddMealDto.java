package com.Wollit.NomNomNumbers.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddMealDto {

    private String mealName;
    private List<AddIngredientToMealDto> ingredientAmounts;
}
