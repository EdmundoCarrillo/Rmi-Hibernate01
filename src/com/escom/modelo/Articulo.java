package com.escom.modelo;
// Generated 17/06/2015 02:09:52 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Articulo generated by hbm2java
 */
public class Articulo  implements java.io.Serializable {


     private Integer idarticulo;
     private String nombre;
     private int existencia;
     private double precio;
     private Set movArticulos = new HashSet(0);

    public Articulo() {
    }

	
    public Articulo(String nombre, int existencia, double precio) {
        this.nombre = nombre;
        this.existencia = existencia;
        this.precio = precio;
    }
    public Articulo(String nombre, int existencia, double precio, Set movArticulos) {
       this.nombre = nombre;
       this.existencia = existencia;
       this.precio = precio;
       this.movArticulos = movArticulos;
    }
   
    public Integer getIdarticulo() {
        return this.idarticulo;
    }
    
    public void setIdarticulo(Integer idarticulo) {
        this.idarticulo = idarticulo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getExistencia() {
        return this.existencia;
    }
    
    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
    public double getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public Set getMovArticulos() {
        return this.movArticulos;
    }
    
    public void setMovArticulos(Set movArticulos) {
        this.movArticulos = movArticulos;
    }




}

