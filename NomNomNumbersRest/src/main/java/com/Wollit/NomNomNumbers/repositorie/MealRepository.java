package com.Wollit.NomNomNumbers.repositorie;

import com.Wollit.NomNomNumbers.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {
}
