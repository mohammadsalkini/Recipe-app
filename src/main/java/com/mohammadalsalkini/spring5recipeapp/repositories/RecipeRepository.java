package com.mohammadalsalkini.spring5recipeapp.repositories;

import com.mohammadalsalkini.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Mohammad Alsalkini
 * @project Recipe-app
 * @created 03.04.2020 - 23:43
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
