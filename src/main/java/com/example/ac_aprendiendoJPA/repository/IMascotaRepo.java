package com.example.ac_aprendiendoJPA.repository;

import com.example.ac_aprendiendoJPA.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepo extends JpaRepository<Mascota,Long> {



}
