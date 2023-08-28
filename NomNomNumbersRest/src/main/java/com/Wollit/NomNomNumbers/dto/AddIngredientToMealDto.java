package com.Wollit.NomNomNumbers.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddIngredientToMealDto {
    private Long ingredientId;
    private Float amount;
}
