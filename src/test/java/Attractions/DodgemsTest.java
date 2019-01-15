package Attractions;

import People.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DodgemsTest {

    Dodgems dodgems;
    Visitor youngVisitor, oldVisitor;

    @Before
    public void beforeEach() {
        dodgems = new Dodgems("Dodge");
        youngVisitor = new Visitor(11, 145, 50.50);
        oldVisitor= new Visitor(12, 145, 50.50);
    }

    @Test
    public void defaultPrice() {
        assertEquals(4.50, dodgems.defaultPrice(), 0.01);
    }

    @Test
    public void priceForYoung() {
        assertEquals(2.25, dodgems.priceFor(youngVisitor), 0.01);
    }

    @Test
    public void priceForOld() {
        assertEquals(4.5, dodgems.priceFor(oldVisitor), 0.01);
    }
}