/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 6jmati
 */
public class CalculadoraTest {

    public CalculadoraTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        /*System.out.println("suma");
        Calculadora instance = null;
        int expResult = 0;
        int result = instance.suma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/

        System.out.println("suma");
        Calculadora instance = new Calculadora(20, 10);
        int expResult = 30;
        int result = instance.suma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        /*System.out.println("resta");
        Calculadora instance = null;
        int expResult = 0;
        int result = instance.resta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
        Calculadora instance = new Calculadora(20, 10);
        int expResult = 10;
        int result = instance.resta();
        assertEquals(expResult, result);
    }

    /**
     * Test of multiplica method, of class Calculadora.
     */
    @Test
    public void testMultiplica() {
        /* System.out.println("multiplica");
        Calculadora instance = null;
        int expResult = 0;
        int result = instance.multiplica();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype."); */
        Calculadora instance = new Calculadora(20, 10);
        int expResult = 200;
        int result = instance.multiplica();
        assertEquals("Fallo en el producto", expResult, result);
    }

    /**
     * Test of divide method, of class Calculadora.
     */
    @Test
    public void testDivide() {
        /* System.out.println("divide");
        Calculadora instance = null;
        int expResult = 0;
        int result = instance.divide();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
        System.out.println("divide");
        try {
            Calculadora instance = new Calculadora(100, 0);
            int expResult = 10;
            int result = instance.divide();
            fail ("Fallo, debería lanzar la excepción");
            //assertEquals("Fallo en el producto", expResult, result);
        } catch(ArithmeticException e1) {
            System.out.println("Capturado");
        }
    }

}
