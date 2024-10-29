package com.example.demo.ab_SpringBasics;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RepasoPathVariable {

    @GetMapping("/saludo")
    public String decirHola(){
        return "Hola, que tal";
    }
    @GetMapping("/saludo/{dato}/{dato2}")
    public String decirAlgoPersonalizado(@PathVariable String dato,@PathVariable int dato2){
        return "Buenasss" +  dato + dato2;
    }
}
