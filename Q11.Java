import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] v = new double[10];
        double soma = 0;

        for (int i = 0; i < 10; i++) {
            v[i] = sc.nextDouble();
            soma += v[i];
        }

        double m = soma / 10.0;
        double somaDiferencas = 0;

        for (int i = 0; i < 10; i++) {
            somaDiferencas += Math.pow(v[i] - m, 2);
        }

        double desvioPadrao = Math.sqrt(somaDiferencas / 9.0);
        System.out.println("Desvio Padrão: " + desvioPadrao);
    }
}
