import javax.swing.*;

public class Exercicio1 {
    public static void main(String[] args) {
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho desejado para a pilha"));
        Pilha p = new Pilha(tam);

        int numDigitado = 1; // Inicializa com qualquer valor diferente de 0

        while (numDigitado != 0 && p.topo < tam - 1) {
            numDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro para ser armazenado na pilha (0 para sair)"));
            if (numDigitado != 0) {
                p.empilhar(numDigitado);
            }
        }

        String elementosPilha = "Elementos da pilha na ordem em que foram removidos:\n";

        // Loop para desempilhar os elementos e concatenar eles na string
        while (p.topo >= 0) {
            int elemento = (int) p.desempilhar(); //Cast de Object para int
            elementosPilha += elemento + "\n";
        }

        JOptionPane.showMessageDialog(null, elementosPilha);

    }
}
