package ThemePark.Attractions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParkTest {

    Park park;

    @Before
    public void setUp() throws Exception {
        park = new Park("park");
    }

    @Test
    public void getName() {
        assertEquals("park", park.getName());
    }

    @Test
    public void canGetRating(){
        assertEquals(0, park.getRating());
    }
}