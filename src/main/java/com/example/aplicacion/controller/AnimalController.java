
package com.example.aplicacion.controller;

import com.example.aplicacion.model.Animal;
import com.example.aplicacion.service.AnimalService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping (path= "aplicacion/animal")
public class AnimalController extends CommonControllerImpl <Animal, AnimalService> {
    
    
}