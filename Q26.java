import java.util.Scanner;

public class q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] teatro = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                teatro[i][j] = -1;
            }
        }

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            for (int k = 0; k < n; k++) {
                int fila = sc.nextInt() - 1;
                int col = sc.nextInt() - 1;

                if (teatro[fila][col] == -1) {
                    teatro[fila][col] = 1;
                } else {
                    System.out.println("Poltrona ja foi vendida");
                }
            }

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(teatro[i][j]);
                }
                System.out.println();
            }
        }
    }
}
