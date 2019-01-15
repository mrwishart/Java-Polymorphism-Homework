import Attractions.Park;
import Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThemeParkTest {

    ThemePark themePark;
    Park park;
    CandyFlossStall candyFlossStall;

    @Before
    public void setUp(){
        themePark = new ThemePark();
        park = new Park("Park");
        candyFlossStall = new CandyFlossStall("Candy", "Frank", 2);
    }

    @Test
    public void numberOfShows() {
        assertEquals(0, themePark.numberOfShows());
    }

    @Test
    public void addStall() {
        themePark.addEntertainment(candyFlossStall);
        assertEquals(1, themePark.numberOfShows());
    }

    @Test
    public void addAttraction() {
        themePark.addEntertainment(park);
        assertEquals(1, themePark.numberOfShows());
    }

    @Test
    public void numberOfStalls() {
        themePark.addEntertainment(candyFlossStall);
        themePark.addEntertainment(candyFlossStall);
        themePark.addEntertainment(candyFlossStall);
        themePark.addEntertainment(park);
        themePark.addEntertainment(park);
        assertEquals(3, themePark.numberOfStalls());
    }

    @Test
    public void numberOfAttractions() {
        themePark.addEntertainment(candyFlossStall);
        themePark.addEntertainment(candyFlossStall);
        themePark.addEntertainment(candyFlossStall);
        themePark.addEntertainment(park);
        themePark.addEntertainment(park);
        assertEquals(2, themePark.numberOfAttractions());
    }

    @Test
    public void getAllReviewed() {
        candyFlossStall.setRating(8);
        themePark.addEntertainment(candyFlossStall);
        themePark.addEntertainment(park);
        assertEquals(1, themePark.getAllReviewed().size());
        park.setRating(5);
        assertEquals(2, themePark.getAllReviewed().size());
    }
}