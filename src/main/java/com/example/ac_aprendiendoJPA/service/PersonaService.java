package com.example.ac_aprendiendoJPA.service;

import com.example.ac_aprendiendoJPA.model.PersonaJpa;
import com.example.ac_aprendiendoJPA.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {
    @Autowired
    private IPersonaRepository PersonaS;


    @Override
    public List<PersonaJpa> obtenerPersona() {
        List<PersonaJpa> getPer = PersonaS.findAll();
        return getPer;
    }

    @Override
    public void guardarPersona(PersonaJpa person) {
        PersonaS.save(person);
    }

    @Override
    public void deletePersona(Long id) {
        PersonaS.deleteById(id);
    }

    @Override
    public PersonaJpa encontrarPersona(Long id) {
        PersonaJpa per = PersonaS.findById(id).orElse(null);
        return per;
    }

    @Override
    public void editarPersona(Long idOriginal, Long idNew, String nuevoNombre, String nuevoApellido, int newEdad) {
        PersonaJpa personEdit = this.encontrarPersona(idOriginal);

        personEdit.setEdad(newEdad);
        personEdit.setId(idNew);
        personEdit.setNombre(nuevoNombre);
        personEdit.setApellido(nuevoApellido);

        this.guardarPersona(personEdit);
    }
}
