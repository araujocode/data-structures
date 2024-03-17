import javax.swing.*;
import java.util.Scanner;

public class ExercicioFila4 {

    private static final int TAMANHO_FILA = 10;
    private static Fila filaProcessos = new Fila(TAMANHO_FILA);

    public static void main(String[] args) {
        exibirMenu();
    }


    private static void exibirMenu() {
        String opcao;
        do {
            opcao = JOptionPane.showInputDialog(null,
                    "Gerenciador de Fila de Processos\n"
                            + "1. Incluir novo processo\n"
                            + "2. Remover processo com maior tempo de espera\n"
                            + "3. Exibir fila de processos\n"
                            + "4. Sair\n"
                            + "Digite a sua opção: ");

            if (opcao != null) {
                try {
                    int opcaoInt = Integer.parseInt(opcao);
                    switch (opcaoInt) {
                        case 1:
                            incluirProcesso();
                            break;
                        case 2:
                            removerProcesso();
                            break;
                        case 3:
                            exibirFila();
                            break;
                        case 4:
                            System.out.println("Saindo...");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Digite um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } while (!opcao.equals("4"));

    }

    private static void incluirProcesso() {
        String idProcessoStr = JOptionPane.showInputDialog(null,
                "Digite o identificador do processo:");

        if (idProcessoStr != null) {
            try {
                int idProcesso = Integer.parseInt(idProcessoStr);
                if (filaProcessos.cheia()) {
                    JOptionPane.showMessageDialog(null, "Fila cheia! Processo não foi incluído.", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    filaProcessos.enfileirar(idProcesso);
                    JOptionPane.showMessageDialog(null, "Processo " + idProcesso + " incluído na fila!");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }


    private static void removerProcesso() {
        if (filaProcessos.vazia()) {
            JOptionPane.showMessageDialog(null, "Fila vazia! Nenhum processo foi removido.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            int maiorTempoEspera = Integer.MIN_VALUE;
            int indiceMaiorTempoEspera = 0;

            // Encontrar o índice do processo com o maior tempo de espera
            for (int i = 0; i < filaProcessos.total; i++) {
                if (filaProcessos.vetor[i] > maiorTempoEspera) {
                    maiorTempoEspera = filaProcessos.vetor[i];
                    indiceMaiorTempoEspera = i;
                }
            }

            // Remover o processo com o maior tempo de espera
            int idProcessoRemovido = Integer.parseInt(filaProcessos.desenfileirar());
            JOptionPane.showMessageDialog(null, "Processo " + idProcessoRemovido + " removido da fila!");
        }
    }






    private static void exibirFila() {
        if (filaProcessos.vazia()) {
            JOptionPane.showMessageDialog(null, "Fila vazia!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            String conteudoFila = "Conteúdo da fila de processos:\n";
            for (int i = 0; i < filaProcessos.total; i++) {
                conteudoFila += "Posição " + i + " ID do processo: " + filaProcessos.vetor[i] + "\n";
            }
            JOptionPane.showMessageDialog(null, conteudoFila);
        }
    }

}
