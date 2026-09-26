import java.util.Random;
import java.util.HashSet;

public class q22 {
    public static void main(String[] args) {
        Random rand = new Random();
        HashSet<Integer> gerados = new HashSet<>();
        int[][] cartela = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int num;
                do {
                    num = rand.nextInt(100);
                } while (gerados.contains(num));
                
                gerados.add(num);
                cartela[i][j] = num;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%02d ", cartela[i][j]);
            }
            System.out.println();
        }
    }
}
