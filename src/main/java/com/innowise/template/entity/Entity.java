package com.innowise.template.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true, setterPrefix = "with")
@EqualsAndHashCode
@Table(name = "entity")
public class Entity {

    @Id
    private String id;

    @Column(name = "string_field")
    private String stringField;

    @Column(name = "int_field")
    private Integer intField;


}
