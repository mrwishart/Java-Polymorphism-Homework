package Attractions;

import People.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlaygroundTest {

    Playground playground;
    Visitor youngVisitor, oldVisitor;

    @Before
    public void beforeEach(){
        playground = new Playground("The Playground");
        youngVisitor = new Visitor(14, 125, 20.20);
        oldVisitor = new Visitor(15, 145, 56.50);
    }

    @Test
    public void isAllowedTo() {
        assertTrue(playground.isAllowedTo(oldVisitor));
    }

    @Test
    public void isNotAllowedTo(){
        assertFalse(playground.isAllowedTo(youngVisitor));
    }
}