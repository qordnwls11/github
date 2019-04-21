import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {

    private CustomCalculator cal = new CustomCalculator();

    @Test
    public void testAdd(){
        int result = cal.add(3,4);
        assertTrue(result == 7);

    }


    @Test
    public void testMinus(){
        int result = cal.subtract(4,3);
        assertTrue(result == 1);
    }
}