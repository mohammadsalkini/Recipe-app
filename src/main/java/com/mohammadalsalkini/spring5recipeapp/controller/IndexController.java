package com.mohammadalsalkini.spring5recipeapp.controller;

import com.mohammadalsalkini.spring5recipeapp.domain.Category;
import com.mohammadalsalkini.spring5recipeapp.domain.UnitOfMeasure;
import com.mohammadalsalkini.spring5recipeapp.repositories.CategoryRepository;
import com.mohammadalsalkini.spring5recipeapp.repositories.UnitOfMeasureRepository;
import com.mohammadalsalkini.spring5recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * @author Mohammad Alsalkini
 * @project recipe-app
 * @created 03.04.2020 - 18:03
 */

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndex(Model model) {

        model.addAttribute("recipes", recipeService.getAllRecipes());

        return "index";
    }
}
