package com.Wollit.NomNomNumbers.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ingredients")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @Enumerated(EnumType.STRING)
    private IngredientType type;

    @NotNull
    private Float protein;

    @NotNull
    private Float fat;

    @NotNull
    private Float carbohydrates;

    @NotNull
    private Float calories;

    private Float price;
}
