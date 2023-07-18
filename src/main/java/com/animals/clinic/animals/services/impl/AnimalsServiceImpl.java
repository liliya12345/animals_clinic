package com.animals.clinic.animals.services.impl;

import com.animals.clinic.animals.models.Animal;
import com.animals.clinic.animals.models.Image;
import com.animals.clinic.animals.models.Owner;
import com.animals.clinic.animals.repositories.AnimalsRepository;
import com.animals.clinic.animals.services.AnimalsService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

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

    @Override
    public Animal addNewAnimal(Animal animal, MultipartFile file) {
        //List<Image> imageList = animal.getImageList();
        Image image = convertMultipartFileToimage(file);
       // image.setAnimal(animal);
        animal.addImage(image);
//        imageList.add(image);
//        animal.setImageList(imageList);
        return animalsRepository.save(animal);
    }

    @Override
    public Animal getAnimalById(Integer animalId) {
        Optional<Animal> animalById = animalsRepository.findById(animalId);
        return animalById.orElseThrow(RuntimeException::new);
    }

    private Image convertMultipartFileToimage(MultipartFile file) {
        Image image = new Image();
        image.setName(file.getName());
        image.setOriginalFileName(file.getOriginalFilename());
        image.setSize(file.getSize());
        image.setContentType(file.getContentType());
        try {
            image.setBytes(file.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return image;
    }
}
