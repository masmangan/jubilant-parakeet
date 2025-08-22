package app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaiorNumeroTest {

    @Test
    @DisplayName("Maior entre 7, 14 e 7 deve ser 14")
    void testMaiorComSegundoMaior() {
        // Arrange & Act
        int resultado = MaiorNumero.maior(7, 14, 7);

        // Assert
        assertEquals(14, resultado, "7, 14 e 7 -> maior deve ser 14");
    }

    @Test
    @DisplayName("Maior entre 9, 2 e 5 deve ser 9")
    void testMaiorComPrimeiroMaior() {
        int resultado = MaiorNumero.maior(9, 2, 5);
        assertEquals(9, resultado, "9, 2 e 5 -> maior deve ser 9");
    }

    @Test
    @DisplayName("Maior entre 7, 7 e 14 deve ser 14")
    void testMaiorComTerceiroMaior() {
        int resultado = MaiorNumero.maior(7, 7, 14);
        assertEquals(14, resultado, "7, 7 e 14 -> maior deve ser 14");
    }

    @Test
    @DisplayName("Todos iguais devem retornar esse mesmo valor")
    void testTodosIguais() {
        int resultado = MaiorNumero.maior(5, 5, 5);
        assertEquals(5, resultado, "5, 5 e 5 -> maior deve ser 5");
    }
}
