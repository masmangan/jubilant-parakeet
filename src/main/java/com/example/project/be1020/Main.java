package com.example.project.be1020;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalDays = sc.nextInt();
        System.out.println(AgeInDays.convert(totalDays));

        sc.close();
    }
}