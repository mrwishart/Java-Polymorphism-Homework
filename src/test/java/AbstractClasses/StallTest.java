package AbstractClasses;

import Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void beforeEach(){
        candyFlossStall = new CandyFlossStall("Frank", "Robert", 2);
    }

    @Test
    public void getName() {
        assertEquals("Frank", candyFlossStall.getName());
    }

    @Test
    public void getOwnerName() {
        assertEquals("Robert", candyFlossStall.getOwnerName());
    }

    @Test
    public void getParkingSpot() {
        assertEquals(2, candyFlossStall.getParkingSpot());
    }

    @Test
    public void setName() {
        candyFlossStall.setName("Charlie");
        assertEquals("Charlie", candyFlossStall.getName());
    }

    @Test
    public void setOwnerName() {
        candyFlossStall.setOwnerName("Dennis");
        assertEquals("Dennis", candyFlossStall.getOwnerName());
    }

    @Test
    public void setParkingSpot() {
        candyFlossStall.setParkingSpot(25);
        assertEquals(25, candyFlossStall.getParkingSpot());
    }
}