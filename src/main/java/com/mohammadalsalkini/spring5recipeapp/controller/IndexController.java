package com.mohammadalsalkini.spring5recipeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Mohammad Alsalkini
 * @project recipe-app
 * @created 03.04.2020 - 18:03
 */

@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index"})
    public String getIndex() {
        return "index";
    }
}
