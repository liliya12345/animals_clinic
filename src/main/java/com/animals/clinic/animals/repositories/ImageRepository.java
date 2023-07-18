package com.animals.clinic.animals.repositories;

import com.animals.clinic.animals.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image,Integer> {
}
