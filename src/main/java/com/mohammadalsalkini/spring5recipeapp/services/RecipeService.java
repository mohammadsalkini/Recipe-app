package com.mohammadalsalkini.spring5recipeapp.services;

import com.mohammadalsalkini.spring5recipeapp.commands.RecipeCommand;
import com.mohammadalsalkini.spring5recipeapp.domain.Recipe;

import java.util.Set;

/**
 * @author Mohammad Alsalkini
 * @project Recipe-app
 * @created 04.04.2020 - 00:52
 */
public interface RecipeService {

    Set<Recipe> getAllRecipes();

    public Recipe findById(Long id);

    RecipeCommand findCommandById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    public void deleteById(Long id);
}
