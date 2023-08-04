package com.animals.clinic.animals.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "animals")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private Integer age;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    private Owner owner;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "animal")
    private List<Image> imageList = new ArrayList<>();
    @OneToMany(mappedBy = "animal")
    private List<AnimalsVaccination> animalsVaccinations = new ArrayList<>();

    public void addImage(Image image) {
        image.setAnimal(this);
        imageList.add(image);
    }

}
