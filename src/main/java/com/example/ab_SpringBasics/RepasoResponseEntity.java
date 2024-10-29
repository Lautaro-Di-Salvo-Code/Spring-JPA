package com.example.demo.ab_SpringBasics;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class RepasoResponseEntity {
    @GetMapping("/persona")
    @ResponseBody
    public List<DatosPersona> leerPersonas(){
        List<DatosPersona> lista_person = new ArrayList<DatosPersona>();
        lista_person.add(new DatosPersona("Robert D Jr", "Beberly hills", 56));
        lista_person.add(new DatosPersona("Chris Evans", "San andreas", 46));
        lista_person.add(new DatosPersona("Chris Evans", "San andreas", 46));
        lista_person.add(new DatosPersona("Chris Evans", "San andreas", 46));
        lista_person.add(new DatosPersona("Chris Evans", "San andreas", 46));
        return lista_person;
    }

//    ResponseEntity permite devolver respuestas personalizadas http al hacer las peticiones
    ResponseEntity<String> ManejoErroresProtocoloHttp(){
        return  new ResponseEntity<>(HttpStatus.OK);
    }

}
@Getter @Setter
class DatosPersona{
    private String nombre_apellido , domicilio;
    private int edad ;

    public DatosPersona(String nombre_apellido, String domicilio, int edad) {
        this.nombre_apellido = nombre_apellido;
        this.domicilio = domicilio;
        this.edad = edad;
    }

    public DatosPersona() {
    }
}