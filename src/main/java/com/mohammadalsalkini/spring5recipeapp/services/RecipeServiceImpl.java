package com.mohammadalsalkini.spring5recipeapp.services;

import com.mohammadalsalkini.spring5recipeapp.domain.Recipe;
import com.mohammadalsalkini.spring5recipeapp.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Mohammad Alsalkini
 * @project Recipe-app
 * @created 04.04.2020 - 00:53
 */

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }


    @Override
    public Set<Recipe> getAllRecipes() {

        Set<Recipe> recipeSet = new HashSet<>();

        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
