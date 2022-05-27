/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_final_maven_daniel;

/**
 *
 * @author Daniel
 */
public class Ciudad {

    private String nombreCiudad;
    private int poblacion, anoFundacion;

    public Ciudad(String nombreCiudad, int poblacion, int anoFundacion) {
        this.nombreCiudad = nombreCiudad;
        this.poblacion = poblacion;
        this.anoFundacion = anoFundacion;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public int getAnoFundacion() {
        return anoFundacion;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public void setAnoFundacion(int anoFundacion) {
        this.anoFundacion = anoFundacion;
    }

    public int anadirPoblacion(int personas, String nombre) {
        int personasCiudad = getPoblacion();

        if (nombre.equals(getNombreCiudad())) {
            personasCiudad = getPoblacion() + personas;
        } else {
            personasCiudad = getPoblacion();
        }
        return personasCiudad;
    }
    
    public int restarPoblacion(int personas, String nombre) {
        int personasCiudad = getPoblacion();

        if (nombre.equals(getNombreCiudad())) {
            personasCiudad = getPoblacion() - personas;
        } else {
            personasCiudad = getPoblacion();
        }
        return personasCiudad;
    }
    
    public int fundacion(int anos, String nombre) {
        int fundacion = getAnoFundacion();
        
        if (nombre.equals(getNombreCiudad())) {
            fundacion = anos - getAnoFundacion();
        }else {
            fundacion = getAnoFundacion();
        }
        return fundacion;
    }

}
