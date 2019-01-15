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

    @Test
    public void initialRatingNegative1(){
        assertEquals(-1, dodgems.getRating());
    }

    @Test
    public void setRating() {
        dodgems.setRating(5);
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void cantSetRatingBelowZero(){
        dodgems.setRating(5);
        assertEquals(5, dodgems.getRating());
        dodgems.setRating(-1);
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void cantSetRatingAboveTen(){
        dodgems.setRating(5);
        assertEquals(5, dodgems.getRating());
        dodgems.setRating(11);
        assertEquals(5, dodgems.getRating());
    }
}