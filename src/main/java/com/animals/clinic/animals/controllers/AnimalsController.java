package com.animals.clinic.animals.controllers;

import com.animals.clinic.animals.models.Animal;
import com.animals.clinic.animals.models.Owner;
import com.animals.clinic.animals.services.impl.AnimalsServiceImpl;
import com.animals.clinic.animals.services.impl.OwnerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller

public class AnimalsController {
    private final AnimalsServiceImpl animalsService;
    private final OwnerServiceImpl ownersService;

    public AnimalsController(AnimalsServiceImpl animalsService, OwnerServiceImpl ownersService) {
        this.animalsService = animalsService;
        this.ownersService = ownersService;
    }

    @GetMapping("/")
    public String getAllAnimal(Model model) {
        List<Animal> animals = animalsService.getAllAnimals();
        model.addAttribute("animals", animals);
        List<Owner> owners = ownersService.getAllOwner();
        model.addAttribute("owners", owners);
        return "animals";
    }

    @PostMapping("/animals/create")
    public String addNewAnimal(@RequestParam MultipartFile image, @RequestParam Integer ownerId, Animal animal) {
        Owner ownerById = ownersService.getOwnerById(ownerId);
        animal.setOwner(ownerById);
        animalsService.addNewAnimal(animal,image);

        System.out.println();
        return "redirect:/";
    }
}
