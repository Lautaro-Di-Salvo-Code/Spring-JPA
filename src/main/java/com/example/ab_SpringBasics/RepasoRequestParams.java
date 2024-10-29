package com.example.demo.ab_SpringBasics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RepasoRequestParams {
    @GetMapping("/1")
//    @RequestParam  desde el url con notacion /url?valor=..&valor2=..
//    permite definir un valor desde la url
//    esto permite hacer muchas cosas como operaciones
    public String cosas_a_Repasar(@RequestParam String algo, int data){
        String saludo = "Mi nombre es Rodrigo y estoy escribiendo un texto";
        return  "Buenos dias" + algo + data;



    }

}










