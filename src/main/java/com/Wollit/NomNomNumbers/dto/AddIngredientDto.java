package com.Wollit.NomNomNumbers.dto;

import com.Wollit.NomNomNumbers.model.IngredientType;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddIngredientDto {

    private String name;
    private IngredientType type;
    private Float protein;
    private Float fat;
    private Float carbohydrates;
    private Float calories;
    private Float price;
}
