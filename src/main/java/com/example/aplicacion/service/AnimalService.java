
package com.example.aplicacion.service;

import com.example.aplicacion.model.Animal;
import com.example.aplicacion.repository.CommonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.aplicacion.repository.AnimalRepository;

@Service
public class AnimalService extends CommonServiceImpl <Animal, Long> implements IAnimalService {

 @Autowired
    private AnimalRepository animalrepo;
    
    public AnimalService(CommonRepository <Animal, Long> commonRepository){
        
    super(commonRepository);
    }
    
}
