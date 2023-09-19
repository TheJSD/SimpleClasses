import com.codebase.Printer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class PrinterTest {
    private Printer printer;
    @Before
    public void before(){
        printer = new Printer(25, 15);
    }
    @Test
    public void canGetNumberOfPaperSheets(){
        assertEquals(25, printer.getSheetsOfPaper());
    }
    @Test
    public void canPrint() {
        printer.print(2, 4);
        printer.print(3, 10);
        assertEquals(17, printer.getSheetsOfPaper());
    }
    @Test
    public void canGetToner() {
        assertEquals(15, printer.getToner());
    }
    @Test
    public void canPrintToner() {
        printer.print(2, 5);
        printer.print(3, 2);
        assertEquals(5, printer.getToner());
    }
}
