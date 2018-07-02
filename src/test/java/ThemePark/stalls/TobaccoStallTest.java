package ThemePark.stalls;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Sir Smokealot", "Marting Pipes", "near the bins");
    }

    @Test
    public void canGetName() {
        assertEquals("Sir Smokealot", tobaccoStall.getName());
    }

    @Test
    public void getOwnerName() {
        assertEquals("Marting Pipes", tobaccoStall.getOwnerName());
    }

    @Test
    public void getParkingSpot() {
        assertEquals("near the bins", tobaccoStall.getParkingSpot());
    }
}