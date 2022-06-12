package com.innowise.template.transformer;

import com.innowise.template.dto.EntityDto;
import com.innowise.template.entity.Entity;

public interface EntityTransformer {

    Entity transform(EntityDto entityDto);

    EntityDto transform(Entity entity);


}
