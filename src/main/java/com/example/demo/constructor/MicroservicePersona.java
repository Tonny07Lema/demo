package com.example.demo.constructor;


import com.example.demo.interfaces.InterFacePersona;
import com.example.demo.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/persona")
public class MicroservicePersona {

    @Autowired
    private InterFacePersona interFacePersona;
    @PostMapping( "/crear")
    public Persona add(@RequestBody Persona val) {
        return interFacePersona.save(val);
    }


    @GetMapping(path = "/listar")
    public List<Persona> views(){
        return (List<Persona>) interFacePersona.findAll();
    }

}
