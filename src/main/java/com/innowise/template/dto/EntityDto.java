package com.innowise.template.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(setterPrefix = "with", toBuilder = true)
public class EntityDto {

    private String stringField;

    private Integer intField;


}
