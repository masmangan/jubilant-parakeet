package com.example.project.bee1001;

import java.io.IOException;
import java.util.Scanner;

import com.example.project.AuxDiferenca;
 

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        AuxDiferenca calc = new AuxDiferenca();
        int DIFERENCA = calc.calcularDiferenca(A, B, C, D);

        System.out.println("DIFERENCA = " + DIFERENCA);

        sc.close();
 
    }
 
}