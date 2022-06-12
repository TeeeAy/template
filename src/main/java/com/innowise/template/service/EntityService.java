package com.innowise.template.service;

import com.innowise.template.dto.EntityDto;
import com.innowise.template.entity.Entity;

public interface EntityService {

    EntityDto getByById(String id);

    Entity save(EntityDto entityDto);



}
