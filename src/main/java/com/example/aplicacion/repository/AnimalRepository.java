
package com.example.aplicacion.repository;

import com.example.aplicacion.model.Animal;
import org.springframework.stereotype.Repository;

 @Repository
public interface AnimalRepository extends CommonRepository <Animal, Long>{
    
}