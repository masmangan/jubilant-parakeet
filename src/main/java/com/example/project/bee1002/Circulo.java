package com.example.project.bee1002;

import java.util.Locale;

class Circulo {
    static final double PI = 3.14159;

    double area(double r) {
        return PI * r * r;
    }

    String format(double r) {
        // FORÇA Locale.US no próprio format
        return String.format(Locale.US, "A=%.4f%n", area(r));
    }
}
