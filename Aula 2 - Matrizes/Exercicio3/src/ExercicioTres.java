import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;

        while (true) {
            System.out.print("Digite o número de linhas: ");
            m = sc.nextInt();

            System.out.print("Digite o número de colunas: ");
            n = sc.nextInt();

            if (m == n) {
                int[][] matriz = new int[m][n];

                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print("Valor para a matriz na linha " + i + " e coluna " + j + ": ");
                        matriz[i][j] = sc.nextInt();
                    }
                }
                somaDiagonal(matriz);
                break;
            } else {
                System.out.println("Matriz não é quadrada. Digite novamente.");
            }
        }
    }

    public static void somaDiagonal(int[][] matriz) {
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }

        System.out.println("A soma dos elementos da diagonal principal é: " + soma);
    }
}
