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
public class CiudadTest {
    
    public CiudadTest() {
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
     * Test of anadirPoblacion method, of class Ciudad.
     */
    @Test
    public void testAnadirPoblacion_1() {
        System.out.println("Test anadirPoblacion Verdadero");
        int personas = 1500;
        String nombre = "Granada";
        Ciudad ciudad = new Ciudad("Granada", 1500, 1750);
        int expResult = 3000;
        int result = ciudad.anadirPoblacion(personas, nombre);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of anadirPoblacion method, of class Ciudad.
     */
    @Test
    public void testAnadirPoblacion_2() {
        System.out.println("Test anadirPoblacion Falso");
        int personas = 1500;
        String nombre = "Jaen";
        Ciudad ciudad = new Ciudad("Granada", 1500, 1750);
        int expResult = 1500;
        int result = ciudad.anadirPoblacion(personas, nombre);
        assertEquals(expResult, result);
    }

    /**
     * Test of restarPoblacion method, of class Ciudad.
     */
    @Test
    public void testRestarPoblacion_1() {
        System.out.println("Test restarPoblacion Verdadero");
        int personas = 500;
        String nombre = "Granada";
        Ciudad ciudad = new Ciudad ("Granada", 1500, 1750);
        int expResult = 1000;
        int result = ciudad.restarPoblacion(personas, nombre);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of restarPoblacion method, of class Ciudad.
     */
    @Test
    public void testRestarPoblacion_2() {
        System.out.println("Test restarPoblacion Falso");
        int personas = 500;
        String nombre = "Jaen";
        Ciudad ciudad = new Ciudad ("Granada", 1500, 1750);
        int expResult = 1500;
        int result = ciudad.restarPoblacion(personas, nombre);
        assertEquals(expResult, result);
    }

    /**
     * Test of fundacion method, of class Ciudad.
     */
    @Test
    public void testFundacion_1() {
        System.out.println("Test fundacion Verdadero");
        int anos = 2022;
        String nombre = "Granada";
        Ciudad instance = new Ciudad("Granada", 1500, 1750);
        int expResult = 272;
        int result = instance.fundacion(anos, nombre);
        assertEquals(expResult, result);
    }
    /**
     * Test of fundacion method, of class Ciudad.
     */
    @Test
    public void testFundacion_2() {
        System.out.println("Test fundacion Falso");
        int anos = 2022;
        String nombre = "Jaen";
        Ciudad instance = new Ciudad("Granada", 1500, 1750);
        int expResult = 1750;
        int result = instance.fundacion(anos, nombre);
        assertEquals(expResult, result);
    }
    
}
