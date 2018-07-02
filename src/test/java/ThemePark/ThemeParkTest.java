package ThemePark;

import ThemePark.Attractions.Dodgems;
import ThemePark.Attractions.Park;
import ThemePark.Attractions.Playground;
import ThemePark.Attractions.Rollercoaster;
import ThemePark.stalls.IceCreamStall;
import ThemePark.stalls.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThemeParkTest {


    ThemePark themePark;
    TobaccoStall tobaccoStall;
    Rollercoaster rollercoaster;
    Dodgems dodgems;
    Visitor visitor;
    Park park;
    Playground playground;
    IceCreamStall iceCreamStall;

    @Before
    public void setUp() throws Exception {
        themePark = new ThemePark("ChundWorld");
        tobaccoStall = new TobaccoStall("Smokely", "Trumk", "C6");
        rollercoaster = new Rollercoaster("orbital zone");
        dodgems = new Dodgems("car force");
        visitor = new Visitor(12, 100, 9.00);
        park = new Park("greenland");
        playground = new Playground("playplace");
        iceCreamStall = new IceCreamStall("Mr Frosty", "Mr Frosty" , "near the bins");
    }

    @Test
    public void visit() {
    }

    @Test
    public void getiRevieweds() {
        themePark.addStall(tobaccoStall);
        themePark.addAttraction(rollercoaster);
        assertEquals(2, themePark.getiRevieweds().size());
    }

    @Test
    public void addAttraction() {
        themePark.addAttraction(rollercoaster);
        assertEquals(1, themePark.getAttractions());
    }

    @Test
    public void addStall() {
        themePark.addStall(tobaccoStall);
        assertEquals(1, themePark.getStalls());
    }





    @Test
    public void getAllAllowedFor() {
        themePark.addAttraction(dodgems);
        themePark.addAttraction(rollercoaster);
        themePark.addStall(tobaccoStall);
        themePark.addStall(iceCreamStall);

        assertEquals(2, themePark.getAllAllowedFor(visitor).size());
    }
}