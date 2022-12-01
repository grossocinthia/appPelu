
package com.example.aplicacion.service;

import com.example.aplicacion.model.Common;
import java.io.Serializable;
import java.util.List;

public interface ICommonService<E extends Common, ID extends Serializable> {
    
       
    public List <E> verE();
    
    public void agregarE (E e);
    
    public void borrarE(ID id);
    
    public E buscarE (ID id); 
    
    public E editarE (E e);
    
 
    
}