package com.Wollit.NomNomNumbers.mapper;

import com.Wollit.NomNomNumbers.dto.AddIngredientDto;
import com.Wollit.NomNomNumbers.model.Ingredient;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IngredientMapper {

    Ingredient mapDtoToIngredient(AddIngredientDto dto);
}
