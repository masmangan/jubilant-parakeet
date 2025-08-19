package com.example.project.bee1020;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.project.be1020.AgeInDays;

public class AgeInDaysTest {

    @Test
    public void testExemplo1() {
        String resultado = AgeInDays.convert(400);
        String esperado = "1 ano(s)\n1 mes(es)\n5 dia(s)";
        assertEquals(esperado, resultado);
    }

    @Test
    public void testExemplo2() {
        String resultado = AgeInDays.convert(800);
        String esperado = "2 ano(s)\n2 mes(es)\n10 dia(s)";
        assertEquals(esperado, resultado);
    }

    @Test
    public void testExemplo3() {
        String resultado = AgeInDays.convert(30);
        String esperado = "0 ano(s)\n1 mes(es)\n0 dia(s)";
        assertEquals(esperado, resultado);
    }
}
