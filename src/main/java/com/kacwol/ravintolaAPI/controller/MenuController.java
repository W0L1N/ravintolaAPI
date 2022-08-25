package com.kacwol.ravintolaAPI.controller;


import com.kacwol.ravintolaAPI.menu.model.MealDto;
import com.kacwol.ravintolaAPI.menu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("menu")
public class MenuController {

    private final MenuService service;

    @Autowired
    public MenuController(MenuService service) {
        this.service = service;
    }

    @GetMapping
    public List<MealDto> getMenu(){
        return service.getAllMeals();
    }

    @PostMapping
    public void addMeal(@RequestBody MealDto dto){
        service.addMeal(dto);
    }
}
