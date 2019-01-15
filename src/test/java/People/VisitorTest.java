package People;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        visitor = new Visitor(23, 175, 50.50);
    }

    @Test
    public void getAge() {
        assertEquals(23, visitor.getAge());
    }

    @Test
    public void getHeight() {
        assertEquals(175, visitor.getHeight());
    }

    @Test
    public void getMoney() {
        assertEquals(50.50, visitor.getMoney(), 0.01);
    }
}