import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagicCarpetTest {

    MagicCarpet MagicCarpet1;
    Visiter visiter1;


    @Before
    public void before(){
        MagicCarpet1 = new MagicCarpet(5.00, 100);
    }

    @Test
    public void canGetPrice(){
        assertEquals(5.00, MagicCarpet1.getPrice(), 0.01);
    }

    @Test
    public void canGetMinHeight(){
        assertEquals(100, MagicCarpet1.getMinHeight());
    }

    @Test
    public void visiterCanRide(){
        visiter1 = new Visiter(20, 200, 100.0);
        assertEquals(true, MagicCarpet1.checkRide(visiter1));
    }
    @Test
    public void visiterTooSmall(){
        visiter1 = new Visiter(20, 90, 100.00);
        assertEquals(false, MagicCarpet1.checkRide(visiter1));
    }
    @Test
    public void visiterNotEnoughMoney(){
        visiter1 = new Visiter(20, 200, 4.0);
        assertEquals(false, MagicCarpet1.checkRide(visiter1));
    }
}
