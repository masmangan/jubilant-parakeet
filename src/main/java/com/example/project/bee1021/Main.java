package com.example.project.bee1021;

import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        int total = sc.nextInt();
        System.out.println(bank.contar(total));

        sc.close();
    }
 
}
