package com.example.project.bee1001;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.example.project.ConversorIdade;

public class ConversorIdadeTest {

    @Test
    public void testExemplo400Dias() {
        ConversorIdade conv = new ConversorIdade();
        int[] resultado = conv.converter(400); 
        assertArrayEquals(new int[]{1, 1, 5}, resultado);
    }

    @Test
    public void testAnoExato() {
        ConversorIdade conv = new ConversorIdade();
        int[] resultado = conv.converter(365); 
        assertArrayEquals(new int[]{1, 0, 0}, resultado);
    }

    @Test
    public void testMenosDeUmMes() {
        ConversorIdade conv = new ConversorIdade();
        int[] resultado = conv.converter(20); 
        assertArrayEquals(new int[]{0, 0, 20}, resultado);
    }

    @Test
    public void testUmMesCheio() {
        ConversorIdade conv = new ConversorIdade();
        int[] resultado = conv.converter(30); 
        assertArrayEquals(new int[]{0, 1, 0}, resultado);
    }
}