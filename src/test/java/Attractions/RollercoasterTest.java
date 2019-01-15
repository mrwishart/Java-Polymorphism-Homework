package Attractions;

import People.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor youngVisitor, shortVisitor, oldTallVisitor, reallyTallVisitor;

    @Before
    public void beforeEach(){
        rollercoaster = new Rollercoaster("Frank");
        youngVisitor = new Visitor(11, 145, 20.20);
        shortVisitor = new Visitor(12, 144, 25.50);
        oldTallVisitor = new Visitor(12, 145, 30.50);
        reallyTallVisitor = new Visitor(15, 201, 50.50);
    }

    @Test
    public void isAllowedTo() {
        assertTrue(rollercoaster.isAllowedTo(oldTallVisitor));
    }

    @Test
    public void tooShort() {
        assertFalse(rollercoaster.isAllowedTo(shortVisitor));
    }

    @Test
    public void tooYoung() {
        assertFalse(rollercoaster.isAllowedTo(youngVisitor));
    }

    @Test
    public void defaultPrice() {
        assertEquals(8.40, rollercoaster.defaultPrice(), 0.01);
    }

    @Test
    public void priceForShort() {
        assertEquals(8.40, rollercoaster.priceFor(shortVisitor), 0.01);
    }

    @Test
    public void priceForTall() {
        assertEquals(16.80, rollercoaster.priceFor(reallyTallVisitor), 0.01);
    }
}