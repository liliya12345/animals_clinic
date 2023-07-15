package com.animals.clinic.animals.repositories;

import com.animals.clinic.animals.models.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnersRepository extends JpaRepository<Owner,Integer> {
}
