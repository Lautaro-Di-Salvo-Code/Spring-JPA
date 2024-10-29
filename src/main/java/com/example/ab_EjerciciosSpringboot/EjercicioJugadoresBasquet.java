package com.example.demo.ab_EjerciciosSpringboot;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class EjercicioJugadoresBasquet {

    @PostMapping("/jugadores/promedio")
    public String PromedioAlturaJug(@RequestBody  List<DataJugadores> info_judadores ){

        double promedio = 0.0;
        List<DataJugadores> jugadores = new ArrayList<DataJugadores>();
        jugadores = info_judadores;
        for (DataJugadores e : jugadores) {
             promedio =   promedio + e.getEstatura();

        }
            double promedio_todos_los_judadores = promedio / 4;
            System.out.println("Promedio de estaturas por jugador: " + promedio_todos_los_judadores + " centimetros");


        return null;
    }


//    @GetMapping("/jugadores")
//    public List<DataJugadores> Equipo_deJugadores(){
////        Por medio de json obtener los datos de los jugadores
//        List<DataJugadores> jugadores = new ArrayList<DataJugadores>();
//        jugadores.add(new DataJugadores(1, 23, 80.3, 1.94, "Esteban", "Farias"));
//        jugadores.add(new DataJugadores(2, 22, 80.3, 1.92, "Carlos", "Herrera"));
//        jugadores.add(new DataJugadores(3, 19, 80.3, 1.95, "Rodrigo", "Gil"));
//        jugadores.add(new DataJugadores(4, 21, 80.3, 1.93, "Bruno", "Agostini"));
//        jugadores.add(new DataJugadores(5, 20, 80.3, 1.96, "Lautaro", "Martinez"));
//
//        return jugadores;
//    }

}

@Getter @Setter
class DataJugadores{
    private int id ,edad;
    private  double peso, estatura ;
    private  String nombre, apellido;

    public DataJugadores(int id, int edad, double peso, double estatura, String nombre, String apellido) {
        this.id = id;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public DataJugadores() {
    }
}


//Ejercicio Nº 2 – Estaturas en Basquet
//Un director técnico de un equipo de basquet desea poder contar con una API que, al enviar los datos de 5 de
//sus jugadores en el body de una solicitud http POST, los mismos sean dados de alta en una bases de datos lógica representada
//por una lista de tipo ArrayList y que, al mismo tiempo, luego del alta correspondiente, se pueda obtener inmediatamente como
//respuesta el promedio de estatura de todos sus jugadores ingresados.
//
//Los datos que se ingresan para cada jugador son los siguientes: id, dni, nombre, apellido, edad, peso y estatura.
//
//Tener en cuenta para la realización de este ejercicio la manipulación/creación de archivos JSON,
//el uso de Postman como herramienta para generar la solicitud POST, la annotation @RequestBody y el manejo de ArrayLists.



