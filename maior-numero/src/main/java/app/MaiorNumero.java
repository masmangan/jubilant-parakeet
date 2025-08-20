package app;

public class MaiorNumero {

    public static int maior(int a, int b, int c) {
        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        return (maiorAB + c + Math.abs(maiorAB - c)) / 2;
    }
}
