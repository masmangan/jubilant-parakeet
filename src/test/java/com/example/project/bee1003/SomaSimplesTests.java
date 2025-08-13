package com.example.project.bee1003;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SomaSimplesTests{

    @Test
    @DisplayName("30 + 10 = 40")
    void somaTrintaDez(){
        SomaSimples soma = new SomaSimples();
        assertEquals(40,soma.soma(30,10),"30 + 10 deve ser 40");
    }

    @Test
    @DisplayName("-30 + 10 = -20")
    void somaMenosTrintaDez(){
        SomaSimples soma = new SomaSimples();
        assertEquals(-20,soma.soma(-30,10),"-30 + 10 deve ser -20");
    }

    @Test
    @DisplayName("0 + 0 = 0")
    void somaZeroZero(){
        SomaSimples soma = new SomaSimples();
        assertEquals(0,soma.soma(0,0),"0 + 0 deve ser 0");
    }
}