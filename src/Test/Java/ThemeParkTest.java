import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark1;
    Rollercoaster rollercoaster1;
    Rollercoaster rollercoaster2;
    Dodgems dodgems1;
    MagicCarpet magicCarpet1;

    @Before
    public void before() {
        themePark1 = new ThemePark("Disney", 3);
        rollercoaster1 = new Rollercoaster(5.00, 100);
        rollercoaster2 = new Rollercoaster(5.00, 100);
        dodgems1 = new Dodgems(5.00, 100);
        magicCarpet1 = new MagicCarpet(5.00, 100);
    }

    @Test
    public void hasName() {
        assertEquals("Disney", themePark1.getName());
    }

    @Test
    public void themeParkStartsEmpty() {
        assertEquals(0, themePark1.rideCount());
    }

    @Test
    public void canAddRollercoaster() {
        themePark1.addRide(rollercoaster1);
        assertEquals(1, themePark1.rideCount());
    }

    @Test
    public void canAddDodgems() {
        themePark1.addRide(dodgems1);
        assertEquals(1, themePark1.rideCount());
    }

    @Test
    public void removeAllRides() {
        themePark1.addRide(rollercoaster1);
        themePark1.addRide(rollercoaster2);
        themePark1.removeRides();
        assertEquals(0, themePark1.rideCount());
}


    @Test
    public void cannotAddRideParkFull() {
        themePark1.addRide(rollercoaster1);
        themePark1.addRide(rollercoaster2);
        themePark1.addRide(dodgems1);
        themePark1.addRide(magicCarpet1);
        assertEquals(3, themePark1.rideCount());

    }


}
