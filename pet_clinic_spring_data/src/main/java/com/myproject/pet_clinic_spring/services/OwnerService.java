package com.myproject.pet_clinic_spring.services;

import com.myproject.pet_clinic_spring.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>  {
    Owner findByLastName(String lastName);
 }
