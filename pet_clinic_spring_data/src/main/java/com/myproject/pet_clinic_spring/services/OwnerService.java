package com.myproject.pet_clinic_spring.services;

import com.myproject.pet_clinic_spring.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();

}
