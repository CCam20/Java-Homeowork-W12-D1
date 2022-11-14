import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PrinterTest {
    Printer printer;
    @Before
        public void before(){printer = new Printer(20, 50);}

    @Test
        public void prints(){
        assertEquals(18, printer.print(2));
    }
    @Test
        public void usesToner(){
        assertEquals(48, printer.reduceToner(2));
    }

}
