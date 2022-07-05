package com.jonatanmorisson.devtest.CRUDService.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Details")
@Data
public class Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String phone;
}
