
package com.example.aplicacion.controller;

import com.example.aplicacion.model.Peluqueria;
import com.example.aplicacion.service.PeluqueriaService;
import org.springframework.web.bind.annotation.CrossOrigin;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping (path= "aplicacion/peluqueria")
public class PeluqueriaController extends CommonControllerImpl <Peluqueria, PeluqueriaService> {}
    