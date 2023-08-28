package com.Wollit.NomNomNumbers.dto;

import lombok.*;

import java.util.HashMap;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MealInfoDto {

    private String mealName;
    private HashMap<String, Float> ingredients = new HashMap<>();
}
