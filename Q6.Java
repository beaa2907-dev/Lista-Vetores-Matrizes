import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[20];
        int[] idades = new int[20];
        double soma = 0;

        for (int i = 0; i < 20; i++) {
            nomes[i] = sc.next();
            idades[i] = sc.nextInt();
            soma += idades[i];
        }

        double media = soma / 20.0;
        System.out.println("Idade média: " + media);

        System.out.println("Pessoas com idade acima da média:");
        for (int i = 0; i < 20; i++) {
            if (idades[i] > media) {
                System.out.println(nomes[i]);
            }
        }
    }
}
