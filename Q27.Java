import java.util.Scanner;
import java.util.ArrayList;

public class q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                String nome = sc.next();
                ArrayList<Integer> diasFaltas = new ArrayList<>();

                for (int dia = 1; dia <= 30; dia++) {
                    String presenca = sc.next();
                    if (presenca.equals("F")) {
                        diasFaltas.add(dia);
                    }
                }

                if (diasFaltas.size() > 10) {
                    System.out.print(nome + " dias:");
                    for (int dia : diasFaltas) {
                        System.out.print(" " + dia);
                    }
                    System.out.println();
                }
            }
        }
    }
}
