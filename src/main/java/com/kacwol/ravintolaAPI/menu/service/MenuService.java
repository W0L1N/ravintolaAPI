package com.kacwol.ravintolaAPI.menu.service;

import com.kacwol.ravintolaAPI.menu.model.MealDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    private final MealRepo repo;

    private final MealMapper mapper;

    @Autowired
    public MenuService(MealRepo mealRepo, MealMapper mapper) {
        this.repo = mealRepo;
        this.mapper = mapper;
    }

    public void addMeal(MealDto dto){
        repo.save(mapper.dtoToEntity(dto));
    }

    public List<MealDto> getAllMeals(){
        return repo.findAll().stream().map(mapper::entityToDto).toList();
    }

}
