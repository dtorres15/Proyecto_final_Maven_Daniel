/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.proyecto_final_maven_daniel;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Javier
 */
public class PoblacionTest {
    
    public PoblacionTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
   

    /**
     * Test of edadMediaCiudad method, of class Poblacion.
     */
    @Test
    public void testEdadMediaCiudad_1() {
        System.out.println("Test edadMediaCiudad Verdadero");
        Ciudad ciudad = new Ciudad("Granada", 1500, 1750);
        Poblacion persona = new Poblacion("Ibai", 20, ciudad);
        Poblacion persona1 = new Poblacion("Paco", 42, ciudad);
        Poblacion persona2 = new Poblacion("Manuel", 80, ciudad);
        Poblacion persona3 = new Poblacion("Daniel", 22, ciudad);
        String nombreCiudad = "Granada";
        
        int expResult = 41;
        double result = persona.edadMediaCiudad(nombreCiudad, ciudad, persona, persona1,persona2,persona3);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of edadMediaCiudad method, of class Poblacion.
     */
    @Test
    public void testEdadMediaCiudad_2() {
        System.out.println("Test edadMediaCiudad Falso");
        Ciudad ciudad = new Ciudad("Granada", 1500, 1750);
        Poblacion persona = new Poblacion("Ibai", 20, ciudad);
        Poblacion persona1 = new Poblacion("Paco", 42, ciudad);
        Poblacion persona2 = new Poblacion("Manuel", 80, ciudad);
        Poblacion persona3 = new Poblacion("Daniel", 22, ciudad);
        String nombreCiudad = "Jaen";
        
        int expResult = 0;
        double result = persona.edadMediaCiudad(nombreCiudad, ciudad, persona, persona1,persona2,persona3);
        assertEquals(expResult, result);
    }
    
}
