
package com.example.aplicacion.repository;


import com.example.aplicacion.model.Common;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CommonRepository <E extends Common, ID extends Serializable> extends JpaRepository <E , ID>{
    
}