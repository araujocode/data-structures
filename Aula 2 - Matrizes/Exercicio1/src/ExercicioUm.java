import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Linhas (N): ");
        int n = sc.nextInt();

        System.out.print("Linhas (M): ");
        int m = sc.nextInt();

        int[][] matriz = new int[n][m];

        for (int i=0; i < n; i++) {
            for (int j=0; j < m; j++) {
                System.out.print("Valor para a matriz na linha " + i + " e coluna " + j + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }

        int maiorValor = matriz[0][0];
        int maiorLinha = 0;
        int maiorColuna = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                    maiorLinha = i;
                    maiorColuna = j;
                }
            }
        }

        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Maior linha: " + maiorLinha);
        System.out.println("Maior coluna: " + maiorColuna);
    }

}