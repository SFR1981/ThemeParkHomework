package ThemePark.stalls;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before() {
        iceCreamStall = new IceCreamStall("ColdMilq", "Scree Mice", "close to the drains");
    }

    @Test
    public void getName() {
        assertEquals("ColdMilq", iceCreamStall.getName());
    }

    @Test
    public void getOwnerName() {
        assertEquals("Scree Mice", iceCreamStall.getOwnerName());
    }

    @Test
    public void getParkingSpot() {
        assertEquals("close to the drains", iceCreamStall.getParkingSpot());
    }

    @Test

    public void getTicketPrice(){
        assertEquals(2.80 , iceCreamStall.defaultPrice(), 0);
    }
}