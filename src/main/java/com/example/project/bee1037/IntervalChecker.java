package com.example.project.bee1037;

public class IntervalChecker {
	public static String getIntervalMessage(double n) {
		if (n >= 0 && n <= 25.0) {
			return "Intervalo [0,25]";
		} else if (n > 25.0 && n <= 50.0) {
			return "Intervalo (25,50]";
		} else if (n > 50.0 && n <= 75.0) {
			return "Intervalo (50,75]";
		} else if (n > 75.0 && n <= 100.0) {
			return "Intervalo (75,100]";
		} else {
			return "Fora de intervalo";
		}
	}
}
