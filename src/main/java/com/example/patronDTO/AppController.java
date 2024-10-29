package com.example.demo.patronDTO;
import com.example.demo.patronDTO.DatosPersona;
import com.example.demo.patronDTO.Domicilio;
import com.example.demo.patronDTO.UniendoDatosDTOPattern;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController  {
    @GetMapping("/persona/{idPropiedad}")
    @ResponseBody
    public UniendoDatosDTOPattern dataPropiedad(@PathVariable int idPropiedad){

    Domicilio domi =
            new Domicilio(1,
                    "Alvear", 34);

    DatosPersona data_person =
            new DatosPersona(23, "Julian",
            "Alvarez","Carpintero",
            "soltero", 80.4 );

        UniendoDatosDTOPattern DTOpattern = new UniendoDatosDTOPattern();
        DTOpattern.setIdPropiedad(domi.getIdPropiedad());
        DTOpattern.setDireccion(domi.getDireccion());
        DTOpattern.setNum_depto(domi.getNum_depto());
        DTOpattern.setProfesion(data_person.getProfesion());
        DTOpattern.setNombre(data_person.getNombre());
        DTOpattern.setApellido(data_person.getApellido());
        DTOpattern.setEdad(data_person.getEdad());

        return DTOpattern;
}

}
