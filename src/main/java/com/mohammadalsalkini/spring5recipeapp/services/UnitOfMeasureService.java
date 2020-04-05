package com.mohammadalsalkini.spring5recipeapp.services;

import com.mohammadalsalkini.spring5recipeapp.commands.UnitOfMeasureCommand;

import java.util.Set;

/**
 * @author Mohammad Alsalkini
 * @project Recipe-app
 * @created 05.04.2020 - 13:43
 */
public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
