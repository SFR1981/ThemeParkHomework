package ThemePark.Attractions;

import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp() throws Exception {
        rollercoaster = new Rollercoaster("The big one", 5);
        visitor = new Visitor(11,150,12.00);
        visitor2 = new Visitor(15, 150, 12.00);
        visitor3 = new Visitor(15, 250, 12.00);
    }

    @Test
    public void getName() {
        assertEquals("The big one", rollercoaster.getName());
    }

    @Test
    public void isNotAllowedTo() {
        assertEquals(false, rollercoaster.isAllowedTo(visitor));
    }

    @Test
    public void isTotallyAllowedTo(){
        assertEquals(true, rollercoaster.isAllowedTo(visitor2));
    }

    @Test
    public void canGetRating(){
        assertEquals(5, rollercoaster.getRating());
    }

    @Test
    public void defaultPrice() {
        assertEquals(8.40, rollercoaster.defaultPrice(), 0.01);
    }

    @Test
    public void priceFor() {
        assertEquals(16.80, rollercoaster.priceFor(visitor3), 0.01);
    }
}