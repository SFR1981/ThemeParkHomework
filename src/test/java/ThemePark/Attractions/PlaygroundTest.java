package ThemePark.Attractions;

import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void before() {
        playground = new Playground("PlayDays", 6);
        visitor = new Visitor(16, 100, 4.00);
        visitor2 = new Visitor(12, 100, 4.00);
    }

    @Test
    public void getName() {
        assertEquals("PlayDays", playground.getName());
    }

    @Test
    public void tooOldisAllowedTo() {
        assertEquals(false , playground.isAllowedTo(visitor));
    }

    @Test
    public void notTooOldisAllowedTo(){
        assertEquals(true,playground.isAllowedTo(visitor2));
    }
    @Test
    public void canGetRating(){
        assertEquals(6, playground.getRating());
    }
}