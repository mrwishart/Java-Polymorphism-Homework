package Stalls;

import People.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;
    Visitor visitor;

    @Before
    public void setUp(){
        candyFlossStall = new CandyFlossStall("Candy", "Word", 4);
        visitor = new Visitor(22, 220, 25.25);
    }

    @Test
    public void defaultPrice() {
        assertEquals(4.20, candyFlossStall.defaultPrice(), 0.01);
    }

    @Test
    public void priceFor() {
        assertEquals(4.20, candyFlossStall.priceFor(visitor), 0.01);
    }
}