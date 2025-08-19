package com.example.project.bee1001;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.example.project.AuxDiferenca;

public class CalculadoraDiferencaTest {

    @Test
    public void testDiferencaPositiva() {
        AuxDiferenca calc = new AuxDiferenca();
        int resultado = calc.calcularDiferenca(5, 6, 7, 8); 
        assertEquals(-26, resultado);
    }

    @Test
    public void testDiferencaZero() {
        AuxDiferenca calc = new AuxDiferenca();
        int resultado = calc.calcularDiferenca(2, 3, 1, 6); 
        assertEquals(0, resultado);
    }

    @Test
    public void testDiferencaNegativa() {
        AuxDiferenca calc = new AuxDiferenca();
        int resultado = calc.calcularDiferenca(10, 2, 15, 1); 
        assertEquals(5, resultado);
    }
}