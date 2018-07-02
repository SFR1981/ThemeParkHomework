package ThemePark.stalls;

import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Sir Smokealot", "Marting Pipes", "near the bins");
        visitor = new Visitor(14, 100, 7.00);
        visitor2 = new Visitor( 19, 200, 14.00);
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

    @Test
    public void isAllowedTo() {
        assertEquals(true, tobaccoStall.isAllowedTo(visitor2));
    }

    @Test
    public void isNotAllowedTo(){
        assertEquals(false, tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void canGetRating(){
        assertEquals(0, tobaccoStall.getRating());
    }
}