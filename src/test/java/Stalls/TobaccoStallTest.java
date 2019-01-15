package Stalls;

import People.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor youngVisitor, oldVisitor;

    @Before
    public void setUp(){
        tobaccoStall = new TobaccoStall("Shop", "Mark", 5);
        youngVisitor = new Visitor(17, 175, 50.50);
        oldVisitor = new Visitor(18, 176, 98.25);

    }

    @Test
    public void isAllowedTo() {
        assertTrue(tobaccoStall.isAllowedTo(oldVisitor));
    }

    @Test
    public void isNotAllowedTo() {
        assertFalse(tobaccoStall.isAllowedTo(youngVisitor));
    }
}