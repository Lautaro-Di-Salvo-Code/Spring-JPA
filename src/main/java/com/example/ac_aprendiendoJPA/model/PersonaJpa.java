package com.example.ac_aprendiendoJPA.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;


@Getter @Setter
@Entity
public class PersonaJpa{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;
    private int edad;
    private String nombre, apellido, estado_civl, pais;
//    @OneToOne
//    en name va el id que nos aparece en el phpmyadmin y en  referencedColumnName el id del otro modelo
//    en este caso Mascota
//    @JoinColumn (name = "mascota_person_id_mascota", referencedColumnName = "id_mascota")
//    private Mascota mascota_person;
        @OneToMany
        private List<Mascota> listOfPet;

    public PersonaJpa() {
    }
//    El contructor del OneToOne
//    public PersonaJpa(Long id, int edad, String nombre, String apellido, String estado_civl, String pais, Mascota mascota_person) {
//        Id = id;
//        this.edad = edad;
//        this.nombre = nombre;
//        this.apellido = apellido;
//        this.estado_civl = estado_civl;
//        this.pais = pais;
//        this.mascota_person = mascota_person;
//    }


    public PersonaJpa(Long id, int edad, String nombre, String apellido, String estado_civl, String pais, List<Mascota> listOfPet) {
        Id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado_civl = estado_civl;
        this.pais = pais;
        this.listOfPet = listOfPet;
    }
}