import javax.swing.*;

public class PilhaExercicio5 {
    public static void main(String[] args) {
        Pilha sites = new Pilha(5);
        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("1 - Visitar Site\n" + "2 - Voltar para o site anterior\n" + "0 - Sair"));

            switch (op) {
                case 0:
                    break;
                case 1:
                    sites.empilhar(JOptionPane.showInputDialog("Informe o site visitado: "));
                    break;
                case 2:
                    sites.desempilhar();
                    JOptionPane.showMessageDialog(null, sites.desempilhar());
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
        } while(op!= 0);
    }
}