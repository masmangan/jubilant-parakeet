package com.example.project.bee1001;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.example.project.Racional;

public class RacionalTest {

    @Test
    public void testSoma() {
        Racional r1 = new Racional(1, 2);
        Racional r2 = new Racional(3, 4);
        Racional resultado = r1.somar(r2);
        assertEquals("5/4", resultado.toString());
    }

    @Test
    public void testSubtracao() {
        Racional r1 = new Racional(1, 2);
        Racional r2 = new Racional(3, 4);
        Racional resultado = r1.subtrair(r2);
        assertEquals("-1/4", resultado.toString());
    }

    @Test
    public void testMultiplicacao() {
        Racional r1 = new Racional(2, 3);
        Racional r2 = new Racional(6, 6);
        Racional resultado = r1.multiplicar(r2);
        assertEquals("2/3", resultado.toString()); // simplificado
    }

    @Test
    public void testDivisao() {
        Racional r1 = new Racional(1, 2);
        Racional r2 = new Racional(3, 4);
        Racional resultado = r1.dividir(r2);
        assertEquals("2/3", resultado.toString());
    }

    @Test
    public void testNaoSimplificavel() {
        Racional r1 = new Racional(2, 5);
        Racional r2 = new Racional(1, 5);
        Racional resultado = r1.subtrair(r2); // 2/5 - 1/5 = 1/5
        assertEquals("1/5", resultado.toString());
    }

    @Test
    public void testNegativo() {
        Racional r1 = new Racional(-1, 3);
        Racional r2 = new Racional(1, 6);
        Racional resultado = r1.somar(r2); // -1/3 + 1/6 = -1/6
        assertEquals("-1/6", resultado.toString());
    }
}