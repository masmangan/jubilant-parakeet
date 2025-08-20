package com.example.project;

public class AuxClass {
    public double[] Formula(double A, double B, double C) {
        double delta = (B * B) - (4 * A * C);

        if (A == 0 || delta < 0) {
            return null; // Impossível calcular
        }

        double R1 = (-B + Math.sqrt(delta)) / (2 * A);
        double R2 = (-B - Math.sqrt(delta)) / (2 * A);

        return new double[]{R1, R2};
    }
}
