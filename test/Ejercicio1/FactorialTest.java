/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carlos Guijuelo
 */
public class FactorialTest {
    
    public FactorialTest() {
    }
    
    /**
     * Test of calculo method, of class Factorial.
     */
    @Test
    public void testPrueba() {
        System.out.println("Prueba 1");
        int n = 5;
        int expResult = 120;
        int result = Factorial.calculo(n);
        assertEquals(expResult, result);
    }
    @Test(expected= IllegalArgumentException.class )
        public void testPrueba2() {
        int n = -1;
        System.out.println("Prueba 2, Número " + n + " no puede ser < 0");
        int result = Factorial.calculo(n);
    }
    @Test(expected=ArithmeticException.class )
        public void testPrueba3() {
        int n = 32;
        System.out.println("Prueba 3, Overflow, número " + n + " demasiado grande");
        int result = Factorial.calculo(n);

    }
}

