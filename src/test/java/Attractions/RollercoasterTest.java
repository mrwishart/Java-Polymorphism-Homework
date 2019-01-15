package Attractions;

import People.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor youngVisitor, shortVisitor, oldTallVisitor;

    @Before
    public void beforeEach(){
        rollercoaster = new Rollercoaster("Frank");
        youngVisitor = new Visitor(11, 145, 20.20);
        shortVisitor = new Visitor(12, 144, 25.50);
        oldTallVisitor = new Visitor(12, 145, 30.50);
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
}