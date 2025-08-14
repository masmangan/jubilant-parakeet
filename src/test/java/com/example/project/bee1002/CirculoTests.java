package com.example.project.bee1002;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Locale;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CirculoTests {

    // Garantia extra: força Locale.US para a JVM dos testes
    static { Locale.setDefault(Locale.US); }

    @Test
    @DisplayName("r=2.00 -> A=12.5664")
    void exemplo1() {
        Circulo c = new Circulo();
        assertEquals("A=12.5664", c.format(2.00).trim());
    }

    @Test
    @DisplayName("r=100.64 -> A=31819.3103")
    void exemplo2() {
        Circulo c = new Circulo();
        assertEquals("A=31819.3103", c.format(100.64).trim());
    }

    @Test
    @DisplayName("r=150.00 -> A=70685.7750")
    void exemplo3() {
        Circulo c = new Circulo();
        assertEquals("A=70685.7750", c.format(150.00).trim());
    }
}
