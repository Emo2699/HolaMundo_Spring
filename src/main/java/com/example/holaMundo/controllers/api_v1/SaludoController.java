package com.example.holaMundo.controllers.api_v1;


import com.example.holaMundo.models.entities.Saludo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1") //Identifica a la clase como un recurso que puede ser utilizado por medio de una URL
public class SaludoController {

    //Especificamos el endPoint
    @GetMapping("saludo")
    public String sayHello(){
        return "Hola mundo desde un EndPoint de Spring";
    }

    @GetMapping("saludo2/{nombre}")
    public String sayHello2(@PathVariable String nombre){
        return "Como estas??? "+nombre;
    }


    @PostMapping("saludo3")
    public Saludo sayHello3(@RequestBody Saludo saludo){
        return saludo;
    }

    @PostMapping("saludo4")
    public Saludo sayHello3(@RequestBody String mensaje){
        Saludo saludo = new Saludo();
        saludo.setRemitente("App del spring jsjsjsjsjsj");
        saludo.setMensaje(mensaje);
        saludo.setDestinatario("Pal tio postman XD");
        return saludo;
    }
}
