import javax.swing.*;

public class Exercicio3 {
    public static void main(String[] args) {
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho desejado para a pilha"));
        Pilha p = new Pilha(tam);

        int numDigitado = 1;

        while (numDigitado != 0 && p.topo < tam - 1) {
            numDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro para ser armazenado na pilha (0 para sair)"));
            if (numDigitado != 0) {
                p.empilhar(numDigitado);
            }
        }

        int elementosPares = 0;
        String elementosPilha = "Elementos da pilha na ordem em que foram removidos:\n";

        while (p.topo >= 0) {
            int elemento = (int) p.desempilhar();
            elementosPilha += elemento + "\n";
            if (elemento % 2 == 0) {
                elementosPares++;
            }
        }

        JOptionPane.showMessageDialog(null, elementosPilha + "\nNúmero de elementos pares na pilha: " + elementosPares);
    }
}
