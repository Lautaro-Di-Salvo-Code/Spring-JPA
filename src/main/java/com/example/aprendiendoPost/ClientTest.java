package com.example.demo.aprendiendoPost;

import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class ClientTest {
     private int id;
     private String nombre;
     private String  apellido;

     public ClientTest() {
     }

     public ClientTest(int id, String nombre, String apellido) {
          this.id = id;
          this.nombre = nombre;
          this.apellido = apellido;
     }
}