import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MediaCalculatorTest {
    MediaCalculator m = new MediaCalculator();

    @Test
    void exemplo1() { assertEquals(6.3, m.calcularMedia(5.0,6.0,7.0), 1e-9); }

    @Test
    void exemplo2() { assertEquals(9.0, m.calcularMedia(5.0,10.0,10.0), 1e-9); }

    @Test
    void exemplo3() { assertEquals(7.5, m.calcularMedia(10.0,10.0,5.0), 1e-9); }
}
