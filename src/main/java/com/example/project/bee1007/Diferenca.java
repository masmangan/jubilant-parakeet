package com.example.project.bee1007;

class Diferenca {
    int calcular(int a, int b, int c, int d) {
        return a * b - c * d;
    }

    String format(int a, int b, int c, int d) {
        return "DIFERENCA = " + calcular(a, b, c, d) + System.lineSeparator();
    }
}