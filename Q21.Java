import java.util.Random;

public class q21 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] orig = new int[4][4];
        int[][] transf = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                orig[i][j] = rand.nextInt(20) + 1;
                if (j > i) transf[i][j] = 0;
                else transf[i][j] = orig[i][j];
            }
        }

        System.out.println("Original:");
        imprimir(orig);
        System.out.println("\nTriangular Inferior:");
        imprimir(transf);
    }

    private static void imprimir(int[][] m) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
