package com.project.taco.tacoproject.repository;

import com.project.taco.tacoproject.model.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
