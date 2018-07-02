package ThemePark.Attractions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("smashcars");
    }

    @Test
    public void getName() {
        assertEquals("smashcars", dodgems.getName());
    }
}