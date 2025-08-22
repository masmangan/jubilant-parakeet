package com.example.project.bee1021;


public class Bank {
public int[] contar(double n) {
        int centavos = (int) Math.round(n * 100);

        int cem = centavos / 10000; 
        centavos %= 10000;

        int cinquenta = centavos / 5000;
        centavos %= 5000;

        int vinte = centavos / 2000;
        centavos %= 2000;

        int dez = centavos / 1000;
        centavos %= 1000;

        int cinco = centavos / 500;
        centavos %= 500;

        int dois = centavos / 200;
        centavos %= 200;

        int um = centavos / 100;
        centavos %= 100;

        int cinqCentavos = centavos / 50;
        centavos %= 50;

        int vinteCincoCents = centavos / 25;
        centavos %= 25;

        int dezCents = centavos / 10;
        centavos %= 10;

        int cincoCents = centavos / 5;
        centavos %= 5;

        int umCent = centavos;

        System.out.println("NOTAS:");
        System.out.println(cem + " nota(s) de R$ 100.00");
        System.out.println(cinquenta + " nota(s) de R$ 50.00");
        System.out.println(vinte + " nota(s) de R$ 20.00");
        System.out.println(dez + " nota(s) de R$ 10.00");
        System.out.println(cinco + " nota(s) de R$ 5.00");
        System.out.println(dois + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(um + " moeda(s) de R$ 1.00");
        System.out.println(cinqCentavos + " moeda(s) de R$ 0.50");
        System.out.println(vinteCincoCents + " moeda(s) de R$ 0.25");
        System.out.println(dezCents + " moeda(s) de R$ 0.10");
        System.out.println(cincoCents + " moeda(s) de R$ 0.05");
        System.out.println(umCent + " moeda(s) de R$ 0.01");

        int ans[] = {cem,cinquenta,vinte,dez,cinco,dois,um,cinqCentavos,vinteCincoCents,dezCents,cincoCents,umCent};

        return ans;
    }
}

