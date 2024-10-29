package com.example.demo.ejercicioPlatos;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ejercicioPlatos {
    private int num_plato;
    private double precio;
    private String nombre_plato;
    private String descripcion_plato;

    public ejercicioPlatos(int num_plato, double precio, String nombre_plato, String descripcion_plato) {
        this.num_plato = num_plato;
        this.precio = precio;
        this.nombre_plato = nombre_plato;
        this.descripcion_plato = descripcion_plato;
    }

    public ejercicioPlatos() {
    }
}
