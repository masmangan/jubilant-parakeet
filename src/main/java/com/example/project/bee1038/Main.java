package com.example.project.bee1038;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        CalculadoraLanchonete calculadora = new CalculadoraLanchonete();
        
        int codigo = scanner.nextInt();
        int quantidade = scanner.nextInt();
        
        double total = calculadora.calcularTotal(codigo, quantidade);
        System.out.println(calculadora.formatarTotal(total));
        
        scanner.close();
    }
}
