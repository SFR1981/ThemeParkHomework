package ThemePark.stalls;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before() {
        candyFlossStall = new CandyFlossStall("Fluff sticks", "Mandy Cross", "near the bins", 5);
    }

    @Test
    public void getName() {
        assertEquals("Fluff sticks", candyFlossStall.getName());
    }

    @Test
    public void getOwnerName() {
        assertEquals("Mandy Cross", candyFlossStall.getOwnerName());
    }

    @Test
    public void getParkingSpot() {
        assertEquals("near the bins", candyFlossStall.getParkingSpot());
    }

    @Test
    public void getRating(){
        assertEquals(5, candyFlossStall.getRating());
    }
}