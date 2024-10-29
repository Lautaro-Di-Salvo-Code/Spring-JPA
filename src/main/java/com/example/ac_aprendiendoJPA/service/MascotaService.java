package com.example.ac_aprendiendoJPA.service;

import com.example.ac_aprendiendoJPA.model.Mascota;
import com.example.ac_aprendiendoJPA.repository.IMascotaRepo;
import com.example.ac_aprendiendoJPA.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService implements IMascotaService{
    @Autowired
    private IMascotaRepo mascotaService;
    @Override
    public List<Mascota> obtenerMascota() {
        List<Mascota> getPet = mascotaService.findAll();
        return getPet;
    }

    @Override
    public void guardarMascota(Mascota pet) {
        mascotaService.save(pet);
    }

    @Override
    public void eliminarMascota(Long id) {
    mascotaService.deleteById(id);
    }

    @Override
    public Mascota encontrarMascota(Long id) {

        Mascota pet = mascotaService.findById(id).orElse(null);
        return pet;
    }

    @Override
    public void editMascota(Long idOriginal, Long idNew, String nombreNuevo, String razaNueva, int edad) {
        Mascota petEdit = this.encontrarMascota(idOriginal);
        petEdit.setId_mascota(idNew);
        petEdit.setNombre(nombreNuevo);
        petEdit.setEdad(edad);
        petEdit.setRaza(razaNueva);
        petEdit.setId_mascota(idOriginal);

        this.guardarMascota(petEdit);
    }
}
