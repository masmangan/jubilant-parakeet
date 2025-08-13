import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int soma = num1+num2;

        System.out.println("Soma: "+soma);
 
        sc.close();
    }
 
}