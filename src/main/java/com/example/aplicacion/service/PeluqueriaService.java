
package com.example.aplicacion.service;

import com.example.aplicacion.model.Peluqueria;
import com.example.aplicacion.repository.CommonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.aplicacion.repository.PeluqueriaRepository;

@Service
public class PeluqueriaService extends CommonServiceImpl <Peluqueria, Long> implements IPeluqueriaService{

    @Autowired
    private PeluqueriaRepository pelurepo;
    
    public PeluqueriaService(CommonRepository <Peluqueria, Long> commonRepository){
        
    super(commonRepository);
    }
}
   