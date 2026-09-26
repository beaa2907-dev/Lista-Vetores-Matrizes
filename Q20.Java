import java.util.Scanner;

public class q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        int acimaDP = 0, abaixoDP = 0, somaDP = 0, somaDS = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i < j) acimaDP += m[i][j];
                if (i > j) abaixoDP += m[i][j];
                if (i == j) somaDP += m[i][j];
                if (i + j == 2) somaDS += m[i][j];
            }
        }

        System.out.println("Acima da DP: " + acimaDP);
        System.out.println("Abaixo da DP: " + abaixoDP);
        System.out.println("Diagonal Principal: " + somaDP);
        System.out.println("Diagonal Secundária: " + somaDS);
    }
}
