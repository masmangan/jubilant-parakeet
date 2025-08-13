package com.example.project.bee1038;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class CalculadoraLanchonete {
    
    private static final double[] PRECOS = {
        0.0,    // índice 0 não usado
        4.00,   // código 1 - Cachorro Quente
        4.50,   // código 2 - X-Salada
        5.00,   // código 3 - X-Bacon
        2.00,   // código 4 - Torrada simples
        1.50    // código 5 - Refrigerante
    };
    
    public double calcularTotal(int codigo, int quantidade) {
        if (codigo < 1 || codigo > 5) {
            throw new IllegalArgumentException("Código inválido. Deve estar entre 1 e 5.");
        }
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade deve ser positiva.");
        }
        
        return PRECOS[codigo] * quantidade;
    }
    
    public String formatarTotal(double total) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.forLanguageTag("pt-BR"));
        DecimalFormat df = new DecimalFormat("0.00", symbols);
        return "Total: R$ " + df.format(total);
    }
}
