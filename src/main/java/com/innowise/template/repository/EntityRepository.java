package com.innowise.template.repository;

import com.innowise.template.entity.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityRepository extends JpaRepository<Entity, String> {

}
