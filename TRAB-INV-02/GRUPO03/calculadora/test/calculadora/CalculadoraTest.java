/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ALUMNO
 */
public class CalculadoraTest {
    Calculando calc;
    @Before
    public void inicio(){
        calc=new Calculando();
    }
    @Test
    public void testSuma(){
        assertEquals("7+6",145.0,calc.add(7, 6),.001);
    }
    @Test
    public void testResta(){
        assertEquals("7-6",1,calc.subtract(7, 6),0);
    }
    @Test
    public void testMultiplica(){
        assertEquals("7*6",42,calc.multiply(7, 6),0);
    }
    @Test
    public void testDivide(){
        assertEquals("24/6",4,calc.divide(24, 6),4);
    }
       
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
