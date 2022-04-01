package com.itesm.komorebi.controllers;

import com.itesm.komorebi.models.Persona;
import com.itesm.komorebi.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/persona")
public class PersonaController {
    @Autowired
    PersonaService personaService;

    @GetMapping("/perfil")
    public Persona getPerfil(){
        Persona p = new Persona();
        p.setNombre("Andrea");
        p.setEdad(32);
        return p;
    }
    @PostMapping("/registrar")
    public Persona registrarPersona(@RequestBody Persona persona){
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        return persona;
    }

    @PostMapping("/cumplir-anios")
    public Persona cumplirAnios(@RequestBody Persona persona){
        personaService.cumplirAnios(persona);
        return persona;
    }

    @GetMapping("/todos")
    public List<Persona> obtenerTodos(){
        return personaService.getAll();
    }
    @GetMapping("/obtener/{id}")
    public Persona findById(@PathVariable("id") int id){
        return personaService.getById(id);
    }
}
