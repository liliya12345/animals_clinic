package com.animals.clinic.animals.models;

import jakarta.persistence.*;

@Entity
@Table(name="animals")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private Integer age;
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Owner owner;

}
