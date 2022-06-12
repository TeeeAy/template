package com.innowise.template.controller;

import com.innowise.template.dto.EntityDto;
import com.innowise.template.entity.Entity;
import com.innowise.template.service.EntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController("/entity")
@RequiredArgsConstructor
public class EntityController {

    private final EntityService entityService;

    @PostMapping("/add")
    public Entity addEntity(@RequestBody EntityDto entityDto){
        return entityService.save(entityDto);
    }

    @GetMapping("/get/{id}")
    public EntityDto addEntity(@PathVariable String id){
        return entityService.getByById(id);
    }



}
