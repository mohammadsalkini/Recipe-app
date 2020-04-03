package com.mohammadalsalkini.spring5recipeapp.repositories;

import com.mohammadalsalkini.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author Mohammad Alsalkini
 * @project Recipe-app
 * @created 03.04.2020 - 23:44
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
