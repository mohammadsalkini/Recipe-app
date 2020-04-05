package com.mohammadalsalkini.spring5recipeapp.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author Mohammad Alsalkini
 * @project Recipe-app
 * @created 05.04.2020 - 15:49
 */
public interface ImageService {
    void saveImageFile(Long recipeId, MultipartFile file);

}
