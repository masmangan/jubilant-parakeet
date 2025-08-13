package com.example.project.bee1038;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculadoraLanchoneteTests {
    
    private CalculadoraLanchonete calculadora = new CalculadoraLanchonete();
    
    @Test
    @DisplayName("Código 1 (Cachorro Quente) - 2 unidades = R$ 8.00")
    void testCachorroQuente() {
        double resultado = calculadora.calcularTotal(1, 2);
        assertEquals(8.00, resultado, 0.001);
    }
    
    @Test
    @DisplayName("Código 2 (X-Salada) - 1 unidade = R$ 4.50")
    void testXSalada() {
        double resultado = calculadora.calcularTotal(2, 1);
        assertEquals(4.50, resultado, 0.001);
    }
    
    @Test
    @DisplayName("Código 3 (X-Bacon) - 3 unidades = R$ 15.00")
    void testXBacon() {
        double resultado = calculadora.calcularTotal(3, 3);
        assertEquals(15.00, resultado, 0.001);
    }
    
    @Test
    @DisplayName("Código 4 (Torrada simples) - 2 unidades = R$ 4.00")
    void testTorrada() {
        double resultado = calculadora.calcularTotal(4, 2);
        assertEquals(4.00, resultado, 0.001);
    }
    
    @Test
    @DisplayName("Código 5 (Refrigerante) - 5 unidades = R$ 7.50")
    void testRefrigerante() {
        double resultado = calculadora.calcularTotal(5, 5);
        assertEquals(7.50, resultado, 0.001);
    }
    
    @ParameterizedTest
    @CsvSource({
        "1, 2, 8.00",
        "2, 1, 4.50", 
        "3, 3, 15.00",
        "4, 2, 4.00",
        "5, 5, 7.50"
    })
    @DisplayName("Testes parametrizados para diferentes códigos e quantidades")
    void testCalculosParametrizados(int codigo, int quantidade, double esperado) {
        double resultado = calculadora.calcularTotal(codigo, quantidade);
        assertEquals(esperado, resultado, 0.001);
    }
    
    @Test
    @DisplayName("Teste de formatação do total")
    void testFormatacao() {
        String resultado = calculadora.formatarTotal(8.00);
        assertEquals("Total: R$ 8,00", resultado);
    }
    
    @Test
    @DisplayName("Código inválido deve lançar exceção")
    void testCodigoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcularTotal(0, 1);
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcularTotal(6, 1);
        });
    }
    
    @Test
    @DisplayName("Quantidade negativa deve lançar exceção")
    void testQuantidadeNegativa() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcularTotal(1, -1);
        });
    }
    
    @Test
    @DisplayName("Quantidade zero deve retornar zero")
    void testQuantidadeZero() {
        double resultado = calculadora.calcularTotal(1, 0);
        assertEquals(0.00, resultado, 0.001);
    }
}
