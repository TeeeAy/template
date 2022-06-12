package com.innowise.template.transformer;

import com.innowise.template.dto.EntityDto;
import com.innowise.template.entity.Entity;
import org.springframework.stereotype.Component;

@Component
public class EntityTransformerImpl implements EntityTransformer{

    @Override
    public Entity transform(EntityDto entityDto) {
        return Entity.builder()
                .withIntField(entityDto.getIntField())
                .withStringField(entityDto.getStringField())
                .build();
    }

    @Override
    public EntityDto transform(Entity entity) {
        return EntityDto.builder()
                .withIntField(entity.getIntField())
                .withStringField(entity.getStringField())
                .build();
    }
}
