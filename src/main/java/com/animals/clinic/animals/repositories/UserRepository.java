package com.animals.clinic.animals.repositories;

import com.animals.clinic.animals.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByEmail(String email);

}
