package ThemePark.Attractions;

import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DodgemsTest {

    Dodgems dodgems;
    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("smashcars");
        visitor = new Visitor(6, 100, 9.00);
    }

    @Test
    public void getName() {
        assertEquals("smashcars", dodgems.getName());
    }

    @Test
    public void canGetRating(){
        assertEquals(0, dodgems.getRating());
    }

    @Test
    public void defaultPrice() {
        assertEquals(4.50, dodgems.defaultPrice(), 0);
    }

    @Test
    public void priceFor() {
        assertEquals(2.25, dodgems.priceFor(visitor), 0);
    }
}