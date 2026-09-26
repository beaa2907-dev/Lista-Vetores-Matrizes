import java.util.Scanner;

public class q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] m1 = new double[2][2];
        double[][] m2 = new double[2][2];

        System.out.println("Informe Matriz 1:");
        lerMatriz(sc, m1);
        System.out.println("Informe Matriz 2:");
        lerMatriz(sc, m2);

        System.out.println("Menu:\na) somar\nb) subtrair (m2 - m1)\nc) adicionar constante\nd) imprimir");
        char opcao = sc.next().charAt(0);

        switch (opcao) {
            case 'a':
                double[][] m3Soma = new double[3][3];
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++)
                        m3Soma[i][j] = m1[i][j] + m2[i][j];
                imprimir3x3(m3Soma);
                break;

            case 'b':
                double[][] m3Sub = new double[3][3];
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++)
                        m3Sub[i][j] = m2[i][j] - m1[i][j];
                imprimir3x3(m3Sub);
                break;

            case 'c':
                System.out.println("Digite a constante:");
                double c = sc.nextDouble();
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        m1[i][j] += c;
                        m2[i][j] += c;
                    }
                }
                break;

            case 'd':
                System.out.println("Matriz 1:");
                imprimir2x2(m1);
                System.out.println("Matriz 2:");
                imprimir2x2(m2);
                break;
        }
    }

    private static void lerMatriz(Scanner sc, double[][] m) {
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                m[i][j] = sc.nextDouble();
    }

    private static void imprimir2x2(double[][] m) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }

    private static void imprimir3x3(double[][] m) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }
}
