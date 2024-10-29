package com.example.demo.aprendiendoPost;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class aprendiendoPost {

    @PostMapping("/client")
   public void  PostCliente(@RequestBody ClientTest client){
//       System.out.println("Cliente creado con exito 😁");
//       System.out.println("Apellido del cliente: "+ client.getApellido());
//        System.out.println("Nombre del cliente: "+ client.getNombre());
    }





}
