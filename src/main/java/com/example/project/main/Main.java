package com.example.project.main;

import java.util.Scanner;

import com.example.project.AuxClass; // importa a classe auxiliar

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        AuxClass aux = new AuxClass();
        double[] resultado = aux.Formula(A, B, C);

        if (resultado == null) {
            System.out.println("Impossivel calcular");
        } else {
            System.out.printf("R1 = %.5f%n", resultado[0]);
            System.out.printf("R2 = %.5f%n", resultado[1]);
        }

        sc.close();
    }
}
