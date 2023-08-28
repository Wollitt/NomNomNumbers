package com.Wollit.NomNomNumbers.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "meals")
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

//    @ManyToMany
//    @JoinTable(
//            name = "meals_ingredients",
//            joinColumns = @JoinColumn(name = "meal_id"),
//            inverseJoinColumns = @JoinColumn(name = "ingredient_id")
//    )
//    private List<Ingredient> ingredients = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "meals_ingredients", joinColumns = @JoinColumn(name = "meal_id"))
    @MapKeyJoinColumn(name = "ingredient_id")
    @Column(name = "amount")
    private Map<Ingredient, Float> ingredientAmount = new HashMap<>();
}
