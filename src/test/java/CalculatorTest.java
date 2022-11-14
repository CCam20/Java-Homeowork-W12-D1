import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    public int num1 = 1;
    public int num2 = 2;
    public int num3 = 3;
    public int num4 = 4;

    @Test public void addsNumbers(){
        assertEquals(4, Calculator.add(num2, num2));
    }
    @Test public void subtractsNumbers(){
        assertEquals(2, Calculator.subtract(num4, num2));
    }
    @Test public void multiplysNumbers(){
        assertEquals(2, Calculator.multiply(num1, num2));
    }
    @Test public void dividesNumbers(){
        assertEquals(2, Calculator.divide(num4, num2));
    }
}
