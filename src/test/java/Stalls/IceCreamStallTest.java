package Stalls;

import People.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;
    Visitor visitor;

    @Before
    public void setUp() {
        iceCreamStall = new IceCreamStall("ice", "What", 5);
        visitor = new Visitor(25, 125, 25.55);
    }

    @Test
    public void defaultPrice() {
        assertEquals(2.80, iceCreamStall.defaultPrice(), 0.01);
    }

    @Test
    public void priceFor() {
        assertEquals(2.80, iceCreamStall.priceFor(visitor), 0.01);
    }
}