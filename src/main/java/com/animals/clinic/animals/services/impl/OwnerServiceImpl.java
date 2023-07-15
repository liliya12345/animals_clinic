package com.animals.clinic.animals.services.impl;

import com.animals.clinic.animals.models.Owner;
import com.animals.clinic.animals.repositories.OwnersRepository;
import com.animals.clinic.animals.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerServiceImpl  implements OwnerService {
    private final OwnersRepository ownersRepository;

    public OwnerServiceImpl(OwnersRepository ownersRepository) {
        this.ownersRepository = ownersRepository;
    }

    @Override
    public List<Owner> getAllOwner() {
        return ownersRepository.findAll();
    }

    @Override
    public Owner getOwnerById(Integer ownerId) {
        Optional<Owner> ownerById = ownersRepository.findById(ownerId);
        return ownerById.orElseThrow(RuntimeException::new);

    }

}
