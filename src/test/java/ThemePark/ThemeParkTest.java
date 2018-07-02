package ThemePark;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThemeParkTest {


    ThemePark themePark;

    @Before
    public void setUp() throws Exception {
        themePark = new ThemePark("ChundWorld");
    }

    @Test
    public void visit() {
    }

    @Test
    public void getiRevieweds() {
        assertEquals(0, themePark.getiRevieweds().size());
    }
}