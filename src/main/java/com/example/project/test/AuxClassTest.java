import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AuxClassTest {

    @Test
    public void testCalculaSalario() {
        AuxClass aux = new AuxClass();
        double resultado = aux.calculaSalario(1500.00, 500);
        assertEquals(1575.00, resultado, 0.001);
    }
}