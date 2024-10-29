package com.example.ac_aprendiendoJPA.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class PersonaJpa{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;
    private int edad;
    private String nombre, apellido, estado_civl, pais;
    @OneToOne
    private Mascota mascota_person;


    public PersonaJpa() {
    }

    public PersonaJpa(Long id, int edad,
                      String nombre, String apellido,
                      String estado_civl, String pais) {
        Id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado_civl = estado_civl;
        this.pais = pais;
    }
}