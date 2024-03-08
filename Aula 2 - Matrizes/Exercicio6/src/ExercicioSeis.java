import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = scanner.nextInt();
        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = scanner.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        int[] diagonalSecundaria = matrizDiagonal(matriz);

        System.out.println("Elementos na diagonal secundária:");
        for (int elemento : diagonalSecundaria) {
            System.out.print(elemento + " ");
        }

        scanner.close();
    }

    public static int[] matrizDiagonal(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        int[] diagonalSecundaria = new int[linhas];

        for (int i = 0; i < linhas; i++) {
            diagonalSecundaria[i] = matriz[i][colunas - 1 - i];
        }

        return diagonalSecundaria;
    }
}
