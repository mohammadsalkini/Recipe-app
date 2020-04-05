package com.mohammadalsalkini.spring5recipeapp.services;

import com.mohammadalsalkini.spring5recipeapp.commands.IngredientCommand;
import com.mohammadalsalkini.spring5recipeapp.domain.Ingredient;

/**
 * @author Mohammad Alsalkini
 * @project Recipe-app
 * @created 05.04.2020 - 11:26
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long IngredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);
}
