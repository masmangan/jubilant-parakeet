package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maior = MaiorNumero.maior(a, b, c);

        System.out.println(maior + " eh o maior");

        sc.close();
    }
}
