package com.example.ac_aprendiendoJPA.service;


import com.example.ac_aprendiendoJPA.model.PersonaJpa;

import java.util.List;

public interface IPersonaService {

    public List<PersonaJpa> obtenerPersona();
    public void guardarPersona (PersonaJpa person );

    public void deletePersona (Long id);

    public PersonaJpa encontrarPersona(Long id);

    public void editarPersona(Long idOriginal, Long idNew, String nuevoNombre, String nuevoApellido, int newEdad);

    void editPersona(PersonaJpa e);
}
