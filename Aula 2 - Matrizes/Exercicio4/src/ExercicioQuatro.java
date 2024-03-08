import java.util.*;

public class ExercicioQuatro {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 4, 2, 1, 3};
        int k = 3;

        int[] result = KVezes(array, k);

        System.out.println("Elementos que se repetem " + k + " vezes no array original: " + Arrays.toString(result));
    }

    public static int[] KVezes(int[] arr, int k) {
        int[] frequenciaArray = new int[101];

        for (int num : arr) {
            frequenciaArray[num]++;
        }

        List<Integer> listaResultados = new ArrayList<>();

        for (int i = 0; i < frequenciaArray.length; i++) {
            if (frequenciaArray[i] == k) {
                listaResultados.add(i);
            }
        }

        int[] arrayResultado = new int[listaResultados.size()];
        for (int i = 0; i < listaResultados.size(); i++) {
            arrayResultado[i] = listaResultados.get(i);
        }

        return arrayResultado;
    }
}
