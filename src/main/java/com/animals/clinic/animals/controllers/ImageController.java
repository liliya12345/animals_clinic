package com.animals.clinic.animals.controllers;

import com.animals.clinic.animals.models.Image;
import com.animals.clinic.animals.repositories.ImageRepository;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayInputStream;
import java.util.Optional;

@RestController

public class ImageController {
    private final ImageRepository imageRepository;

    public ImageController(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }
    @GetMapping("/image/{imageId}")
    public ResponseEntity<?> getImage(@PathVariable Integer id){
        Optional<Image> imageById = imageRepository.findById(id);
        Image image = imageById.orElse(null);
        if(image==null){
            return ResponseEntity.notFound().build();
        }return ResponseEntity.ok().header("fileName", image.getOriginalFileName())
                .contentType(MediaType.valueOf(image.getContentType()))
                .contentLength(image.getSize())
                .body(new InputStreamResource(new ByteArrayInputStream(image.getBytes())));
    }
}
