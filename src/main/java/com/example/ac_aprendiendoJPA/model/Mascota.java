package com.example.ac_aprendiendoJPA.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_mascota;
    private String nombre;
    private String raza;
    private int edad;
//    anotation para hacer relacion de muchos a uno
//    en este caso muchos perros pueden ser mascota de una sola persona
    @ManyToOne
    private PersonaJpa person;

    public Mascota() {
    }

    public Mascota(Long id_mascota, String nombre, String raza, int edad) {
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

}

