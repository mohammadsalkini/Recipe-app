package com.mohammadalsalkini.spring5recipeapp.domain;

/**
 * @author Mohammad Alsalkini
 * @project recipe-app
 * @created 03.04.2020 - 21:35
 */
public class Recipe {

    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private Integer source;
    private String url;
    private String directions;

    //todo add
    //private Difficulty difficulty;
    private Byte[] image;
    private  Notes notes;
}
