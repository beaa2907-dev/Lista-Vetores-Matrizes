import java.util.Scanner;
import java.util.ArrayList;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];
        int[] y = new int[5];

        for (int i = 0; i < 5; i++) x[i] = sc.nextInt();
        for (int i = 0; i < 5; i++) y[i] = sc.nextInt();

        // a. Soma
        System.out.print("Soma: ");
        for (int i = 0; i < 5; i++) System.out.print((x[i] + y[i]) + " ");
        System.out.println();

        // b. Produto
        System.out.print("Produto: ");
        for (int i = 0; i < 5; i++) System.out.print((x[i] * y[i]) + " ");
        System.out.println();

        // c. Diferenca (x - y)
        System.out.print("Diferenca: ");
        for (int i = 0; i < 5; i++) {
            boolean emY = false;
            for (int j = 0; j < 5; j++) {
                if (x[i] == y[j]) { emY = true; break; }
            }
            if (!emY) System.out.print(x[i] + " ");
        }
        System.out.println();

        // d. Intersecao
        System.out.print("Intersecao: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (x[i] == y[j]) System.out.print(x[i] + " ");
            }
        }
        System.out.println();

        // e. Uniao
        System.out.print("Uniao: ");
        for (int i = 0; i < 5; i++) System.out.print(x[i] + " ");
        for (int j = 0; j < 5; j++) {
            boolean emX = false;
            for (int i = 0; i < 5; i++) {
                if (y[j] == x[i]) { emX = true; break; }
            }
            if (!emX) System.out.print(y[j] + " ");
        }
        System.out.println();
    }
}
