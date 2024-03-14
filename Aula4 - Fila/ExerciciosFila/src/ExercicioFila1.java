import javax.swing.JOptionPane;

public class ExercicioFila1 {
    public static void main(String[] args) {
        int tamanhoFila = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho da fila:"));
        Fila fila = new Fila(tamanhoFila);

        for (int i = 0; i < tamanhoFila; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro (digite 0 para sair):"));
            if (numero == 0) {
                break;
            }
            fila.enfileirar(numero);
        }

        fila.exibeFila();
    }
}