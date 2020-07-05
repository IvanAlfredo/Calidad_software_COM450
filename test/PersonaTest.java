

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PersonaTest {
    
    private Persona p;
    
    public PersonaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
        
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        p = new Persona();
        
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testValidar() {
        
        assertEquals(true, p.Validar(20));
        
    }
    
}
