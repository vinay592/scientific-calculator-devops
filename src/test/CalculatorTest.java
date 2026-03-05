import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest
{
    @Test
    public void testSquareRoot()
    {
        assertEquals(4.0, Calculator.squareRoot(16), 0.001);
    }

    @Test
    public void testFactorial()
    {
        assertEquals(120, Calculator.factorial(5));
    }

    @Test
    public void testNaturalLog()
    {
        assertEquals(1.0, Calculator.naturalLog(Math.E), 0.001);
    }

    @Test
    public void testPower()
    {
        assertEquals(8.0, Calculator.power(2,3), 0.001);
    }
}
