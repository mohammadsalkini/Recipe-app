package com.mohammadalsalkini.spring5recipeapp.converters;

import com.mohammadalsalkini.spring5recipeapp.commands.CategoryCommand;
import com.mohammadalsalkini.spring5recipeapp.domain.Category;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * @author Mohammad Alsalkini
 * @project Recipe-app
 * @created 04.04.2020 - 19:05
 */
@Component
public class CategoryCommandToCategory implements Converter<CategoryCommand, Category> {

    @Synchronized
    @Nullable
    @Override
    public Category convert(CategoryCommand source) {
        if (source == null) {
            return null;
        }

        final Category category = new Category();
        category.setId(source.getId());
        category.setDescription(source.getDescription());
        return category;
    }
}