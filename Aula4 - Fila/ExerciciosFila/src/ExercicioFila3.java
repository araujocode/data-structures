import javax.swing.*;

public class ExercicioFila3 {
    public static void main(String[] args) {
        int tamanhoFila1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da fila 1:"));
        int tamanhoFila2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da fila 2:"));
        Fila f1 = new Fila(tamanhoFila1);
        Fila f2 = new Fila(tamanhoFila2);

        for (int i = 0; i < tamanhoFila1; i++) {
            int valores = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite valores para a fila 1:"));
            f1.enfileirar(valores);
        }

        for (int i = 0; i < tamanhoFila2; i++) {
            int valores = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite valores para a fila 2:"));
            f2.enfileirar(valores);
        }

        if (f1.total > f2.total) {
            JOptionPane.showMessageDialog(null, "Fila 1 possui mais elementos que a fila 2");
        } else if (f1.total < f2.total) {
            JOptionPane.showMessageDialog(null, "Fila 2 possui mais elementos que a fila 1");
        } else {
            JOptionPane.showMessageDialog(null, "As duas filas possuem o mesmo número de elementos");
        }
    }
}
