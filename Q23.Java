import java.util.Scanner;

public class q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][3];
        int[] v = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < 3; j++) {
            int soma = 0;
            for (int i = 0; i < 3; i++) {
                soma += m[i][j];
            }
            v[j] = soma;
        }

        for (int j = 0; j < 3; j++) {
            System.out.println(v[j]);
        }
    }
}
