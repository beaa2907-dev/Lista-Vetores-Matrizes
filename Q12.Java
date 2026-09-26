import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        int count = 0;

        while (count < 10) {
            int num = sc.nextInt();
            boolean existe = false;

            for (int i = 0; i < count; i++) {
                if (v[i] == num) {
                    existe = true;
                    break;
                }
            }

            if (existe) {
                System.out.println("Número já digitado. Digite outro:");
            } else {
                v[count] = num;
                count++;
            }
        }

        System.out.println("Vetor final:");
        for (int i = 0; i < 10; i++) {
            System.out.print(v[i] + " ");
        }
    }
}
