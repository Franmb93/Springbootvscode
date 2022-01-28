package com.capgemini.restasync.service;

import java.util.List;

import com.capgemini.restasync.entities.Persona;

public interface IPersonaService {
    public List<Persona> findAll();
    public Persona findById(long id);
    public Persona save(Persona persona);
}
