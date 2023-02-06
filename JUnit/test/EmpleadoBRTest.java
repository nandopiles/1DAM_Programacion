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
 * @author Nando
 */
public class EmpleadoBRTest {
    
    public EmpleadoBRTest() {
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
     * Test of calcularSalarioBruto method, of class EmpleadoBR.
     */
    @Test
    public void testCalcularSalarioBruto() throws Exception {
        System.out.println("calcularSalarioBruto");
        TipoEmpleado tipo = null;
        float ventasMes = 0.0F;
        float horasExtra = 0.0F;
        EmpleadoBR instance = new EmpleadoBR();
        float expResult = 0.0F;
        float result = instance.calcularSalarioBruto(tipo, ventasMes, horasExtra);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularSalarioNeto method, of class EmpleadoBR.
     */
    @Test
    public void testCalcularSalarioNeto() throws Exception {
        System.out.println("calcularSalarioNeto");
        float salarioBruto = 360;
        EmpleadoBR instance = new EmpleadoBR();
        float expResult = 360;
        float result = instance.calcularSalarioNeto(salarioBruto);
        assertEquals(expResult, result, 0.0);
    }
    
}
