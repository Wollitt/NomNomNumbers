package com.Wollit.NomNomNumbers.mapper;

import com.Wollit.NomNomNumbers.dto.AddMealDto;
import com.Wollit.NomNomNumbers.dto.MealInfoDto;
import com.Wollit.NomNomNumbers.model.Meal;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MealMapper {

    Meal mapDtoToMeal(AddMealDto dto);

    MealInfoDto mapMealToInfoDto(Meal meal);
}
