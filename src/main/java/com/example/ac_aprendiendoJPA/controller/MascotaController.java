package com.example.ac_aprendiendoJPA.controller;

import com.example.ac_aprendiendoJPA.model.Mascota;
import com.example.ac_aprendiendoJPA.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {


    @Autowired
    private IMascotaService pet_service;

    @PostMapping("apimascota/post")
    public String guardarMascota(@RequestBody Mascota pet) {
        pet_service.guardarMascota(pet);
        return "La mascota se creó correctamente";
    }

}
