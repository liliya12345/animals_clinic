package com.animals.clinic.animals.repositories;

import com.animals.clinic.animals.models.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalsRepository extends JpaRepository<Animal,Integer> {
}
