package com.example.demo.aprendiendoPost;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class MapearAlCliente {
    @GetMapping("/client/get")
    @ResponseBody
    public List<ClientTest> MapearClientes(){
        List<ClientTest> lista_Clientes = new ArrayList<ClientTest>();
        lista_Clientes.add(new ClientTest(33, "Osvaldo", "Guevara"));
        lista_Clientes.add(new ClientTest(23, "Matias", "ale"));
        lista_Clientes.add(new ClientTest(23, "Sergio", "Massa"));
        return lista_Clientes;
    }

}
@RestController
 class ResponseentityTest{

    @GetMapping("/testeandoResponse")
    ResponseEntity<String> TrayendoRespuestas(){

        return new ResponseEntity<>("Mensaje respuesta de R Entity", HttpStatus.OK);
    }
}