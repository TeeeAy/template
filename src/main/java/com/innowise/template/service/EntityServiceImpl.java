package com.innowise.template.service;

import com.innowise.template.dto.EntityDto;
import com.innowise.template.entity.Entity;
import com.innowise.template.repository.EntityRepository;
import com.innowise.template.transformer.EntityTransformer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EntityServiceImpl implements EntityService {

    private final EntityRepository repository;

    private final EntityTransformer transformer;

    @Override
    public EntityDto getByById(String id) {
        Optional<Entity> entityOptional = repository.findById(id);
        return transformer.transform(entityOptional.orElseThrow(IllegalArgumentException::new));
    }

    @Override
    public Entity save(EntityDto entityDto) {
        return repository.save(transformer.transform(entityDto));
    }
}
