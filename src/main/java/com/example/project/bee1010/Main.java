package com.example.project.bee1010;
import com.example.project.bee1010.SimpleCalculate;

class Main {
    public static void main(String[] args) {
        PackageData p1 = new PackageData(1, 3, 2.10);
        PackageData p2 = new PackageData(2, 3, 5.20);
        SimpleCalculate total = new SimpleCalculate();
        System.out.println("VALOR A PAGAR: " + total.calculatePrices(p1, p2));
 
    }
}