import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class WaterBottleTest {
    WaterBottle waterBottle;
    @Before
        public void before(){waterBottle = new WaterBottle(100);}

    @Test
        public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }
    @Test
        public void takes10(){
        assertEquals(90, waterBottle.drink());
    }
    @Test
        public void emptysBottle(){
        assertEquals(0, waterBottle.empty());
    }
    @Test
        public void fillBottle(){
        WaterBottle emptyBottle = new WaterBottle(0);
        assertEquals(100, emptyBottle.fill());
    }


}
