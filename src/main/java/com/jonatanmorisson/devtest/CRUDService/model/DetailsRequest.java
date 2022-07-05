package com.jonatanmorisson.devtest.CRUDService.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class DetailsRequest {
    private String name;
    private String phone;
}
