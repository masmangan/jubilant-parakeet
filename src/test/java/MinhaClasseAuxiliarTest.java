import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MinhaClasseAuxiliarTest {

    @Test
    public void testCalculoConsumo() {
        Aux aux = new aux();
        double resultado = aux.calcularConsumo(500, 35.0);
        assertEquals(14.285, resultado, 0.001); // tolerância de 0.001
    }
}
