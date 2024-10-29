package com.example.demo.patronDTO;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DatosPersona {

    private int edad;
    private String nombre,apellido;
    private  String profesion;
    private  String estado_civil;
    private  double pesoCorporal;

    public DatosPersona(int edad, String nombre, String apellido,
                        String profesion, String estado_civil,
                        double pesoCorporal) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.estado_civil = estado_civil;
        this.pesoCorporal = pesoCorporal;
    }

    public DatosPersona() {
    }
}
