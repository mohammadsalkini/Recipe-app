package com.mohammadalsalkini.spring5recipeapp.repositories;

import com.mohammadalsalkini.spring5recipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author MOhammad Alsalkini
 * @project Recipe-app
 * @created 03.04.2020 - 23:45
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
