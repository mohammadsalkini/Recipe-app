package com.mohammadalsalkini.spring5recipeapp.controller;

import com.mohammadalsalkini.spring5recipeapp.domain.Category;
import com.mohammadalsalkini.spring5recipeapp.domain.UnitOfMeasure;
import com.mohammadalsalkini.spring5recipeapp.repositories.CategoryRepository;
import com.mohammadalsalkini.spring5recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * @author Mohammad Alsalkini
 * @project recipe-app
 * @created 03.04.2020 - 18:03
 */

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndex() {

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat Id is: " + categoryOptional.get().getId());
        System.out.println("UOM ID is: " + unitOfMeasureOptional.get().getId());
        return "index";
    }
}
