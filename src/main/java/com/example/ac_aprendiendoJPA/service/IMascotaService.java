package com.example.ac_aprendiendoJPA.service;

import com.example.ac_aprendiendoJPA.model.Mascota;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IMascotaService {
//    De acá de van a obtener los metodos http para hacer el crud completo
    public List<Mascota> obtenerMascota();
    public void  guardarMascota(Mascota pet);

    public void eliminarMascota(Long id);

    public Mascota encontrarMascota(Long id);

    public  void editMascota(Long idOriginal, Long idNew,String nombreNuevo, String razaNueva, int edad);

}
