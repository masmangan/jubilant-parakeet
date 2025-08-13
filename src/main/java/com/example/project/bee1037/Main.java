package com.example.project.bee1037;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		double valor = sc.nextDouble();
		System.out.println(IntervalChecker.getIntervalMessage(valor));
		sc.close();
	}
}