package com.example.ac_aprendiendoJPA.controller;

import com.example.ac_aprendiendoJPA.model.PersonaJpa;
import com.example.ac_aprendiendoJPA.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PErsonaController {

    @Autowired
    private IPersonaService servicePerson;

    @GetMapping("apipersona/get")
    public List<PersonaJpa> traerPerson(){
        return servicePerson.obtenerPersona();
    }
    @PostMapping("apipersona/post")
    public String  postPerson(@RequestBody PersonaJpa e){
        servicePerson.guardarPersona(e);
        return "La persona se creó";
    }
    @DeleteMapping("apipersona/del/{id}")
    public String delPerson(@PathVariable Long id){
        servicePerson.deletePersona(id);
        return "La persona de eliminó con exito";
    }

    @PutMapping("apipersona/edit/{id_original}")
    public PersonaJpa editPerson(@PathVariable Long id_original ,
                                 @RequestParam(required = false, name = "id")Long nuevoId,
                                 @RequestParam(required = false, name = "nombre")String nuevoNombre,
                                 @RequestParam(required = false, name = "apellido")String nuevoApellido,
                                 @RequestParam(required = false, name = "edad")int nuevaEdad ){

        servicePerson.editarPersona(id_original, nuevoId, nuevoApellido, nuevoNombre, nuevaEdad);

        PersonaJpa personEdit = servicePerson.encontrarPersona(nuevoId);
        return personEdit;
    }
}
