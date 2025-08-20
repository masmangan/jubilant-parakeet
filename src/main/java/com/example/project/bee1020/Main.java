package com.example.project.bee1020;

import java.io.IOException;
import java.util.Scanner;

import com.example.project.ConversorIdade;
 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idadeEmDias = sc.nextInt();

        ConversorIdade conversor = new ConversorIdade();
        int[] resultado = conversor.converter(idadeEmDias);

        System.out.println(resultado[0] + " ano(s)");
        System.out.println(resultado[1] + " mes(es)");
        System.out.println(resultado[2] + " dia(s)");

        sc.close();
    }
}