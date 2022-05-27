/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_final_maven_daniel;

/**
 *
 * @author Daniel
 */
public class Poblacion {
    private String nombre;
    private int edad;
    private Ciudad ciudad;

    public Poblacion(String nombre, int edad, Ciudad ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad= ciudad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }
    
    public int edadMediaCiudad(String nombreCiudad){
        Ciudad ciudad= new Ciudad("Granada", 1500, 1750);
        
        Poblacion persona= new Poblacion("Ibai", 20, ciudad);
        Poblacion persona1= new Poblacion("Paco", 42, ciudad);
        Poblacion persona2= new Poblacion("Manuel", 80, ciudad);
        Poblacion persona3= new Poblacion("Daniel", 22, ciudad);
        
        int media=0;
        
        if (nombreCiudad.equals(ciudad.getNombreCiudad())){
            media= (persona.getEdad()+persona1.getEdad()+persona2.getEdad()+persona3.getEdad()) / 4 * 100;
        }else {
            media=0;
        }
        return media;
    }
    
    
}
