package com.example.demo.patronDTO;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RestController;

@Getter @Setter
public class UniendoDatosDTOPattern  {
//    Acá está la unificacion de los datos que seria propiedadDTO de luisina
    private int idPropiedad;
    private String direccion;
    private int num_depto;
    private int edad;
    private String nombre,apellido;
    private  String profesion;

    public UniendoDatosDTOPattern() {
    }
    public UniendoDatosDTOPattern(int idPropiedad, String direccion,
                                  int num_depto,int edad, String nombre,
                                  String apellido, String profesion) {
        this.idPropiedad = idPropiedad;
        this.direccion = direccion;
        this.num_depto = num_depto;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
    }

}
