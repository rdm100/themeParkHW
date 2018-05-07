import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisiterTest {
    Visiter visiter;
    MagicCarpet MagicCarpet1;


    @Before
    public void before(){
        visiter = new Visiter(20, 200, 100.0);
    }

    @Test
    public void canGetAge(){
        assertEquals(20, visiter.getAge());
    }

    @Test
    public void canGetHeight(){
        assertEquals(200, visiter.getHeight());
    }

    @Test
    public void canGetMoney(){
        assertEquals(100.0, visiter.getMoney(), 0.01);
    }

    @Test
    public void canPayMoney(){
        MagicCarpet1 = new MagicCarpet(10.00, 100);
        visiter.payforRide(MagicCarpet1);
        assertEquals(90.00, visiter.getMoney(), 0.01);
    }

}
