
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
    public void validar_x_mayor_n() {
        assertEquals(true, p.validar_x_mayor_n(9, 8));
    }
    
    @Test
    public void x_negativo() {
        assertEquals(true, p.x_negativo(5, 4));
    }
    
    @Test
    public void n_negativo() {
        assertEquals(true, p.x_negativo(6, 4));
    }
    
    @Test
    public void x_0_n_3() {
        assertEquals(true, p.x_0_n_3(3, 0));
    }
    
    @Test
    public void x_1_n_4() {
        assertEquals(true, p.x_1_n_4(4, 1));
    }
    
    @Test
    public void x_2_n_5() {
        assertEquals(true, p.x_2_n_5(5, 2));
    }
    
    @Test
    public void x_3_n_7() {
        assertEquals(true, p.x_3_n_7(7, 3));
    }
    
    @Test
    public void x_igual_n() {
        assertEquals(true, p.x_igual_n(3, 3));
    }
    
    @Test
    public void x_1_n_1() {
        assertEquals(true, p.x_1_n_1(1, 1));
    }

}