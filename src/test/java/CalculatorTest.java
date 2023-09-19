import com.codebase.Calculator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;
    @Before
    public void before() {
        calculator = new Calculator();
    }
    @Test
    public void canAdd() {
        int result = calculator.Add(2, 2);
        assertEquals(4, result);
    }
    @Test
    public void canSubtract() {
        int result = calculator.Subtract(4, 3);
        assertEquals(1, result);
    }
    @Test
    public void canMutliply() {
        int result = calculator.Multiply(4, 3);
        assertEquals(12, result);
    }
    @Test
    public void canDivide() {
        double result = calculator.Divide(4, 3);
        assertEquals(1.3333, result, 0.05);
    }
}
