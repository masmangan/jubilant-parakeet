package com.example.project.bee1001;

/*Intepretação do enunciado*/

class MediaPonderada {
    public double media(double a, double b) {
        return Math.round(((a*3.5 + b*7.5)/(3.5+7.5))*100000.0) / 100000.0;
    }
}