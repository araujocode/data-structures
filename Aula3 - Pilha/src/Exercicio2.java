import javax.swing.*;

public class Exercicio2 {
    public static void main(String[] args) {
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho desejado para a pilha"));
        Pilha p = new Pilha(tam);
        String placa;

        while (p.topo < tam - 1) {
            placa = JOptionPane.showInputDialog("Digite uma placa para adicionar a pilha");
            p.empilhar(placa);
        }
        String encontrarPlaca = JOptionPane.showInputDialog("Digite a placa a ser encontrada: ");

        for (String x : p) {
            if (encontrarPlaca == placa) {
                JOptionPane.showMessageDialog(null, "O carro está estacionado na rua");
            }
        }

        String elementosPilha = "Ordem dos carros que precisam sair:\n";
        // Loop para desempilhar os elementos e concatenar eles na string
        while (p.topo >= 0) {
            int elemento = (int) p.desempilhar(); //Cast de Object para int
            elementosPilha += elemento + "\n";
        }
    }
}
