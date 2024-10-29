package com.example.demo.ejercicioPlatos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;

@RestController
public class mapPlatos {
    @GetMapping("/numplato/{num_plato}")
    @ResponseBody
    public LinkedList<ejercicioPlatos> mapeandoPlatos(){
        LinkedList<ejercicioPlatos> array_platos = new LinkedList<ejercicioPlatos>();
        array_platos.add(new ejercicioPlatos(1, 2.50, "Pastas", "Fideos con tuco"));
        array_platos.add(new ejercicioPlatos(2, 2.30, "Empanadas", "Empanadas de pollo"));
        array_platos.add(new ejercicioPlatos(3, 3.50, "Carne", "Estofado de pollo"));
        return array_platos;
    }



}
