package com.capgemini.restasync.controllers;

import java.util.List;

import com.capgemini.restasync.entities.Persona;
import com.capgemini.restasync.service.IPersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
public class MainController {
    
    @Autowired
    private IPersonaService personaService;

    @GetMapping
    public ResponseEntity<List<Persona>> findAll(){
        return new ResponseEntity<List<Persona>>(personaService.findAll(), HttpStatus.OK);
    }

    @GetMapping("personas/{id}")
    public ResponseEntity<Persona> findById(@PathVariable long id){
        Persona persona = personaService.findById(id);

        return new ResponseEntity<Persona>(persona, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Persona> save(@RequestBody Persona persona){
        return new ResponseEntity<Persona>(personaService.save(persona), HttpStatus.OK);
    }
}
