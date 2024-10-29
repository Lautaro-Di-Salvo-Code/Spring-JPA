package com.example.demo.patronDTO;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class Domicilio {
    private int idPropiedad;
    private String direccion;
    private int num_depto;

    public Domicilio(int idPropiedad,
                     String direccion,
                     int num_depto) {
        this.idPropiedad = idPropiedad;
        this.direccion = direccion;
        this.num_depto = num_depto;
    }

    public Domicilio() {
    }


}
