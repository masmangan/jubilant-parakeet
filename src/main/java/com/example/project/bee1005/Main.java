package com.example.project.bee1005;

import java.io.IOException;
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
        double b = sc.nextDouble();

        AverageOne media = new AverageOne();
        System.out.printf("MEDIA = %.5f%n", media.calcularMedia(a, b));
        
		sc.close();
 	}
}
