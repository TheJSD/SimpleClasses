import com.codebase.WaterBottle;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class WaterBottleTest {
    private WaterBottle waterBottle;
    @Before
    public void before() {
        waterBottle = new WaterBottle();
    }
    @Test
    public void canGetVolume() {
        assertEquals(100, waterBottle.getVolume());
    }
    @Test
    public void canDrink() {
        int i = 0;
        while (i < 3) {
            waterBottle.drink();
            i++;
        }
        assertEquals(70, waterBottle.getVolume());
    }
    @Test
    public void canEmpty() {
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }
    @Test
    public void canFill() {
        int i = 0;
        while (i < 3) {
            waterBottle.drink();
            i++;
        }
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }
}
