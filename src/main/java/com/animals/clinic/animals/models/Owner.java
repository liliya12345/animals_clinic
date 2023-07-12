package com.animals.clinic.animals.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="owner")
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")
    private List<Animal>animals= new ArrayList<>();
}
