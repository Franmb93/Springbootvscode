package com.capgemini.restasync.dao;

import com.capgemini.restasync.entities.Persona;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaDao extends JpaRepository<Persona, Long>{
    
}
