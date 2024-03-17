import javax.swing.JOptionPane;

public class ExercicioFila1 {
    public static void main(String[] args) {
        int tamanhoFila = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da fila:"));
        Fila fila = new Fila(tamanhoFila);

        JOptionPane.showMessageDialog(null, "Digite os números (Digite 0 para parar):");

        String entrada;
        int numero;
        do {
            entrada = JOptionPane.showInputDialog("Digite um número:");
            numero = Integer.parseInt(entrada);
            if (numero != 0) {
                fila.enfileirar(numero);
            }
        } while (numero != 0 && !fila.cheia());

        JOptionPane.showMessageDialog(null, "Elementos da fila na ordem de remoção:");

        while (!fila.vazia()) {
            JOptionPane.showMessageDialog(null, "Elemento removido: " + fila.desenfileirar());
        }
    }
}

