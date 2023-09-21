import com.codebase.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void canAdd() {
        int result = Calculator.add(2, 2);
        assertEquals(4, result);
    }
    @Test
    public void canAddDouble(){
        double result = Calculator.add(1.5, 2.7);
        assertEquals(4.2,result, 0.0);
    }
    @Test
    public void canSubtract() {
        int result = Calculator.subtract(4, 3);
        assertEquals(1, result);
    }
    @Test
    public void canMutliply() {
        int result = Calculator.multiply(4, 3);
        assertEquals(12, result);
    }
    @Test
    public void canDivide() {
        double result = Calculator.divide(4, 3);
        assertEquals(1.3333, result, 0.05);
    }
}
