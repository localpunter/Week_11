import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(8, calculator.add(6,2));
    }

    @Test
    public void canSubtract(){
        assertEquals(4, calculator.subtract(6,2));
    }

    @Test
    public void canMultiply(){
        assertEquals(12, calculator.multiply(6,2));
    }

    @Test
    public void canDivide(){
        assertEquals(3, calculator.divide(6,2));
    }
}
