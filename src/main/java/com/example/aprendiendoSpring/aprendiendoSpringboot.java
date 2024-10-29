package com.example.demo.aprendiendoSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class aprendiendoSpringboot {
    
    
    @GetMapping("/1")
    public String primerGet(){
        return "hola, que tal";
    }
    @GetMapping("/2")
    public String segundoGet(){
        return "Buenas noches";
    }
    @GetMapping("/2/{data}")
    public String testingPAthDinamic(@PathVariable String data ){
        return "Buenas noches" + data;
    }
    @GetMapping("/2/{data}/{data2}")
    public String testingPathsMultiple(@PathVariable String data,@PathVariable String data2 ){
        return "Buenas noches" + data + data2;
    }
    
    @GetMapping("/saludo")
    public String reqParams(@RequestParam String nombre,@RequestParam int edad ){
        return "Buenas noches, mi nombre es: "+ nombre + " y mi edad: "+ edad;
    }
    @GetMapping("/ejercicio/{num1}/{num2}")
    public String Ejercicio(@PathVariable int num1,@PathVariable int num2 ){
        
        int res = num1 + num2;
        
        return "Resultado: " + res;
    }
    
    @GetMapping("ej2")
    public String ejercicio2(@RequestParam double pesopersona ){
        
        if(pesopersona > 1 || pesopersona < 8.5){
            return "Peso insuficiente";
        }else if(pesopersona >=  18.6 || pesopersona < 24.9){
            return "Peso normal";
        } else if(pesopersona >=  25.0 ||pesopersona < 29.9){
            return "Sobre peso";
        }else if(pesopersona >= 30){
            return "Obesidad";
        }
        
        return null;
    }
    
//    1 galon = 3,785 litros
    @GetMapping("/ej3/{galones}")
    public String ejercicio3(@PathVariable int galones ){
        
        double litrosPorGalon = 3.785;
        
        double litros_resultantes = galones * litrosPorGalon;
        return "Estos galones: " +  galones + " representan: " + litros_resultantes + " litros. ";
    }
    
    
}
