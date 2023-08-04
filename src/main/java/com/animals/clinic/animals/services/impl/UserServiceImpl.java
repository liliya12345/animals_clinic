package com.animals.clinic.animals.services.impl;

import com.animals.clinic.animals.models.User;
import com.animals.clinic.animals.models.UserRole;
import com.animals.clinic.animals.repositories.UserRepository;
import com.animals.clinic.animals.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


    @Override
    public boolean createUser(User user) {
        String email = user.getEmail();
        if (userRepository.findByEmail(email) != null) {
            return false;
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.getUserRoles().add(UserRole.ROLE_USER);
        User createUser = userRepository.save(user);
        log.info("Created a new user:" + createUser.getName());
        return true;
    }
}
