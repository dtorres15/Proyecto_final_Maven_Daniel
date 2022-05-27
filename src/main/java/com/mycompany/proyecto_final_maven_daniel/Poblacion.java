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
        this.ciudad = ciudad;
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

    public double edadMediaCiudad(String nombreCiudad, Ciudad ciudad, Poblacion persona,Poblacion persona1,Poblacion persona2,Poblacion persona3) {
        double media = 0;

        if (nombreCiudad.equals(ciudad.getNombreCiudad())) {
            media = (persona.getEdad() + persona1.getEdad() + persona2.getEdad() + persona3.getEdad()) / 4 ;
        } else {
            media = 0;
        }
        return media;
    }
}
