import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[4][4];
        int maior = Integer.MIN_VALUE;
        int lin = 0, col = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = sc.nextInt();
                if (m[i][j] > maior) {
                    maior = m[i][j];
                    lin = i;
                    col = j;
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Maior valor " + maior + " na Linha: " + lin + ", Coluna: " + col);
    }
}
