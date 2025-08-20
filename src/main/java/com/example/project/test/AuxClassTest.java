package com.example.project.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.example.project.AuxClass;

public class AuxClassTest {

    @Test
    public void FormulaTeste() {
        AuxClass aux = new AuxClass();

        // Caso 1: delta < 0 → deve retornar null
        double[] resultado1 = aux.Formula(15, 5, 20);
        assertNull(resultado1);

        // Caso 2: delta = 0 → raízes iguais
        double[] resultado2 = aux.Formula(10, 20, 10);
        assertNotNull(resultado2);
        assertEquals(-1.0, resultado2[0], 0.00001);
        assertEquals(-1.0, resultado2[1], 0.00001);

        // Caso 3: raízes diferentes
        double[] resultado3 = aux.Formula(1, -3, 2); // (x² - 3x + 2 = 0 → x=1,2)
        assertNotNull(resultado3);
        assertEquals(2.0, resultado3[0], 0.00001);
        assertEquals(1.0, resultado3[1], 0.00001);
    }
}
