package com.example.ac_aprendiendoJPA.repository;

import com.example.ac_aprendiendoJPA.model.PersonaJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository <PersonaJpa,Long> {
}
