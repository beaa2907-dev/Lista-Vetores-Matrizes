import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[20];

        for (int i = 0; i < 20; i++) {
            v[i] = sc.nextInt();
        }

        System.out.println("Elementos ímpares:");
        for (int i = 0; i < 20; i++) {
            if (v[i] % 2 != 0) {
                System.out.println(v[i]);
            }
        }

        System.out.println("Elementos das posições pares:");
        for (int i = 0; i < 20; i += 2) {
            System.out.println(v[i]);
        }
    }
}
