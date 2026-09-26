import java.util.Scanner;

public class q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] alunos = new int[5][4];

        int maiorNota = -1;
        int matMaiorNota = -1;
        double somaNotasFinais = 0;

        for (int i = 0; i < 5; i++) {
            alunos[i][0] = sc.nextInt(); // Matrícula
            alunos[i][1] = sc.nextInt(); // Média provas
            alunos[i][2] = sc.nextInt(); // Média trabalhos
            alunos[i][3] = alunos[i][1] + alunos[i][2]; // Nota final

            somaNotasFinais += alunos[i][3];

            if (alunos[i][3] > maiorNota) {
                maiorNota = alunos[i][3];
                matMaiorNota = alunos[i][0];
            }
        }

        System.out.println("Matrícula maior nota: " + matMaiorNota);
        System.out.println("Média das notas finais: " + (somaNotasFinais / 5.0));
    }
}
