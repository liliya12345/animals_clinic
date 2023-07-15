package com.animals.clinic.animals.services;

import com.animals.clinic.animals.models.Owner;

import java.util.List;

public interface OwnerService {
    List<Owner> getAllOwner();

    Owner getOwnerById(Integer ownerId);

}
