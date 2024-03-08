import java.util.Arrays;

public class ExercicioDois {
    public static void main(String[] args) {
        int[] v1 = {1, 2, 3, 4, 5};
        int[] v2 = {4, 5, 6, 7, 8};

        int[] resultado = juntarArrays(v1, v2);

        System.out.println("Array da junção: " + Arrays.toString(resultado));
    }

    public static int[] juntarArrays(int[] v1, int[] v2) {
        int tamanhoTotal = v1.length + v2.length;
        int[] resultado = new int[tamanhoTotal];

        for (int i = 0; i < v1.length; i++) {
            resultado[i] = v1[i];
        }

        for (int i = 0; i < v2.length; i++) {
            resultado[v1.length + i] = v2[i];
        }

        return resultado;
    }
}
