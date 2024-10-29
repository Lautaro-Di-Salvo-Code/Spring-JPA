package com.example.demo.ab_SpringBasics;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RepasoRequestBody_metodoPost {
    @PostMapping("/mascosas")
    public void ObtenerDatos(@RequestBody ClaseDeGetters e){
        System.out.println("Nombre: "+ e.getNombre());
        System.out.println("Nombre: "+ e.getApellido());
        System.out.println("Nombre: "+ e.getEdad());
    }
}

@Getter @Setter
class ClaseDeGetters{

    private String nombre, apellido;
    private int edad;

}
