package com.example.project.bee1001;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();

        CarDistance carDistance = new CarDistance();
        int timeInMinutes = carDistance.calculateTime(distance);

        System.out.println(timeInMinutes + " minutos");

        scanner.close();
    }
}
