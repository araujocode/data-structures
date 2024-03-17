import javax.swing.JOptionPane;

public class ExercicioFila2 {
    public static void main(String[] args) {
        int tamanhoFila = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho desejado da fila:"));
        Fila fila = new Fila(tamanhoFila);

        for (int i = 0; i < tamanhoFila; i++) {
            String entrada = JOptionPane.showInputDialog("Digite o valor " + (i + 1) + " para adicionar à fila:");
            try {
                int valor = Integer.parseInt(entrada);
                fila.enfileirar(valor);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número inteiro válido.");
                i--;
            }
        }

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;

        // Percorre a fila para encontrar o maior, o menor e calcular a soma
        for (int i = 0; i < fila.total; i++) {
            int valor = fila.vetor[i];
            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }
            soma += valor;
        }

        // Calcula a média aritmética
        double media = (double) soma / fila.total;

        // Exibe os resultados
        JOptionPane.showMessageDialog(null,
                "Maior elemento na fila: " + maior + "\n" +
                        "Menor elemento na fila: " + menor + "\n" +
                        "Média aritmética dos elementos na fila: " + media);
    }
}
