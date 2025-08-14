package com.example.project.bee1002;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        Circulo c = new Circulo();
        System.out.print(c.format(r)); 
        sc.close();
    }
}
