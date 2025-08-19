import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarioFixo = sc.nextDouble();
        double totalVendas = sc.nextDouble();

        double salarioFinal = salarioFixo + (totalVendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", salarioFinal);

        sc.close();
    }
}
