package com.example.project.bee1007;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DiferencaTests {
    @Test
    @DisplayName("5 6 7 8 -> DIFERENCA = -26")
    void exemplo1() {
        Diferenca d = new Diferenca();
        assertEquals("DIFERENCA = -26", d.format(5, 6, 7, 8).trim());
    }

    @Test
    @DisplayName("0 0 7 8 -> DIFERENCA = -56")
    void exemplo2() {
        Diferenca d = new Diferenca();
        assertEquals("DIFERENCA = -56", d.format(0, 0, 7, 8).trim());
    }

    @Test
    @DisplayName("5 6 -7 8 -> DIFERENCA = 86")
    void exemplo3() {
        Diferenca d = new Diferenca();
        assertEquals("DIFERENCA = 86", d.format(5, 6, -7, 8).trim());
    }
}