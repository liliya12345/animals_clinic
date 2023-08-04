package com.animals.clinic.animals.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="animals_vaccination")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AnimalsVaccination {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "date")
    private LocalDate date;
    @ManyToOne
    private Animal animal;
    @ManyToOne
    private Vaccination vaccination;
}
