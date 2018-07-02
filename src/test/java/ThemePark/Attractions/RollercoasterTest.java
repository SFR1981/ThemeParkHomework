package ThemePark.Attractions;

import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        rollercoaster = new Rollercoaster("The big one");
        visitor
    }

    @Test
    public void getName() {
        assertEquals("The big one", rollercoaster.getName());
    }
}