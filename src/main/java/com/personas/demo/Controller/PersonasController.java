package com.personas.demo.Controller;

import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.*;
import com.personas.demo.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("personas")
public class PersonasController {
    List<Persona> personas = new ArrayList<>();
    @GetMapping("/saludar/{edad}")

    public String saludar(@RequestParam String nombre, @PathVariable Integer edad){
        return ("hola  " + nombre+" tu edad es de " +edad);
    }
    @GetMapping("/consultar/todos")
    public List<Persona> consultarTodo(){
        return personas;

    }


    @PostMapping("/registro")

    public Persona registrarPersona(@RequestBody Persona persona){
        System.out.println("Los datos de la persona a registrar son ");
        System.out.println(persona.nombre);
        System.out.println(persona.edad);
        System.out.println(persona.sexo);

        Random random = new Random();
        persona.id = random.nextInt();
        personas.add(persona);

        return persona;
    }
    @GetMapping("/comprobar/{id}")
    public Persona comprobaridPersona(@RequestParam Integer id){

        return null;
    }
}


