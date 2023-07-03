package com.example.demo.interfaces;


import com.example.demo.model.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterFacePersona extends CrudRepository<Persona,Long> {

}
