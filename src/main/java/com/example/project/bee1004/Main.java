package com.example.project.bee1004;

import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();

        Somador somador = new Somador();

        int PROD = somador.multiplicar(valor1, valor2);

        System.out.println("PROD = " + PROD);

        scanner.close();
    
    }
 
}