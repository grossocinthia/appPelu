
package com.example.aplicacion.model;



import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table (name= "peluqueria")

public class Peluqueria extends Common{
    
    private String imagen;
    private String nombre;
    private String backimagen;
    private String titulos;
    private String telefono;
    private String ubicacion;
    @Column (length= 1500)
    private String acerca;
    
  @OneToMany(mappedBy="peluqueria", cascade =CascadeType.ALL)
    private Set<Animal> animal = new HashSet<>();


 
    public Peluqueria(){
    }
    
    public Peluqueria (String nombre, String imagen,String backimagen, String titulos, String telefono, String ubicacion, String acerca){
       
        this.backimagen = backimagen;
        this.nombre = nombre;
        this.titulos = titulos;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
        this.acerca = acerca;
        this.imagen = imagen;
    }

   
    
    
}