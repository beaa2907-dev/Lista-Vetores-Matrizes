public class q9 {
    public static void main(String[] args) {
        int[] v = new int[100];
        int count = 0;
        int num = 0;

        while (count < 100) {
            if (num % 7 != 0 || num % 10 == 7) {
                v[count] = num;
                count++;
            }
            num++;
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(v[i]);
        }
    }
}
