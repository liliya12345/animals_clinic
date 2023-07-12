package com.animals.clinic.animals.controllers;

import com.animals.clinic.animals.models.Animal;
import com.animals.clinic.animals.services.impl.AnimalsServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

public class AnimalsController {
    private final AnimalsServiceImpl animalsService;

    public AnimalsController(AnimalsServiceImpl animalsService) {
        this.animalsService = animalsService;
    }

    @GetMapping("/animal")
    public String getAllAnimals(Model model) {
        List<Animal> allAnimals = animalsService.getAllAnimals();
        Animal animalFirst = allAnimals.get(0);
        model.addAttribute("animalFirst", animalFirst);
        return "animals";
    }
}
