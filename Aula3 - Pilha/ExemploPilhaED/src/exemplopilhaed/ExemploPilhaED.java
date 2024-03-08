package exemplopilhaed;

import javax.swing.*;

public class ExemploPilhaED {
    public static void main(String[] args) {
        int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de elementos da pilha"));
        Pilha p = new Pilha(qtd);
        int op = 0;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Empilhar um elemento\n" +
                            "2 - Remover um elemento\n" +
                            "3 - Exibir os valores existentes\n" +
                            "4 - Sair\n" +
                            "Digite a opção desejada: "
            ));


            switch (op) {
                case 1:
                    p.empilhar(JOptionPane.showInputDialog("Insira o valor a ser empilhado: "));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, p.desempilhar());
                    break;
                case 3:
                    p.exibePilha();
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Comando inválido!");
                    break;
            }
        } while(op != 4);
    }
}