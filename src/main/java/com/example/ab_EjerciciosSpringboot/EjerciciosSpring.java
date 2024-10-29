package com.example.demo.ab_EjerciciosSpringboot;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EjerciciosSpring {
        @PostMapping("/promedios")
        public String sacarPromedio(@RequestParam double Nota1,double Nota2, double Nota3, double Nota4 ){
            double res_suma_notas =  Nota1 + Nota2 + Nota3 + Nota4;
            return "Promedio total de las materias es: "+ res_suma_notas / 4;
        }
}

@Getter @Setter
class PromediosNotas{
    private double Nota1, Nota2, Nota3, Nota4;
    public PromediosNotas() {
    }
    public PromediosNotas(double nota1, double nota2, double nota3, double nota4) {
        Nota1 = nota1;
        Nota2 = nota2;
        Nota3 = nota3;
        Nota4 = nota4;
    }
}


//Ejercicio Nº 1 – Promedio de Notas
//Un alumno de secundaria desea poder contar con una API mediante la cual, al enviar las 3 notas de una
//materia obtenga como respuesta el promedio de la misma. Para el pasaje de notas como parámetro
//utilizar la annotation @RequestParam.


