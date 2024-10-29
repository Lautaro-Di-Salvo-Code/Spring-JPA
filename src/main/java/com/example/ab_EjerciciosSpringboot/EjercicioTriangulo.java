package com.example.demo.ab_EjerciciosSpringboot;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EjercicioTriangulo {

    @GetMapping("/triangulo")
    public String obtenerAreaTriangulo(@RequestParam int base, int altura){

        int res = base *  altura ;
        return "El area del triangulo es: "+  res / 2 ;
    }

}



@Getter @Setter
class CalculoTraingulo{

    private int base, altura;

    public CalculoTraingulo() {
    }

    public CalculoTraingulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
}

//Ejercicio Nº 3 – Área del triángulo
//
//Realizar una API que permita obtener como response a una solicitud GET el área de un triángulo.
// Se recuerda que la fórmula para calcular el área de un triángulo es: (base * altura) / 2.
//
//Se debe permitir al usuario enviar como parámetro de la solicitud la base
// y la altura, mientras que la API debe calcular el área y responder el resultado.
//
//Para este ejercicio sentite con total libertad de utilizar la forma de pasaje de parámetros
// con la que más cómodo te sientas.