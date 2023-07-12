package com.animals.clinic.animals.services.impl;

import com.animals.clinic.animals.models.Animal;
import com.animals.clinic.animals.repositories.AnimalsRepository;
import com.animals.clinic.animals.services.AnimalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public class AnimalsServiceImpl implements AnimalsService {
private final AnimalsRepository animalsRepository;

    public AnimalsServiceImpl(AnimalsRepository animalsRepository) {
        this.animalsRepository = animalsRepository;
    }

    @Override
    public List<Animal> getAllAnimals() {
        return animalsRepository.findAll();
    }
}
