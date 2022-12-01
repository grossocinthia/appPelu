
package com.example.aplicacion.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table (name= "animal")
public class Animal extends Common{
    
    private String imagen;
    private String nombreAnimal;
    @Column (length= 1500)
    private String descripcion;
    private String humor;
    private String edad;
    private String raza;
    
    
 
    @ManyToOne
    @JoinColumn(name="peluqueria_id")
    @JsonProperty(access = Access.WRITE_ONLY )
    private Peluqueria peluqueria;
    
 public Animal(){
    }

    public Animal(Peluqueria peluqueria) {
        this.peluqueria = peluqueria;
    }

         
    public Animal(String imagen,String nombreAnimal, String descripcion, String humor, String edad, String raza) {
        this.imagen = imagen;
        this.nombreAnimal = nombreAnimal;
        this.descripcion = descripcion;
         this.humor = humor;
        this.edad = edad;
        this.raza = raza;
      
      
        
        
    }
    
}