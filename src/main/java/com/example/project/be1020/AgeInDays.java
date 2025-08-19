package com.example.project.be1020; 

public class AgeInDays {

    public static String convert(int totalDays) {
        int years = totalDays / 365;
        totalDays %= 365;

        int months = totalDays / 30;
        totalDays %= 30;

        int days = totalDays;

        return years + " ano(s)\n" +
               months + " mes(es)\n" +
               days + " dia(s)";
    }
}