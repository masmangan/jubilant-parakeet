package com.example.project.bee1008;

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Salario salario = new Salario();
        
        // Get user input
        System.out.print("Enter number of hours worked: ");
        int hours = scanner.nextInt();
        
        System.out.print("Enter hourly rate: ");
        double hourlyRate = scanner.nextDouble();
        
        // Calculate and display result
        double totalSalary = salario.calcular(hours, hourlyRate);
        System.out.println("Salário $" + totalSalary);
        
        scanner.close();
 
 
    }
 
}