
package combinatoria;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class CombinatoriaTest {
    private Combinatoria p;
    public CombinatoriaTest() {
    }
    
       @Before
    public void setUp() {
        
        p = new Combinatoria();
        
    }
    
    @Test
    public void pruebas(){
        int resultado = p.prueba(5, 3);
        int esperado = 10;
        assertEquals(esperado, resultado);
    }
    
    

}