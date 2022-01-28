package com.capgemini.restasync.service.impl;

import java.util.List;

import com.capgemini.restasync.dao.IPersonaDao;
import com.capgemini.restasync.entities.Persona;
import com.capgemini.restasync.service.IPersonaService;

import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements IPersonaService{

    private IPersonaDao personaDao;

    // Se ha inyectado por constructor. 
    public PersonaServiceImpl(IPersonaDao personaDao) {
        this.personaDao = personaDao;
    }

    @Override
    public List<Persona> findAll() {
        return personaDao.findAll();
    }

    @Override
    public Persona findById(long id) {
        return personaDao.findById(id).get();
    }

    @Override
    public Persona save(Persona persona) {
        return personaDao.save(persona);
    }
    
    
}
