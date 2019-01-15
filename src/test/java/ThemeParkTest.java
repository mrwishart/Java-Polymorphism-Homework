import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThemeParkTest {

    ThemePark themePark;

    @Before
    public void setUp(){
        themePark = new ThemePark();
    }


    @Test
    public void getAllReviewed() {
        assertEquals(0, themePark.getAllReviewed().size());
    }
}