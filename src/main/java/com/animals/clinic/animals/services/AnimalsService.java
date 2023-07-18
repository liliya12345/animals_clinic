package com.animals.clinic.animals.services;

import com.animals.clinic.animals.models.Animal;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface AnimalsService {
    List<Animal> getAllAnimals();
    Animal addNewAnimal(Animal animal, MultipartFile image);

    Animal getAnimalById (Integer animalId);
}
