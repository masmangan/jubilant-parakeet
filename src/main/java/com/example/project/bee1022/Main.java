package com.example.project.bee1022;

import java.io.IOException;
import java.util.Scanner;

import com.example.project.Racional;
 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // número de casos de teste

        for (int i = 0; i < N; i++) {
            int N1 = sc.nextInt();
            sc.next(); 
            int D1 = sc.nextInt();
            String op = sc.next();
            int N2 = sc.nextInt();
            sc.next(); 
            int D2 = sc.nextInt();

            Racional r1 = new Racional(N1, D1);
            Racional r2 = new Racional(N2, D2);
            Racional resultado = null;

            switch (op) {
                case "+":
                    resultado = r1.somar(r2);
                    break;
                case "-":
                    resultado = r1.subtrair(r2);
                    break;
                case "*":
                    resultado = r1.multiplicar(r2);
                    break;
                case "/":
                    resultado = r1.dividir(r2);
                    break;
            }

            int numOriginal = 0;
            int denOriginal = 0;
            switch (op) {
                case "+":
                    numOriginal = (N1 * D2 + N2 * D1);
                    denOriginal = (D1 * D2);
                    break;
                case "-":
                    numOriginal = (N1 * D2 - N2 * D1);
                    denOriginal = (D1 * D2);
                    break;
                case "*":
                    numOriginal = (N1 * N2);
                    denOriginal = (D1 * D2);
                    break;
                case "/":
                    numOriginal = (N1 * D2);
                    denOriginal = (N2 * D1);
                    break;
            }

            System.out.println(numOriginal + "/" + denOriginal + " = " + resultado);
        }

        sc.close();
    }
}