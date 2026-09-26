import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v1 = new int[10];
        int[] v2 = new int[10];
        int[] v3 = new int[20];

        for (int i = 0; i < 10; i++) v1[i] = sc.nextInt();
        for (int i = 0; i < 10; i++) v2[i] = sc.nextInt();

        int idx1 = 0, idx2 = 0;
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                v3[i] = v1[idx1++];
            } else {
                v3[i] = v2[idx2++];
            }
        }

        for (int i = 0; i < 20; i++) {
            System.out.print(v3[i] + " ");
        }
    }
}
