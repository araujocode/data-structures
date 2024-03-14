import javax.swing.*;

public class ExercicioFila2 {
    public static void main(String[] args) {
        int tamanhoFila = Integer.parseInt(JOptionPane.showInputDialog("Digite um tamanho para a fila: "));
        Fila fila = new Fila(tamanhoFila);

        for (int i = 0; i < tamanhoFila; i++) {
            int valores = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a posição " + i + ":"));
        }
    }
}
