package com.example.ac_aprendiendoJPA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    public Mascota() {
    }

    public Mascota(Long id_mascota, String nombre, String raza, int edad) {
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

}

