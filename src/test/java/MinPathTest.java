import com.mfava.service.CalculationService;
import com.mfava.service.ValuesService;
import org.junit.Test;

public class MinPathTest {

    @Test
    public void testFiveRows() {
        int[][] triangle = ValuesService.generateRandom(5);
        CalculationService.findMinPath(triangle);
    }


    @Test
    public void testFiveHundredRows() {
        int[][] triangle = ValuesService.generateRandom(500);
        CalculationService.findMinPath(triangle);
    }
}
