package com.example.project.bee1007;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        Diferenca dif = new Diferenca();
        System.out.print(dif.format(A, B, C, D));
        sc.close();
    }
}