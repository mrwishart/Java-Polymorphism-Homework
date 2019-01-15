package AbstractClasses;

import Attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AttractionTest {

    Dodgems dodgems;

    @Before
    public void setUp(){
        dodgems = new Dodgems("Frank");
    }

    @Test
    public void getName() {
        assertEquals("Frank", dodgems.getName());
    }

    @Test
    public void setName() {
        dodgems.setName("Randy");
        assertEquals("Randy", dodgems.getName());
    }
}