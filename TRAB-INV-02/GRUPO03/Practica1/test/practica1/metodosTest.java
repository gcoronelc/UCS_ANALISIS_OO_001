
package practica1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class metodosTest {
    
    public metodosTest() {
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
     * Test of clasificacion method, of class metodos.
     */
    @Test
    public void testClasificacion() {
        System.out.println("clasificacion");
        String tipo = "niños";
        metodos instance = new metodos();
        String expResult = "E todo el publico";
        String result = instance.clasificacion(tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of precioenvio method, of class metodos.
     */
    @Test
    public void testPrecioenvio() {
        System.out.println("precioenvio");
        double precio = 300.0;
        metodos instance = new metodos();
        double expResult = 399.0;
        double result = instance.precioenvio(precio);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
      if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }
    
}
