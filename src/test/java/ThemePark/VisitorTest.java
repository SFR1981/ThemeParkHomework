package ThemePark;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(23, 190, 5.20);
    }

    @Test
    public void getAge() {
        assertEquals(23, visitor.getAge());
    }

    @Test
    public void getHeight() {
        assertEquals(190, visitor.getHeight());
    }

    @Test
    public void getMoney() {
        assertEquals(5.20, visitor.getMoney(), 00.02);
    }
}