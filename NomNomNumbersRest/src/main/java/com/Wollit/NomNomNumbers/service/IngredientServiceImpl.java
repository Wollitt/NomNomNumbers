package com.Wollit.NomNomNumbers.service;

import com.Wollit.NomNomNumbers.dto.AddIngredientDto;
import com.Wollit.NomNomNumbers.mapper.IngredientMapper;
import com.Wollit.NomNomNumbers.model.Ingredient;
import com.Wollit.NomNomNumbers.repositorie.IngredientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class IngredientServiceImpl implements IngredientService {

    private IngredientRepository ingredientRepository;
    private IngredientMapper ingredientMapper;

    @Override
    public List<Ingredient> findAllIngredients() {
        return ingredientRepository.findAll();
    }

    @Override
    @Transactional
    public Ingredient addIngredient(AddIngredientDto dto) {
        return ingredientRepository.save(ingredientMapper.mapDtoToIngredient(dto));
    }
}
